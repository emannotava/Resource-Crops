package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Sounds;
import com.mememan.resourcecrops.lib.Strings;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlock {

	public static final Block DEBUGBLOCK = new DebugBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block ORE_THURSTON = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block ESSENCE_TIER_1_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_2_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_3_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_4_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_5_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_6_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_CREATIVE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_INFINITY_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	
	public static final Block MACHINE_FRAME_COAL = new Block(FabricBlockSettings.of(Material.STONE).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.STONE));
	public static final Block MACHINE_FRAME_DIAMOND = new Block(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_EMERALD = new Block(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_GOLD = new Block(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_IRON = new Block(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_LAPIS = new Block(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_NETHERITE = new Block(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.NETHERITE));
	public static final Block MACHINE_FRAME_REDSTONE = new Block(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));

	public static void initialize(){
		addBlock("debug_block", DEBUGBLOCK, Main.GROUPMAIN);
		addBlock("ore_thurston", ORE_THURSTON, Main.GROUPMAIN);
		addBlock("essence_tier_1_block", ESSENCE_TIER_1_BLOCK, Main.GROUPMAIN);
		addBlock("essence_tier_2_block", ESSENCE_TIER_2_BLOCK, Main.GROUPMAIN);
		addBlock("essence_tier_3_block", ESSENCE_TIER_3_BLOCK, Main.GROUPMAIN);
		addBlock("essence_tier_4_block", ESSENCE_TIER_4_BLOCK, Main.GROUPMAIN);
		addBlock("essence_tier_5_block", ESSENCE_TIER_5_BLOCK, Main.GROUPMAIN);
		addBlock("essence_tier_6_block", ESSENCE_TIER_6_BLOCK, Main.GROUPMAIN);
		addBlock("essence_tier_creative_block", ESSENCE_TIER_CREATIVE_BLOCK, Main.GROUPMAIN);
		addBlock("essence_tier_infinity_block", ESSENCE_TIER_INFINITY_BLOCK, Main.GROUPMAIN);
		addBlock("machine_frame/coal", MACHINE_FRAME_COAL, Main.GROUPEXPERIMENTAL);
		addBlock("machine_frame/diamond", MACHINE_FRAME_DIAMOND, Main.GROUPEXPERIMENTAL);
		addBlock("machine_frame/emerald", MACHINE_FRAME_EMERALD, Main.GROUPEXPERIMENTAL);
		addBlock("machine_frame/gold", MACHINE_FRAME_GOLD, Main.GROUPEXPERIMENTAL);
		addBlock("machine_frame/iron", MACHINE_FRAME_IRON, Main.GROUPEXPERIMENTAL);
		addBlock("machine_frame/lapis", MACHINE_FRAME_LAPIS, Main.GROUPEXPERIMENTAL);
		addBlock("machine_frame/netherite", MACHINE_FRAME_NETHERITE, Main.GROUPEXPERIMENTAL);
		addBlock("machine_frame/redstone", MACHINE_FRAME_REDSTONE, Main.GROUPEXPERIMENTAL);
	}

	public static void addBlock(String blockName, Block BlockDeclaration, ItemGroup creativeTab){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), BlockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(BlockDeclaration, new FabricItemSettings().group(creativeTab)));
	}

	public static void addBlock(String blockName, Block BlockDeclaration){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), BlockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(BlockDeclaration, new FabricItemSettings()));
	}
}
