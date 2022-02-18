package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Init;

public class BlockTags {

    public static final Tag.Identified<Block> LADDERS = create("ladders");
    public static final Tag.Identified<Block> TORCHES = create("torches");
    public static final Tag.Identified<Block> REDSTONE_TORCHES = create("redstone_torches");
    public static final Tag.Identified<Block> SOUL_TORCHES = create("soul_torches");
    public static final Tag.Identified<Block> WALL_TORCHES = create("wall_torches");
    public static final Tag.Identified<Block> WALL_REDSTONE_TORCHES = create("wall_redstone_torches");
    public static final Tag.Identified<Block> WALL_SOUL_TORCHES = create("wall_soul_torches");
    public static final Tag.Identified<Block> GRINDSTONES = create("grindstones");
    private BlockTags() {
        return;
    }
    private static Tag.Identified<Block> create(String path) {
        return TagFactory.BLOCK.create(new Identifier(Init.MOD_ID, path));
    }
}
