package net.xanthian.vsas.util;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModel extends Models {

    public static final Model BOW;
    public static final Model CAMPFIRE;
    public static final Model CAMPFIRE_OFF;
    public static final Model GRINDSTONE;
    public static final Model LADDER;
    public static final Model LEVER;
    public static final Model LEVER_ON;

    public static Identifier getBowItem(String id) {
        return new Identifier("vsas", "item/bows/" + id);
    }
    public static Identifier getCampfireBlock(String id) {
        return new Identifier("vsas", "block/campfires/" + id);
    }
    public static Identifier getGrindstoneBlockId(String id) {
        return new Identifier("vsas", "block/grindstones/" + id);
    }
    public static Identifier getLadderBlockId(String id) {
        return new Identifier("vsas", "block/ladders/" + id);
    }
    public static Identifier getLeverBlockId(String id) {
        return new Identifier("vsas", "block/levers/" + id);
    }

    private static Model createBowModel(String parent,TextureKey... requiredTextures) {
        return new Model(Optional.of(getBowItem(parent)), Optional.empty(), requiredTextures);
    }

    private static Model createCampfireModel(String parent,TextureKey... requiredTextures) {
        return new Model(Optional.of(getCampfireBlock(parent)), Optional.empty(), requiredTextures);
    }
    private static Model createGrindstoneModel(TextureKey... requiredTextures) {
        return new Model(Optional.of(getGrindstoneBlockId("grindstone")), Optional.empty(), requiredTextures);
    }
    private static Model createLadderModel(TextureKey... requiredTextures) {
        return new Model(Optional.of(getLadderBlockId("ladder")), Optional.empty(), requiredTextures);
    }
    private static Model createLeverModel(String parent, TextureKey... requiredTextures) {
        return new Model(Optional.of(getLeverBlockId(parent)), Optional.empty(), requiredTextures);
    }

    static {;
        BOW = createBowModel("bow",TextureKey.LAYER0);
        CAMPFIRE = createCampfireModel("campfire", TextureKey.PARTICLE, TextureKey.FIRE, TextureKey.LIT_LOG, ModTextureKey.LOG);
        CAMPFIRE_OFF = createCampfireModel("campfire_off", TextureKey.PARTICLE, ModTextureKey.LOG);
        GRINDSTONE = createGrindstoneModel(ModTextureKey.PIVOT, TextureKey.SIDE, ModTextureKey.ROUND, ModTextureKey.LEG,  TextureKey.PARTICLE);
        LADDER = createLadderModel( TextureKey.PARTICLE, TextureKey.TEXTURE);
        LEVER = createLeverModel("lever", TextureKey.PARTICLE, ModTextureKey.BASE, ModTextureKey.LEVER);
        LEVER_ON = createLeverModel("lever_on", TextureKey.PARTICLE, ModTextureKey.BASE, ModTextureKey.LEVER);
    }
}