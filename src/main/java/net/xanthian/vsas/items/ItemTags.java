package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Init;

public class ItemTags {

    public static final Tag.Identified<Item> STICKS = create("sticks");
    public static final Tag.Identified<Item> FISHING_RODS = create("fishing_rods");
    public static final Tag.Identified<Item> BOWS = create("bows");
    public static final Tag.Identified<Item> LADDERS = create("ladders");
    public static final Tag.Identified<Item> TORCHES = create("torches");
    public static final Tag.Identified<Item> SOUL_TORCHES = create("soul_torches");
    private ItemTags() {
        return;
    }
    private static Tag.Identified<Item> create(String path) {
        return TagFactory.ITEM.create(new Identifier(Init.MOD_ID, path));
    }
}
