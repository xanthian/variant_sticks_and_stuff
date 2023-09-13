package net.xanthian.vsas.util;

import net.minecraft.data.client.TextureKey;

public class ModTextureKey {

    public static final TextureKey SIDES;
    public static final TextureKey BASE;
    public static final TextureKey PIVOT;
    public static final TextureKey ROUND;
    public static final TextureKey LEG;
    public static final TextureKey LEVER;
    public static final TextureKey LOG;

    static {
        SIDES = TextureKey.of("sides");
        BASE = TextureKey.of("base");
        PIVOT = TextureKey.of("pivot");
        ROUND = TextureKey.of("round");
        LEG = TextureKey.of("leg");
        LEVER = TextureKey.of("lever");
        LOG = TextureKey.of("log");
    }
}