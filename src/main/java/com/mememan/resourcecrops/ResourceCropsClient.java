package com.mememan.resourcecrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static com.mememan.resourcecrops.Main.crops;

@Environment(EnvType.CLIENT)
public class ResourceCropsClient implements ClientModInitializer{
	
	@Override
    public void onInitializeClient() {
        crops.forEach(this::registerCropRender);
		System.out.println("Resource Crops(Client-Side) has been initialized!");
    }

	public void registerCropRender(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
	}
}
