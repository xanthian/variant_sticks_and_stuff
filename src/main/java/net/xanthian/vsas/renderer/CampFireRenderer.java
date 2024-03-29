package net.xanthian.vsas.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3f;
import net.xanthian.vsas.blocks.VariantCampFireBlock;
import net.xanthian.vsas.entity.CampFireBlockEntity;

@Environment(EnvType.CLIENT)
public class CampFireRenderer implements BlockEntityRenderer<CampFireBlockEntity> {
    private final ItemRenderer itemRenderer;

    public CampFireRenderer(BlockEntityRendererFactory.Context ctx) {
        this.itemRenderer = ctx.getItemRenderer();
    }

    // Taken & amended from MC CampfireBlockEntityRenderer.class
    @Override
    public void render(CampFireBlockEntity campfireBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
        Direction direction = campfireBlockEntity.getCachedState().get(VariantCampFireBlock.FACING);
        DefaultedList<ItemStack> defaultedList = campfireBlockEntity.getInventory();
        int k = (int) campfireBlockEntity.getPos().asLong();
        for (int l = 0; l < defaultedList.size(); ++l) {
            ItemStack itemStack = defaultedList.get(l);
            if (itemStack == ItemStack.EMPTY) continue;
            matrixStack.push();
            matrixStack.translate(0.5, 0.44921875, 0.5);
            Direction direction2 = Direction.fromHorizontal((l + direction.getHorizontal()) % 4);
            float g = -direction2.asRotation();
            matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(g));
            matrixStack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(90.0f));
            matrixStack.translate(-0.3125, -0.3125, 0.0);
            matrixStack.scale(0.375f, 0.375f, 0.375f);
            this.itemRenderer.renderItem(itemStack, ModelTransformation.Mode.FIXED, i, j, matrixStack, vertexConsumerProvider, k + l);
            //MinecraftClient.getInstance().getItemRenderer().renderItem(itemStack, ModelTransformation.Mode.FIXED, i, j, matrixStack, vertexConsumerProvider, k + l);
            matrixStack.pop();
        }
    }
}
