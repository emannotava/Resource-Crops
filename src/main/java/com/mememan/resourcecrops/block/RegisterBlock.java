package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.block.machine.MachineFrame;
import com.mememan.resourcecrops.lib.HexColors;
import com.mememan.resourcecrops.lib.Mods;
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

import static com.mememan.resourcecrops.Main.ores;
import static com.mememan.resourcecrops.Main.machines;
import static com.mememan.resourcecrops.Main.cutOutBlocks;

public class RegisterBlock {

	public static final Block DEBUG_BLOCK = new DebugBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	// public static final Block DEBUG_BLOCK_TEMPLE = new DebugBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block DEBUG_BLOCK_CROP_STAGE_0 = new DebugBlock(FabricBlockSettings.of(Material.PLANT).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block DEBUG_BLOCK_CROP_STAGE_1 = new DebugBlock(FabricBlockSettings.of(Material.PLANT).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block DEBUG_BLOCK_CROP_STAGE_2 = new DebugBlock(FabricBlockSettings.of(Material.PLANT).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block DEBUG_BLOCK_CROP_STAGE_3 = new DebugBlock(FabricBlockSettings.of(Material.PLANT).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block DEBUG_BLOCK_CROP_STAGE_4 = new DebugBlock(FabricBlockSettings.of(Material.PLANT).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block DEBUG_BLOCK_CROP_STAGE_5 = new DebugBlock(FabricBlockSettings.of(Material.PLANT).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block DEBUG_BLOCK_CROP_STAGE_6 = new DebugBlock(FabricBlockSettings.of(Material.PLANT).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block DEBUG_BLOCK_CROP_STAGE_7 = new DebugBlock(FabricBlockSettings.of(Material.PLANT).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block ORE_THURSTON = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).sounds(Sounds.THURSTON_BLOCK));
	public static final Block ESSENCE_TIER_1_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_2_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_3_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_4_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_5_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_6_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_CREATIVE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	public static final Block ESSENCE_TIER_INFINITY_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f));
	
	public static final Block METALLIC_ESSENCE_TIER_1_BLOCK = new BlockMetallicEssence("metallic_essence_block", "1", HexColors.TIER_1, 2.0F);
	public static final Block METALLIC_ESSENCE_TIER_2_BLOCK = new BlockMetallicEssence("metallic_essence_block", "2", HexColors.TIER_2, 4.0F);
	public static final Block METALLIC_ESSENCE_TIER_3_BLOCK = new BlockMetallicEssence("metallic_essence_block", "3", HexColors.TIER_3, 6.0F);
	public static final Block METALLIC_ESSENCE_TIER_4_BLOCK = new BlockMetallicEssence("metallic_essence_block", "4", HexColors.TIER_4, 8.0F);
	public static final Block METALLIC_ESSENCE_TIER_5_BLOCK = new BlockMetallicEssence("metallic_essence_block", "5", HexColors.TIER_5, 10.0F);
	public static final Block METALLIC_ESSENCE_TIER_6_BLOCK = new BlockMetallicEssence("metallic_essence_block", "6", HexColors.TIER_6, 12.0F);
	
	public static final Block JEB_WOOL = new Block(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(BlockSoundGroup.WOOL));
	public static final Block JEB_WOOL_CARPET = new CarpetBlock(FabricBlockSettings.of(Material.WOOL).strength(0.8f).sounds(BlockSoundGroup.WOOL).nonOpaque());
	
	public static final Block MACHINE_FRAME_COAL = new MachineFrame(FabricBlockSettings.of(Material.STONE).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.STONE));
	public static final Block MACHINE_FRAME_DIAMOND = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_EMERALD = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_GOLD = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_IRON = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_LAPIS = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_NETHERITE = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.NETHERITE));
	public static final Block MACHINE_FRAME_REDSTONE = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	
	public static void initialize(){
		if(Mods.checkDevEnv()){
			addBlock("debug_block/debug_block", DEBUG_BLOCK, Main.GROUP_EXPERIMENTAL);
			// addBlock("debug_block/temple/temple", DEBUG_BLOCK_TEMPLE, Main.GROUP_EXPERIMENTAL);
			addCutOutBlock("debug_block/crop/stage_0", DEBUG_BLOCK_CROP_STAGE_0, Main.GROUP_EXPERIMENTAL);
			addCutOutBlock("debug_block/crop/stage_1", DEBUG_BLOCK_CROP_STAGE_1, Main.GROUP_EXPERIMENTAL);
			addCutOutBlock("debug_block/crop/stage_2", DEBUG_BLOCK_CROP_STAGE_2, Main.GROUP_EXPERIMENTAL);
			addCutOutBlock("debug_block/crop/stage_3", DEBUG_BLOCK_CROP_STAGE_3, Main.GROUP_EXPERIMENTAL);
			addCutOutBlock("debug_block/crop/stage_4", DEBUG_BLOCK_CROP_STAGE_4, Main.GROUP_EXPERIMENTAL);
			addCutOutBlock("debug_block/crop/stage_5", DEBUG_BLOCK_CROP_STAGE_5, Main.GROUP_EXPERIMENTAL);
			addCutOutBlock("debug_block/crop/stage_6", DEBUG_BLOCK_CROP_STAGE_6, Main.GROUP_EXPERIMENTAL);
			addCutOutBlock("debug_block/crop/stage_7", DEBUG_BLOCK_CROP_STAGE_7, Main.GROUP_EXPERIMENTAL);
		}
		addBlock("ore_thurston", ORE_THURSTON, Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "stone", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "diorite", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "andesite", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "granite", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "netherrack", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "end_stone", Main.GROUP_MAIN);
		if(Mods.checkMod(Mods.Aether)){
			addOreBlock(Mods.AetherShort, "holystone", Main.GROUP_MAIN);
		}
		addBlock("essence_tier_" + Strings.TIER_1 + "_block", ESSENCE_TIER_1_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_" + Strings.TIER_2 + "_block", ESSENCE_TIER_2_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_" + Strings.TIER_3 + "_block", ESSENCE_TIER_3_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_" + Strings.TIER_4 + "_block", ESSENCE_TIER_4_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_" + Strings.TIER_5 + "_block", ESSENCE_TIER_5_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_" + Strings.TIER_6 + "_block", ESSENCE_TIER_6_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_" + Strings.TIER_INFINITY + "_block", ESSENCE_TIER_INFINITY_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_" + Strings.TIER_CREATIVE + "_block", ESSENCE_TIER_CREATIVE_BLOCK, Main.GROUP_MAIN);
		addBlock("jeb_wool", JEB_WOOL, ItemGroup.BUILDING_BLOCKS);
		addCutOutBlock("jeb_wool_carpet", JEB_WOOL_CARPET, ItemGroup.DECORATIONS);
		addMachineBlock("machine_frame/coal", MACHINE_FRAME_COAL, Main.GROUP_EXPERIMENTAL);
		addMachineBlock("machine_frame/diamond", MACHINE_FRAME_DIAMOND, Main.GROUP_EXPERIMENTAL);
		addMachineBlock("machine_frame/emerald", MACHINE_FRAME_EMERALD, Main.GROUP_EXPERIMENTAL);
		addMachineBlock("machine_frame/gold", MACHINE_FRAME_GOLD, Main.GROUP_EXPERIMENTAL);
		addMachineBlock("machine_frame/iron", MACHINE_FRAME_IRON, Main.GROUP_EXPERIMENTAL);
		addMachineBlock("machine_frame/lapis", MACHINE_FRAME_LAPIS, Main.GROUP_EXPERIMENTAL);
		addMachineBlock("machine_frame/netherite", MACHINE_FRAME_NETHERITE, Main.GROUP_EXPERIMENTAL);
		addMachineBlock("machine_frame/redstone", MACHINE_FRAME_REDSTONE, Main.GROUP_EXPERIMENTAL);
	}

	public static void addBlock(String blockName, Block blockDeclaration, ItemGroup creativeTab){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), blockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(blockDeclaration, new FabricItemSettings().group(creativeTab)));
	}
	public static void addMachineBlock(String blockName, Block blockDeclaration, ItemGroup creativeTab){
		machines.add(blockDeclaration);
		addBlock(blockName, blockDeclaration, creativeTab);
	}

	public static void addOreBlock(String modName, String baseName, ItemGroup creativeTab){
		Block ORE_1 = new BlockOre(Strings.TIER_1, 2.0F, HexColors.TIER_1); ores.add(ORE_1);
		Block ORE_2 = new BlockOre(Strings.TIER_2, 4.0F, HexColors.TIER_2); ores.add(ORE_2);
		Block ORE_3 = new BlockOre(Strings.TIER_3, 6.0F, HexColors.TIER_3); ores.add(ORE_3);
		Block ORE_4 = new BlockOre(Strings.TIER_4, 8.0F, HexColors.TIER_4); ores.add(ORE_4);
		Block ORE_5 = new BlockOre(Strings.TIER_5, 10.0F, HexColors.TIER_5); ores.add(ORE_5);
		Block ORE_6 = new BlockOre(Strings.TIER_6, 12.0F, HexColors.TIER_6); ores.add(ORE_6);

		Registry.register(Registry.BLOCK, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_1"), ORE_1); Registry.register(Registry.ITEM, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_1"), new BlockItem(ORE_1, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.BLOCK, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_2"), ORE_2); Registry.register(Registry.ITEM, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_2"), new BlockItem(ORE_2, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.BLOCK, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_3"), ORE_3); Registry.register(Registry.ITEM, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_3"), new BlockItem(ORE_3, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.BLOCK, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_4"), ORE_4); Registry.register(Registry.ITEM, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_4"), new BlockItem(ORE_4, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.BLOCK, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_5"), ORE_5); Registry.register(Registry.ITEM, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_5"), new BlockItem(ORE_5, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.BLOCK, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_6"), ORE_6); Registry.register(Registry.ITEM, new Identifier(Mods.ResourceCrops, "ore/" + modName + "/" + baseName + "_tier_6"), new BlockItem(ORE_6, new FabricItemSettings().group(creativeTab)));
	}

	public static void addBlock(String blockName, Block blockDeclaration){
		addBlock(blockName, blockDeclaration, Main.GROUP_MAIN);
	}
	public static void addCutOutBlock(String blockName, Block blockDeclaration, ItemGroup creativeTab){
		cutOutBlocks.add(blockDeclaration);
		addBlock(blockName, blockDeclaration, creativeTab);
	}
}
