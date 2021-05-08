package com.mememan.resourcecrops.entity.render;

import com.mememan.resourcecrops.entity.EntityGoldenRainbowChicken;
import com.mememan.resourcecrops.entity.model.ModelRainbowChicken;
import com.mememan.resourcecrops.lib.Mods;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class RenderGoldenRainbowChicken extends MobEntityRenderer<EntityGoldenRainbowChicken, ModelRainbowChicken<EntityGoldenRainbowChicken>> {
   private static final Identifier TEXTURE = new Identifier(Mods.ResourceCrops, "textures/entity/golden_rainbow_chicken.png");

   public RenderGoldenRainbowChicken(EntityRenderDispatcher entityRenderDispatcher) {
      super(entityRenderDispatcher, new ModelRainbowChicken(), 0.3F);
   }

   public Identifier getTexture(EntityGoldenRainbowChicken chickenEntity) {
      return TEXTURE;
   }

   protected float getAnimationProgress(EntityGoldenRainbowChicken chickenEntity, float f) {
      float g = MathHelper.lerp(f, chickenEntity.prevFlapProgress, chickenEntity.flapProgress);
      float h = MathHelper.lerp(f, chickenEntity.prevMaxWingDeviation, chickenEntity.maxWingDeviation);
      return (MathHelper.sin(g) + 1.0F) * h;
   }
}
