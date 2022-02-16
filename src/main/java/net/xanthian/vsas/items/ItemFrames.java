package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.AbstractDecorationEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFrameItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Group;
import net.xanthian.vsas.Init;

public class ItemFrames extends ItemFrameItem {
    public ItemFrames(EntityType<? extends AbstractDecorationEntity> entityType, Settings settings) {
        super(entityType, settings);
    }
  //  public static final Item ACACIA_ITEM_FRAME = registerItem("acacia_item_frame", new ItemFrames(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),true);

    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 100);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
}
