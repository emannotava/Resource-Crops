package com.mememan.resourcecrops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static com.mememan.resourcecrops.Main.crops;

import com.mememan.resourcecrops.block.RegisterBlock;

@Environment(EnvType.CLIENT)
public class ResourceCropsClient implements ClientModInitializer{
	
	@Override
    public void onInitializeClient() {
        crops.forEach(this::registerTranslucentRender);
		registerCutOutRender(RegisterBlock.MACHINE_FRAME_COAL);
		registerCutOutRender(RegisterBlock.MACHINE_FRAME_DIAMOND);
		registerCutOutRender(RegisterBlock.MACHINE_FRAME_EMERALD);
		registerCutOutRender(RegisterBlock.MACHINE_FRAME_GOLD);
		registerCutOutRender(RegisterBlock.MACHINE_FRAME_IRON);
		registerCutOutRender(RegisterBlock.MACHINE_FRAME_LAPIS);
		registerCutOutRender(RegisterBlock.MACHINE_FRAME_NETHERITE);
		registerCutOutRender(RegisterBlock.MACHINE_FRAME_REDSTONE);
		System.out.println("Resource Crops(Client-Side) has been initialized!");
    }

	public void registerTranslucentRender(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
	}
	public void registerCutOutRender(Block block){
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
	}
}
