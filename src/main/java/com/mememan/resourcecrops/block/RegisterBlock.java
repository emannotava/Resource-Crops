package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.block.machine.MachineFrame;
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
	
	public static final Block MACHINE_FRAME_COAL = new MachineFrame(FabricBlockSettings.of(Material.STONE).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.STONE));
	public static final Block MACHINE_FRAME_DIAMOND = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_EMERALD = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_GOLD = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_IRON = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_LAPIS = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_NETHERITE = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.NETHERITE));
	public static final Block MACHINE_FRAME_REDSTONE = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));

	public static void initialize(){
		addBlock("debug_block", DEBUGBLOCK, Main.GROUP_MAIN);
		addBlock("ore_thurston", ORE_THURSTON, Main.GROUP_MAIN);
		addBlock("essence_tier_1_block", ESSENCE_TIER_1_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_2_block", ESSENCE_TIER_2_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_3_block", ESSENCE_TIER_3_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_4_block", ESSENCE_TIER_4_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_5_block", ESSENCE_TIER_5_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_6_block", ESSENCE_TIER_6_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_creative_block", ESSENCE_TIER_CREATIVE_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_infinity_block", ESSENCE_TIER_INFINITY_BLOCK, Main.GROUP_MAIN);
		addBlock("machine_frame/coal", MACHINE_FRAME_COAL, Main.GROUP_EXPERIMENTAL);
		addBlock("machine_frame/diamond", MACHINE_FRAME_DIAMOND, Main.GROUP_EXPERIMENTAL);
		addBlock("machine_frame/emerald", MACHINE_FRAME_EMERALD, Main.GROUP_EXPERIMENTAL);
		addBlock("machine_frame/gold", MACHINE_FRAME_GOLD, Main.GROUP_EXPERIMENTAL);
		addBlock("machine_frame/iron", MACHINE_FRAME_IRON, Main.GROUP_EXPERIMENTAL);
		addBlock("machine_frame/lapis", MACHINE_FRAME_LAPIS, Main.GROUP_EXPERIMENTAL);
		addBlock("machine_frame/netherite", MACHINE_FRAME_NETHERITE, Main.GROUP_EXPERIMENTAL);
		addBlock("machine_frame/redstone", MACHINE_FRAME_REDSTONE, Main.GROUP_EXPERIMENTAL);
	}

	public static void addBlock(String blockName, Block blockDeclaration, ItemGroup creativeTab){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), blockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(blockDeclaration, new FabricItemSettings().group(creativeTab)));
	}

	public static void addBlock(String blockName, Block blockDeclaration){
		addBlock(blockName, blockDeclaration, Main.GROUP_MAIN);
	}
}
