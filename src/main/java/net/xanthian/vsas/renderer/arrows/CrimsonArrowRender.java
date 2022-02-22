package net.xanthian.vsas.renderer.arrows;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.entity.arrows.CrimsonArrowEntity;

@Environment(EnvType.CLIENT)
public class CrimsonArrowRender extends ProjectileEntityRenderer<CrimsonArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("vsas:textures/entity/arrows/crimson_arrow.png");

    public CrimsonArrowRender(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(CrimsonArrowEntity entity) {
        return TEXTURE;
    }
}
