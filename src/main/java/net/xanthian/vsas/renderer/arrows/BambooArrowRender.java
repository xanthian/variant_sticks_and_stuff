package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.entity.arrows.BambooArrowEntity;

@Environment(EnvType.CLIENT)
public class BambooArrowRender extends ProjectileEntityRenderer<BambooArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/bamboo_arrow.png");

    public BambooArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(BambooArrowEntity entity) {
        return TEXTURE;
    }
}