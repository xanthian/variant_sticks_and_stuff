package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import net.xanthian.vsas.entity.CampFireBlockEntity;

import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;

public class VariantCampFireBlock extends CampfireBlock implements Waterloggable {
    private final boolean smoke;
    private final int fireDamage;

    public VariantCampFireBlock(int fireDamage) {
        super(true, fireDamage , FabricBlockSettings.copyOf(Blocks.CAMPFIRE));
        this.smoke = true;
        this.fireDamage = fireDamage;
    }

    public static void extinguish(World world, BlockPos pos, BlockState state) {
        if (world.isClient() && state.get(LIT)) {
            for (int i = 0; i < 20; ++i) {
                spawnSmokeParticles(world, pos, state.get(SIGNAL_FIRE), true);
            }
            world.setBlockState(pos, state.with(LIT, false), 3);
            world.updateNeighbors(pos, state.getBlock());
        }
        BlockEntity tileentity = world.getBlockEntity(pos);
        if (tileentity instanceof CampFireBlockEntity te) {
            te.dropAllItems();
        }
    }

    public static void spawnSmokeParticles(World worldIn, BlockPos pos, boolean isSignalFire, boolean spawnExtraSmoke) {
        net.minecraft.util.math.random.Random random = worldIn.getRandom();
        DefaultParticleType basicparticletype = isSignalFire ? ParticleTypes.CAMPFIRE_SIGNAL_SMOKE : ParticleTypes.CAMPFIRE_COSY_SMOKE;
        worldIn.addParticle(basicparticletype, true, (double) pos.getX() + 0.5D + random.nextDouble() / 3.0D * (double) (random.nextBoolean() ? 1 : -1), (double) pos.getY() + random.nextDouble() + random.nextDouble(), (double) pos.getZ() + 0.5D + random.nextDouble() / 3.0D * (double) (random.nextBoolean() ? 1 : -1), 0.0D, 0.07D, 0.0D);
        if (spawnExtraSmoke) {
            worldIn.addParticle(ParticleTypes.SMOKE, (double) pos.getX() + 0.25D + random.nextDouble() / 2.0D * (double) (random.nextBoolean() ? 1 : -1), (double) pos.getY() + 0.4D, (double) pos.getZ() + 0.25D + random.nextDouble() / 2.0D * (double) (random.nextBoolean() ? 1 : -1), 0.0D, 0.005D, 0.0D);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
        BlockEntity tileentity = worldIn.getBlockEntity(pos);
        if (tileentity instanceof CampFireBlockEntity campFireBlockEntity) {
            ItemStack itemstack = player.getStackInHand(handIn);
            Optional<CampfireCookingRecipe> optional = campFireBlockEntity.findMatchingRecipe(itemstack);
            if (optional.isPresent()) {
                if (!worldIn.isClient && campFireBlockEntity.addItem(player.getAbilities().creativeMode ? itemstack.copy() : itemstack, optional.get().getCookTime())) {
                    player.increaseStat(Stats.INTERACT_WITH_CAMPFIRE, 1);
                    return ActionResult.SUCCESS;
                }
                return ActionResult.CONSUME;
            }
        }
        return ActionResult.PASS;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entityIn) {
        if (!entityIn.isFireImmune() && state.get(LIT) && entityIn instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entityIn)) {
            entityIn.damage(DamageSource.IN_FIRE, (float) this.fireDamage);
        }
        super.onEntityCollision(state, world, pos, entityIn);
    }

    @Override
    public void onStateReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            BlockEntity tileentity = worldIn.getBlockEntity(pos);
            if (tileentity instanceof CampFireBlockEntity te) {
                ItemScatterer.spawn(worldIn, pos, te.getInventory());
            }
            super.onStateReplaced(state, worldIn, pos, newState, moved);
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        World iworld = context.getWorld();
        BlockPos blockpos = context.getBlockPos();
        boolean flag = iworld.getFluidState(blockpos).getFluid().matchesType(Fluids.WATER);
        return this.getDefaultState().with(WATERLOGGED, flag).with(SIGNAL_FIRE, this.isHayBlock(iworld.getBlockState(blockpos.down()))).with(LIT, !flag).with(FACING, context.getPlayerFacing());
    }

    boolean isHayBlock(BlockState stateIn) {
        return stateIn.isOf(Blocks.HAY_BLOCK);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.DOWN) {
            return state.with(SIGNAL_FIRE, this.isHayBlock(neighborState));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public void randomDisplayTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (!canBeLit(stateIn, worldIn, pos)) {
            extinguish(worldIn, pos, stateIn);
            worldIn.updateListeners(pos, stateIn, stateIn, 3);
        }
        if (stateIn.get(LIT)) {
            if (rand.nextInt(10) == 0) {
                worldIn.playSound((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.6F, false);
            }
            if (this.smoke && rand.nextInt(5) == 0) {
                for (int i = 0; i < rand.nextInt(1) + 1; ++i) {
                    worldIn.addParticle(ParticleTypes.LAVA, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, rand.nextFloat() / 2.0F, 5.0E-5D, rand.nextFloat() / 2.0F);
                }
            }
        }
    }

    public boolean canBeLit(BlockState state, World world, BlockPos pos) {
        return !state.get(WATERLOGGED) ;
    }

    public void toggleLight(World worldIn, BlockState state, BlockPos pos) {
        state = state.with(LIT, !state.get(LIT));
        worldIn.setBlockState(pos, state, 2);
        if (!state.get(LIT)) {
            worldIn.playSound(null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.3f, 1.0f);
        }
        worldIn.updateNeighbors(pos, this);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return (level1, blockPos, blockState, t) -> {
            if (t instanceof CampFireBlockEntity tile) {
                if (level1.isClient()) {
                    tile.clientTick();
                } else {
                    tile.serverTick();
                }
            }
        };
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CampFireBlockEntity(pos, state);
    }

    public RenderLayer getCustomRenderType() {
        return RenderLayer.getCutoutMipped();
    }
}