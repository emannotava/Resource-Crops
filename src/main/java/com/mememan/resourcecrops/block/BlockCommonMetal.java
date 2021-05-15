package com.mememan.resourcecrops.block;

import static com.mememan.resourcecrops.Main.ASSETS;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.lib.tex.ResourceCropsTex;
import com.mememan.resourcecrops.registry.RegisterBlockStates;
import com.mememan.resourcecrops.util.color.Color;
import com.mememan.resourcecrops.util.text.Humanify;

import net.devtech.arrp.json.blockstate.JState;
import net.devtech.arrp.json.models.JModel;
// import net.fabricmc.api.EnvType;
// import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
// import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockCommonMetal extends Block{

	public String NAME = "Meow";
	public String NAME_INGOT = "Meow";
	public String NAME_HUMANIFY = "Meow";
	public static FabricItemSettings ITEM_SETTINGS(){
		return new FabricItemSettings().group(Main.GROUP_MAIN);
	}
	public static FabricBlockSettings BLOCK_SETTINGS(){
		return FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL);
	}

	public BlockCommonMetal(String name, int hex){
		super(BLOCK_SETTINGS());
		NAME = "common_metal/" + name + "_block";
		NAME_INGOT = "common_metal/" + name + "_ingot";
		NAME_HUMANIFY = name;
		addBlock(NAME, this, Main.GROUP_MAIN);
		JState blockstate = JState.state(RegisterBlockStates.defaulVariant(JState.model("resourcecrops:block/" + NAME)));
		ASSETS.addBlockState(blockstate, new Identifier(Strings.modId, NAME));
		ASSETS.addModel(JModel.modelKeepElements(Strings.modId + ":block/templates/tinted_top_down_block").textures(JModel.textures().var("side", ResourceCropsTex.COMMON_METAL_SIDE).var("top", ResourceCropsTex.COMMON_METAL_TOP).var("bottom", ResourceCropsTex.COMMON_METAL_BOTTOM).var("particle", ResourceCropsTex.COMMON_METAL_SIDE)), new Identifier(Mods.ResourceCrops, "block/" + NAME));
		ASSETS.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":block/" + NAME), new Identifier(Mods.ResourceCrops + ":item/" + NAME));
		Color.setBlockColor(hex, this);
		Color.setItemColor(hex, this);
	}

	@Override
	public String getTranslationKey(){
		return "Block of " + Humanify.convert(NAME_HUMANIFY);
	}

	public static void addBlock(String blockName, Block blockDeclaration, ItemGroup creativeTab){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), blockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(blockDeclaration, new FabricItemSettings().group(creativeTab)));
	}
	
}
