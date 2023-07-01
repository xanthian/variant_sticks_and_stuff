package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.entity.arrows.DarkOakArrowEntity;

@Environment(EnvType.CLIENT)
public class DarkOakArrowRender extends ProjectileEntityRenderer<DarkOakArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/dark_oak_arrow.png");

    public DarkOakArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(DarkOakArrowEntity entity) {
        return TEXTURE;
    }
}