package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.entity.arrows.BirchArrowEntity;

@Environment(EnvType.CLIENT)
public class BirchArrowRender extends ProjectileEntityRenderer<BirchArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/birch_arrow.png");

    public BirchArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(BirchArrowEntity entity) {
        return TEXTURE;
    }
}
