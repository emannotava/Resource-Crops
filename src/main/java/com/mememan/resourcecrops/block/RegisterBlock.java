package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Sounds;
import com.mememan.resourcecrops.lib.Strings;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlock {

	public static final Block DebugBlock = new DebugBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block ore_thurston = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block essence_tier_1_block = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block essence_tier_2_block = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block essence_tier_3_block = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block essence_tier_4_block = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block essence_tier_5_block = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block essence_tier_6_block = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block essence_tier_creative_block = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block essence_tier_infinite_block = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));

	public static void initialize(){
		addBlock("debug_block", DebugBlock, Main.resourcecrops_groupMain);
		addBlock("ore_thurston", ore_thurston, Main.resourcecrops_groupMain);
		addBlock("essence_tier_1_block", essence_tier_1_block, Main.resourcecrops_groupMain);
		addBlock("essence_tier_2_block", essence_tier_2_block, Main.resourcecrops_groupMain);
		addBlock("essence_tier_3_block", essence_tier_3_block, Main.resourcecrops_groupMain);
		addBlock("essence_tier_4_block", essence_tier_4_block, Main.resourcecrops_groupMain);
		addBlock("essence_tier_5_block", essence_tier_5_block, Main.resourcecrops_groupMain);
		addBlock("essence_tier_6_block", essence_tier_6_block, Main.resourcecrops_groupMain);
		addBlock("essence_tier_creative_block", essence_tier_creative_block, Main.resourcecrops_groupMain);
		addBlock("essence_tier_infinite_block", essence_tier_infinite_block, Main.resourcecrops_groupMain);
	}

	public static void addBlock(String blockName, Block BlockDeclaration, ItemGroup creativeTab){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), BlockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(BlockDeclaration, new FabricItemSettings().group(creativeTab)));
	}

	public static void addBlock(String blockName, Block BlockDeclaration){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), BlockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(BlockDeclaration, new FabricItemSettings()));
	}

	public static void addBlock(String blockName, Block BlockDeclaration, Boolean cutOut){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), BlockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(BlockDeclaration, new FabricItemSettings()));
		if(cutOut==true){
			BlockRenderLayerMap.INSTANCE.putBlock(BlockDeclaration, RenderLayer.getCutout());
		}
	}
}
