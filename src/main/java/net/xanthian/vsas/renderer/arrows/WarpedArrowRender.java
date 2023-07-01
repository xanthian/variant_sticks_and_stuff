package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.entity.arrows.WarpedArrowEntity;

@Environment(EnvType.CLIENT)
public class WarpedArrowRender extends ProjectileEntityRenderer<WarpedArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/warped_arrow.png");

    public WarpedArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(WarpedArrowEntity entity) {
        return TEXTURE;
    }
}