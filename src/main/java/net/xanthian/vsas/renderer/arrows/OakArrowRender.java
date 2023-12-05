package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.entity.arrows.OakArrowEntity;

@Environment(EnvType.CLIENT)
public class OakArrowRender extends ProjectileEntityRenderer<OakArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/oak_arrow.png");

    public OakArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(OakArrowEntity entity) {
        return TEXTURE;
    }
}