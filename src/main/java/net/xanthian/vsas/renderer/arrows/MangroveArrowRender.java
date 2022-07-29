package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.entity.arrows.MangroveArrowEntity;

@Environment(EnvType.CLIENT)
public class MangroveArrowRender extends ProjectileEntityRenderer<MangroveArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/mangrove_arrow.png");

    public MangroveArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(MangroveArrowEntity entity) {
        return TEXTURE;
    }
}
