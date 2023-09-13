package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.entity.arrows.CherryArrowEntity;

@Environment(EnvType.CLIENT)
public class CherryArrowRender extends ProjectileEntityRenderer<CherryArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/cherry_arrow.png");

    public CherryArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(CherryArrowEntity entity) {
        return TEXTURE;
    }
}