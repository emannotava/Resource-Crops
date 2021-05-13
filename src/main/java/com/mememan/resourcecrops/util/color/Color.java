package com.mememan.resourcecrops.util.color;

import com.mememan.resourcecrops.block.BlockCrop;

import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Color {
	public static void setBlockColor(int hex, Block blockDeclaration) {
		if(FabricLoader.getInstance().getEnvironmentType()==EnvType.CLIENT){
			ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> hex, blockDeclaration);
		}
	}
	public static void setBlockColor(int hex, BlockCrop blockDeclaration) {
		if(FabricLoader.getInstance().getEnvironmentType()==EnvType.CLIENT){
			ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> hex, blockDeclaration);
		}
	}
	public static void setItemColor(int hex, Item itemDeclaration) {
		if(FabricLoader.getInstance().getEnvironmentType()==EnvType.CLIENT){
			ColorProviderRegistry.ITEM.register((stack, tintIndex) -> hex, itemDeclaration);
		}
	}
	public static void setItemColor(int hex, Block itemDeclaration) {
		if(FabricLoader.getInstance().getEnvironmentType()==EnvType.CLIENT){
			ColorProviderRegistry.ITEM.register((stack, tintIndex) -> hex, itemDeclaration);
		}
	}
}
