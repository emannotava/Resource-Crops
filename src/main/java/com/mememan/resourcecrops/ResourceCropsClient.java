package com.mememan.resourcecrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static com.mememan.resourcecrops.Main.crops;
import static com.mememan.resourcecrops.Main.ores;

import com.mememan.resourcecrops.block.RegisterBlock;
import com.mememan.resourcecrops.entity.render.RenderGoldenRainbowChicken;
import com.mememan.resourcecrops.entity.render.RenderRainbowChicken;

import static com.mememan.resourcecrops.Main.machines;
import static com.mememan.resourcecrops.Main.cutOutBlocks;

// import com.mememan.resourcecrops.block.RegisterBlock;

@Environment(EnvType.CLIENT)
public class ResourceCropsClient implements ClientModInitializer{
	
	@Override
	public void onInitializeClient() {
		if(Main.ENABLE_SELF){
			EntityRendererRegistry.INSTANCE.register(Main.RAINBOW_CHICKEN_ENTITY, (dispatcher, context) -> {
				return new RenderRainbowChicken(dispatcher);
			});
			EntityRendererRegistry.INSTANCE.register(Main.GOLDEN_RAINBOW_CHICKEN_ENTITY, (dispatcher, context) -> {
				return new RenderGoldenRainbowChicken(dispatcher);
			});
			crops.forEach(this::registerTranslucentRender);
			ores.forEach(this::registerCutOutRender);
			machines.forEach(this::registerCutOutRender);
			cutOutBlocks.forEach(this::registerCutOutRender);
			registerTranslucentRender(RegisterBlock.ESSENCE_TIER_1_BLOCK);
			registerTranslucentRender(RegisterBlock.ESSENCE_TIER_2_BLOCK);
			registerTranslucentRender(RegisterBlock.ESSENCE_TIER_3_BLOCK);
			registerTranslucentRender(RegisterBlock.ESSENCE_TIER_4_BLOCK);
			registerTranslucentRender(RegisterBlock.ESSENCE_TIER_5_BLOCK);
			registerTranslucentRender(RegisterBlock.ESSENCE_TIER_6_BLOCK);
			registerTranslucentRender(RegisterBlock.ESSENCE_TIER_INFINITY_BLOCK);
			registerTranslucentRender(RegisterBlock.ESSENCE_TIER_CREATIVE_BLOCK);
			Main.LOGGER.info("Client-Side has been initialized!");
		}
	}

	public void registerTranslucentRender(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
	}
	public void registerCutOutRender(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
	}
}
