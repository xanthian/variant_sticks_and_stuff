package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.entity.arrows.AcaciaArrowEntity;

@Environment(EnvType.CLIENT)
public class AcaciaArrowRender extends ProjectileEntityRenderer<AcaciaArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/acacia_arrow.png");

    public AcaciaArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(AcaciaArrowEntity entity) {
        return TEXTURE;
    }
}
