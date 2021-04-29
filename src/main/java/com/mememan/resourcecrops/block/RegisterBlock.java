package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.block.machine.MachineFrame;
import com.mememan.resourcecrops.item.IngotCommonMetal;
import com.mememan.resourcecrops.item.NuggetCommonMetal;
import com.mememan.resourcecrops.lib.HexColors;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Sounds;
import com.mememan.resourcecrops.lib.Strings;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
	
	public static final Block MACHINE_FRAME_COAL = new MachineFrame(FabricBlockSettings.of(Material.STONE).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.STONE));
	public static final Block MACHINE_FRAME_DIAMOND = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_EMERALD = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_GOLD = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_IRON = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_LAPIS = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));
	public static final Block MACHINE_FRAME_NETHERITE = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.NETHERITE));
	public static final Block MACHINE_FRAME_REDSTONE = new MachineFrame(FabricBlockSettings.of(Material.METAL).strength(14.0f).nonOpaque().sounds(BlockSoundGroup.METAL));

	public static final Block COMMON_ALUMINIUM_BLOCK = new BlockCommonMetal("aluminium", HexColors.METALS.ALUMINIUM);
	public static final Block COMMON_BERYLLIUM_BLOCK = new BlockCommonMetal("beryllium", HexColors.METALS.BERYLLIUM);
	public static final Block COMMON_BISMUTH_BLOCK = new BlockCommonMetal("bismuth", HexColors.METALS.BISMUTH);
	public static final Block COMMON_CHROMIUM_BLOCK = new BlockCommonMetal("chromium", HexColors.METALS.CHROMIUM);
	public static final Block COMMON_COBALT_BLOCK = new BlockCommonMetal("cobalt", HexColors.METALS.COBALT);
	// public static final Block COMMON_COPPER_BLOCK = new BlockCommonMetal("copper", HexColors.METALS.COPPER);
	public static final Block COMMON_IRIDIUM_BLOCK = new BlockCommonMetal("iridium", HexColors.METALS.IRIDIUM);
	public static final Block COMMON_BRASS_BLOCK = new BlockCommonMetal("brass", HexColors.METALS.BRASS);
	public static final Block COMMON_BRONZE_BLOCK = new BlockCommonMetal("bronze", HexColors.METALS.BRONZE);
	public static final Block COMMON_GALLIUM_BLOCK = new BlockCommonMetal("gallium", HexColors.METALS.GALLIUM);
	public static final Block COMMON_INDIUM_BLOCK = new BlockCommonMetal("indium", HexColors.METALS.INDIUM);
	public static final Block COMMON_LEAD_BLOCK = new BlockCommonMetal("lead", HexColors.METALS.LEAD);
	public static final Block COMMON_MAGNESIUM_BLOCK = new BlockCommonMetal("magnesium", HexColors.METALS.MAGNESIUM);
	public static final Block COMMON_MANGANESE_BLOCK = new BlockCommonMetal("manganese", HexColors.METALS.MANGANESE);
	public static final Block COMMON_MERCURY_BLOCK = new BlockCommonMetal("mercury", HexColors.METALS.MERCURY);
	public static final Block COMMON_NICKEL_BLOCK = new BlockCommonMetal("nickel", HexColors.METALS.NICKEL);
	public static final Block COMMON_PLUTONIUM_BLOCK = new BlockCommonMetal("plutonium", HexColors.METALS.PLUTONIUM);
	public static final Block COMMON_POTASSIUM_BLOCK = new BlockCommonMetal("potassium", HexColors.METALS.POTASSIUM);
	public static final Block COMMON_RHODIUM_BLOCK = new BlockCommonMetal("rhodium", HexColors.METALS.RHODIUM);
	public static final Block COMMON_SAMARIUM_BLOCK = new BlockCommonMetal("samarium", HexColors.METALS.SAMARIUM);
	public static final Block COMMON_SCANDIUM_BLOCK = new BlockCommonMetal("scandium", HexColors.METALS.SCANDIUM);
	public static final Block COMMON_SILVER_BLOCK = new BlockCommonMetal("silver", HexColors.METALS.SILVER);
	public static final Block COMMON_SODIUM_BLOCK = new BlockCommonMetal("sodium", HexColors.METALS.SODIUM);
	public static final Block COMMON_TITANIUM_BLOCK = new BlockCommonMetal("titanium", HexColors.METALS.TITANIUM);
	public static final Block COMMON_TIN_BLOCK = new BlockCommonMetal("tin", HexColors.METALS.TIN);
	public static final Block COMMON_URANIUM_BLOCK = new BlockCommonMetal("uranium", HexColors.METALS.URANIUM);
	public static final Block COMMON_ZINC_BLOCK = new BlockCommonMetal("zinc", HexColors.METALS.ZINC);

	public static final Item COMMON_ALUMINIUM_INGOT = new IngotCommonMetal("aluminium", HexColors.METALS.ALUMINIUM);
	public static final Item COMMON_BERYLLIUM_INGOT = new IngotCommonMetal("beryllium", HexColors.METALS.BERYLLIUM);
	public static final Item COMMON_BISMUTH_INGOT = new IngotCommonMetal("bismuth", HexColors.METALS.BISMUTH);
	public static final Item COMMON_CHROMIUM_INGOT = new IngotCommonMetal("chromium", HexColors.METALS.CHROMIUM);
	public static final Item COMMON_COBALT_INGOT = new IngotCommonMetal("cobalt", HexColors.METALS.COBALT);
	// public static final Item COMMON_COPPER_INGOT = new IngotCommonMetal("copper", HexColors.METALS.COPPER);
	public static final Item COMMON_IRIDIUM_INGOT = new IngotCommonMetal("iridium", HexColors.METALS.IRIDIUM);
	public static final Item COMMON_BRASS_INGOT = new IngotCommonMetal("brass", HexColors.METALS.BRASS);
	public static final Item COMMON_BRONZE_INGOT = new IngotCommonMetal("bronze", HexColors.METALS.BRONZE);
	public static final Item COMMON_GALLIUM_INGOT = new IngotCommonMetal("gallium", HexColors.METALS.GALLIUM);
	public static final Item COMMON_INDIUM_INGOT = new IngotCommonMetal("indium", HexColors.METALS.INDIUM);
	public static final Item COMMON_LEAD_INGOT = new IngotCommonMetal("lead", HexColors.METALS.LEAD);
	public static final Item COMMON_MAGNESIUM_INGOT = new IngotCommonMetal("magnesium", HexColors.METALS.MAGNESIUM);
	public static final Item COMMON_MANGANESE_INGOT = new IngotCommonMetal("manganese", HexColors.METALS.MANGANESE);
	public static final Item COMMON_MERCURY_INGOT = new IngotCommonMetal("mercury", HexColors.METALS.MERCURY);
	public static final Item COMMON_NICKEL_INGOT = new IngotCommonMetal("nickel", HexColors.METALS.NICKEL);
	public static final Item COMMON_PLUTONIUM_INGOT = new IngotCommonMetal("plutonium", HexColors.METALS.PLUTONIUM);
	public static final Item COMMON_POTASSIUM_INGOT = new IngotCommonMetal("potassium", HexColors.METALS.POTASSIUM);
	public static final Item COMMON_RHODIUM_INGOT = new IngotCommonMetal("rhodium", HexColors.METALS.RHODIUM);
	public static final Item COMMON_SAMARIUM_INGOT = new IngotCommonMetal("samarium", HexColors.METALS.SAMARIUM);
	public static final Item COMMON_SCANDIUM_INGOT = new IngotCommonMetal("scandium", HexColors.METALS.SCANDIUM);
	public static final Item COMMON_SILVER_INGOT = new IngotCommonMetal("silver", HexColors.METALS.SILVER);
	public static final Item COMMON_SODIUM_INGOT = new IngotCommonMetal("sodium", HexColors.METALS.SODIUM);
	public static final Item COMMON_TITANIUM_INGOT = new IngotCommonMetal("titanium", HexColors.METALS.TITANIUM);
	public static final Item COMMON_TIN_INGOT = new IngotCommonMetal("tin", HexColors.METALS.TIN);
	public static final Item COMMON_URANIUM_INGOT = new IngotCommonMetal("uranium", HexColors.METALS.URANIUM);
	public static final Item COMMON_ZINC_INGOT = new IngotCommonMetal("zinc", HexColors.METALS.ZINC);

	public static final Item COMMON_ALUMINIUM_NUGGET = new NuggetCommonMetal("aluminium", HexColors.METALS.ALUMINIUM);
	public static final Item COMMON_BERYLLIUM_NUGGET = new NuggetCommonMetal("beryllium", HexColors.METALS.BERYLLIUM);
	public static final Item COMMON_BISMUTH_NUGGET = new NuggetCommonMetal("bismuth", HexColors.METALS.BISMUTH);
	public static final Item COMMON_CHROMIUM_NUGGET = new NuggetCommonMetal("chromium", HexColors.METALS.CHROMIUM);
	public static final Item COMMON_COBALT_NUGGET = new NuggetCommonMetal("cobalt", HexColors.METALS.COBALT);
	// public static final Item COMMON_COPPER_NUGGET = new NuggetCommonMetal("copper", HexColors.METALS.COPPER);
	public static final Item COMMON_IRIDIUM_NUGGET = new NuggetCommonMetal("iridium", HexColors.METALS.IRIDIUM);
	public static final Item COMMON_BRASS_NUGGET = new NuggetCommonMetal("brass", HexColors.METALS.BRASS);
	public static final Item COMMON_BRONZE_NUGGET = new NuggetCommonMetal("bronze", HexColors.METALS.BRONZE);
	public static final Item COMMON_GALLIUM_NUGGET = new NuggetCommonMetal("gallium", HexColors.METALS.GALLIUM);
	public static final Item COMMON_INDIUM_NUGGET = new NuggetCommonMetal("indium", HexColors.METALS.INDIUM);
	public static final Item COMMON_LEAD_NUGGET = new NuggetCommonMetal("lead", HexColors.METALS.LEAD);
	public static final Item COMMON_MAGNESIUM_NUGGET = new NuggetCommonMetal("magnesium", HexColors.METALS.MAGNESIUM);
	public static final Item COMMON_MANGANESE_NUGGET = new NuggetCommonMetal("manganese", HexColors.METALS.MANGANESE);
	public static final Item COMMON_MERCURY_NUGGET = new NuggetCommonMetal("mercury", HexColors.METALS.MERCURY);
	public static final Item COMMON_NICKEL_NUGGET = new NuggetCommonMetal("nickel", HexColors.METALS.NICKEL);
	public static final Item COMMON_PLUTONIUM_NUGGET = new NuggetCommonMetal("plutonium", HexColors.METALS.PLUTONIUM);
	public static final Item COMMON_POTASSIUM_NUGGET = new NuggetCommonMetal("potassium", HexColors.METALS.POTASSIUM);
	public static final Item COMMON_RHODIUM_NUGGET = new NuggetCommonMetal("rhodium", HexColors.METALS.RHODIUM);
	public static final Item COMMON_SAMARIUM_NUGGET = new NuggetCommonMetal("samarium", HexColors.METALS.SAMARIUM);
	public static final Item COMMON_SCANDIUM_NUGGET = new NuggetCommonMetal("scandium", HexColors.METALS.SCANDIUM);
	public static final Item COMMON_SILVER_NUGGET = new NuggetCommonMetal("silver", HexColors.METALS.SILVER);
	public static final Item COMMON_SODIUM_NUGGET = new NuggetCommonMetal("sodium", HexColors.METALS.SODIUM);
	public static final Item COMMON_TITANIUM_NUGGET = new NuggetCommonMetal("titanium", HexColors.METALS.TITANIUM);
	public static final Item COMMON_TIN_NUGGET = new NuggetCommonMetal("tin", HexColors.METALS.TIN);
	public static final Item COMMON_URANIUM_NUGGET = new NuggetCommonMetal("uranium", HexColors.METALS.URANIUM);
	public static final Item COMMON_ZINC_NUGGET = new NuggetCommonMetal("zinc", HexColors.METALS.ZINC);
	
	class COPPER{
		String NAME = "copper";
		int COLOR = HexColors.METALS.COPPER;
		public Block BLOCK = new BlockCommonMetal(NAME, COLOR);
		public Item INGOT = new IngotCommonMetal(NAME, COLOR);
		public Item NUGGET = new NuggetCommonMetal(NAME, COLOR);
	}
	
	public static void initialize(){
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
		addBlock("ore_thurston", ORE_THURSTON, Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "stone", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "diorite", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "andesite", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "granite", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "netherrack", Main.GROUP_MAIN);
		addOreBlock(Mods.VanillaShort, "end_stone", Main.GROUP_MAIN);
		addOreBlock(Mods.AetherShort, "holystone", Main.GROUP_MAIN);
		addBlock("essence_tier_1_block", ESSENCE_TIER_1_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_2_block", ESSENCE_TIER_2_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_3_block", ESSENCE_TIER_3_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_4_block", ESSENCE_TIER_4_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_5_block", ESSENCE_TIER_5_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_6_block", ESSENCE_TIER_6_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_creative_block", ESSENCE_TIER_CREATIVE_BLOCK, Main.GROUP_MAIN);
		addBlock("essence_tier_infinity_block", ESSENCE_TIER_INFINITY_BLOCK, Main.GROUP_MAIN);
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
		Block ORE_1 = new BlockOre(Strings.Tier1, 2.0F); ores.add(ORE_1);
		Block ORE_2 = new BlockOre(Strings.Tier2, 4.0F); ores.add(ORE_2);
		Block ORE_3 = new BlockOre(Strings.Tier3, 6.0F); ores.add(ORE_3);
		Block ORE_4 = new BlockOre(Strings.Tier4, 8.0F); ores.add(ORE_4);
		Block ORE_5 = new BlockOre(Strings.Tier5, 10.0F); ores.add(ORE_5);
		Block ORE_6 = new BlockOre(Strings.Tier6, 12.0F); ores.add(ORE_6);

		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_1"), ORE_1);
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_2"), ORE_2);
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_3"), ORE_3);
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_4"), ORE_4);
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_5"), ORE_5);
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_6"), ORE_6);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_1"), new BlockItem(ORE_1, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_2"), new BlockItem(ORE_2, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_3"), new BlockItem(ORE_3, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_4"), new BlockItem(ORE_4, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_5"), new BlockItem(ORE_5, new FabricItemSettings().group(creativeTab)));
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, "ore/" + modName + "/" + baseName + "_tier_6"), new BlockItem(ORE_6, new FabricItemSettings().group(creativeTab)));
	}

	public static void addBlock(String blockName, Block blockDeclaration){
		addBlock(blockName, blockDeclaration, Main.GROUP_MAIN);
	}
	public static void addCutOutBlock(String blockName, Block blockDeclaration, ItemGroup creativeTab){
		cutOutBlocks.add(blockDeclaration);
		addBlock(blockName, blockDeclaration, creativeTab);
	}
}
