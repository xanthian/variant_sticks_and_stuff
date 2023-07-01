package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.entity.arrows.JungleArrowEntity;

@Environment(EnvType.CLIENT)
public class JungleArrowRender extends ProjectileEntityRenderer<JungleArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/jungle_arrow.png");

    public JungleArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(JungleArrowEntity entity) {
        return TEXTURE;
    }
}