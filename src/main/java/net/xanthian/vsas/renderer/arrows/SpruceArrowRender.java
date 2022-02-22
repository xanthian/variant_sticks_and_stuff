package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.entity.arrows.SpruceArrowEntity;

@Environment(EnvType.CLIENT)
public class SpruceArrowRender extends ProjectileEntityRenderer<SpruceArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/spruce_arrow.png");

    public SpruceArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(SpruceArrowEntity entity) {
        return TEXTURE;
    }
}
