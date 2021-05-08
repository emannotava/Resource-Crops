package com.mememan.resourcecrops.lib;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.block.BlockCrop;
import com.mememan.resourcecrops.block.RegisterCrop;
// import com.mememan.resourcecrops.block.BlockCropBotaniaRune;
import com.mememan.resourcecrops.item.ItemEssence;
import com.mememan.resourcecrops.item.ItemSeeds;
// import com.mememan.resourcecrops.item.ItemSeedsBotaniaRune;
import com.mememan.resourcecrops.item.RegisterItem;
import com.mememan.resourcecrops.lib.ingredient.*;
import com.mememan.resourcecrops.lib.tex.*;
// import com.mememan.resourcecrops.loot.RegisterEntityLoot;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import static com.mememan.resourcecrops.registry.RegisterRecipe.Essence.*;
import static com.mememan.resourcecrops.config.ConfigDevEnv.MOD_SUPPORT.*;

public class Crops{

	public static final Boolean[] NO_RECIPE = new Boolean[]{false, false};
	public static final String[] NO_INGREDIENT = new String[]{"", ""};
	public static final Boolean[] ITEM_RECIPE = new Boolean[]{true, false};
	public static final Boolean[] TAG_RECIPE = new Boolean[]{true, true};
	public static final String CMT_ALL = CropModelTypes.ALL;
	public static final String CMT_LOG = CropModelTypes.LOG;
	public static final String CMT_RC = CropModelTypes.RADIAL_CENTER;

	public static final String TIER_1 = Strings.TIER_1;
	public static final String TIER_2 = Strings.TIER_2;
	public static final String TIER_3 = Strings.TIER_3;
	public static final String TIER_4 = Strings.TIER_4;
	public static final String TIER_5 = Strings.TIER_5;
	public static final String TIER_6 = Strings.TIER_6;
	public static final String TIER_INFINITY = Strings.TIER_INFINITY;
	public static final String TIER_CREATIVE = Strings.TIER_CREATIVE;
	public static final String TIER_ULTIMATE = Strings.TIER_ULTIMATE;
	
	public static void initialize() {
		//Resource Crops
		if(ResourceCrops){
			if(Mods.checkDevEnv()){
				createCrop("test", TIER_1, Mods.ResCrop, CMT_ALL, new String[]{VanillaTex.BEDROCK, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{VanillaIngredient.BEDROCK, TIER_CREATIVE}, true, SQUARE, ResourceCropsIngredient.DEBUG_BLOCK, 1);
			}
			createCropInternal("tier_1", TIER_1, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.FOG}, ITEM_RECIPE, new String[]{ResourceCropsIngredient.TIER_1_ESSENCE, TIER_1, ResourceCropsIngredient.CRAFTING_SEEDS}, true, HexColors.TIER_1, SQUARE, ResourceCropsIngredient.ESSENCE_TIER_1_BLOCK, 1);
			createCropInternal("tier_2", TIER_2, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.FOG}, ITEM_RECIPE, new String[]{ResourceCropsIngredient.TIER_2_ESSENCE, TIER_2, ResourceCropsIngredient.TIER_1_SEEDS}, true, HexColors.TIER_2, SQUARE, ResourceCropsIngredient.ESSENCE_TIER_2_BLOCK, 1);
			createCropInternal("tier_3", TIER_3, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.FOG}, ITEM_RECIPE, new String[]{ResourceCropsIngredient.TIER_3_ESSENCE, TIER_3, ResourceCropsIngredient.TIER_2_SEEDS}, true, HexColors.TIER_3, SQUARE, ResourceCropsIngredient.ESSENCE_TIER_3_BLOCK, 1);
			createCropInternal("tier_4", TIER_4, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.FOG}, ITEM_RECIPE, new String[]{ResourceCropsIngredient.TIER_4_ESSENCE, TIER_4, ResourceCropsIngredient.TIER_3_SEEDS}, true, HexColors.TIER_4, SQUARE, ResourceCropsIngredient.ESSENCE_TIER_4_BLOCK, 1);
			createCropInternal("tier_5", TIER_5, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.FOG}, ITEM_RECIPE, new String[]{ResourceCropsIngredient.TIER_5_ESSENCE, TIER_5, ResourceCropsIngredient.TIER_4_SEEDS}, true, HexColors.TIER_5, SQUARE, ResourceCropsIngredient.ESSENCE_TIER_5_BLOCK, 1);
			createCropInternal("tier_6", TIER_6, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.FOG}, ITEM_RECIPE, new String[]{ResourceCropsIngredient.TIER_6_ESSENCE, TIER_6, ResourceCropsIngredient.TIER_5_SEEDS}, true, HexColors.TIER_6, SQUARE, ResourceCropsIngredient.ESSENCE_TIER_6_BLOCK, 1);
			createCropInternal("tier_infinity", TIER_INFINITY, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.FOG}, NO_RECIPE, NO_INGREDIENT, true, HexColors.TIER_INFINITY, SQUARE, ResourceCropsIngredient.ESSENCE_TIER_INFINITY_BLOCK, 1);
			createCropInternal("tier_creative", TIER_CREATIVE, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.FOG}, NO_RECIPE, NO_INGREDIENT, true, HexColors.TIER_CREATIVE, SQUARE, ResourceCropsIngredient.ESSENCE_TIER_CREATIVE_BLOCK, 1);
			createCrop("ultimate", TIER_ULTIMATE, Mods.ResCrop, CMT_ALL, new String[]{ResourceCropsTex.ULTIMATE_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.BEDROCK, TIER_INFINITY, ResourceCropsIngredient.TIER_INFINITY_SEEDS}, true, false, SQUARE, VanillaIngredient.BEDROCK, 1);
		}

		//Vanilla Minecraft
		if(Vanilla){
			createCrop("acacia_log", TIER_1, Mods.Vanilla, CMT_LOG, new String[]{VanillaTex.ACACIA_LOG}, ITEM_RECIPE, new String[]{VanillaIngredient.ACACIA_LOG, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.ACACIA_LOG, 8);
			createCrop("basalt", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BASALT}, ITEM_RECIPE, new String[]{VanillaIngredient.BASALT, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.BASALT, 8);
			createCrop("birch_log", TIER_1, Mods.Vanilla, CMT_LOG, new String[]{VanillaTex.BIRCH_LOG}, ITEM_RECIPE, new String[]{VanillaIngredient.BIRCH_LOG, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.BIRCH_LOG, 8);
			createCrop("blackstone", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BLACKSTONE}, ITEM_RECIPE, new String[]{VanillaIngredient.BLACKSTONE, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.BLACKSTONE, 8);
			createCrop("blaze", TIER_4, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BLAZE, ResourceCropsTex.GRADIENT_ORANGE, VanillaTex.BLAZE_LEAVES, VanillaTex.BLAZE_STEM}, ITEM_RECIPE, new String[]{VanillaIngredient.BLAZE_ROD, TIER_4}, true, SQUARE_HOLLOW, VanillaIngredient.BLAZE_ROD, 2);
			createCrop("brain_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BRAIN_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, ITEM_RECIPE, new String[]{VanillaIngredient.BRAIN_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.BRAIN_CORAL, 8);
			createCrop("bubble_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BUBBLE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, ITEM_RECIPE, new String[]{VanillaIngredient.BUBBLE_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.BUBBLE_CORAL, 8);
			createCrop("coal", TIER_2, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.COAL_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.COAL, TIER_2}, true, SQUARE_HOLLOW, VanillaIngredient.COAL, 8);
			createCrop("creeper", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.CREEPER}, ITEM_RECIPE, new String[]{VanillaIngredient.GUNPOWDER, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.GUNPOWDER, 8);
			createCrop("crimson_stem", TIER_1, Mods.Vanilla, CMT_LOG, new String[]{VanillaTex.CRIMSON_STEM}, ITEM_RECIPE, new String[]{VanillaIngredient.CRIMSON_STEM, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.CRIMSON_STEM, 8);
			createCrop("dark_oak_log", TIER_1, Mods.Vanilla, CMT_LOG, new String[]{VanillaTex.DARK_OAK_LOG}, ITEM_RECIPE, new String[]{VanillaIngredient.DARK_OAK_LOG, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.DARK_OAK_LOG, 8);
			createCrop("dead_brain_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.DEAD_BRAIN_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, ITEM_RECIPE, new String[]{VanillaIngredient.DEAD_BRAIN_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.DEAD_BRAIN_CORAL, 8);
			createCrop("dead_bubble_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.DEAD_BUBBLE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, ITEM_RECIPE, new String[]{VanillaIngredient.DEAD_BUBBLE_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.DEAD_BUBBLE_CORAL, 8);
			createCrop("dead_fire_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.DEAD_FIRE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, ITEM_RECIPE, new String[]{VanillaIngredient.DEAD_FIRE_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.DEAD_FIRE_CORAL, 8);
			createCrop("dead_horn_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.DEAD_HORN_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, ITEM_RECIPE, new String[]{VanillaIngredient.DEAD_HORN_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.DEAD_HORN_CORAL, 8);
			createCrop("dead_tube_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.DEAD_TUBE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_DARK_GRAY}, ITEM_RECIPE, new String[]{VanillaIngredient.DEAD_TUBE_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.DEAD_TUBE_CORAL, 8);
			createCrop("diamond", TIER_5, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.DIAMOND_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.DIAMOND, TIER_5}, true, SQUARE, VanillaIngredient.DIAMOND, 1);
			createCrop("dirt", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.DIRT}, ITEM_RECIPE, new String[]{VanillaIngredient.DIRT, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.DIRT, 8);
			createCrop("dragon_egg", TIER_6, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.DRAGON_EGG}, ITEM_RECIPE, new String[]{VanillaIngredient.DRAGON_EGG, TIER_6}, true, SQUARE, ResourceCropsIngredient.DRAGON_EGG_FRAGMENT, 1);
			createCrop("emerald", TIER_5, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.EMERALD_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.EMERALD, TIER_5}, true, SQUARE, VanillaIngredient.EMERALD, 1);
			createCrop("end", TIER_2, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.END_STONE}, ITEM_RECIPE, new String[]{VanillaIngredient.END_STONE, TIER_2}, true, SQUARE_HOLLOW, VanillaIngredient.END_STONE, 8);
			createCrop("enderman", TIER_4, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.ENDERMAN}, ITEM_RECIPE, new String[]{VanillaIngredient.ENDER_PEARL, TIER_4}, true, SQUARE_HOLLOW, VanillaIngredient.ENDER_PEARL, 8);
			createCrop("fire_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.FIRE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, ITEM_RECIPE, new String[]{VanillaIngredient.FIRE_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.FIRE_CORAL, 8);
			createCrop("ghast", TIER_4, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.GHAST}, ITEM_RECIPE, new String[]{VanillaIngredient.GHAST_TEAR, TIER_4}, true, SQUARE_HOLLOW, VanillaIngredient.GHAST_TEAR, 4);
			createCrop("glass", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.GLASS}, NO_RECIPE, NO_INGREDIENT, true, SQUARE_HOLLOW, VanillaIngredient.GLASS, 8);
			createCrop("glowstone", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.GLOWSTONE}, ITEM_RECIPE, new String[]{VanillaIngredient.GLOWSTONE, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.GLOWSTONE_DUST, 8);
			createCrop("gold", TIER_4, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.GOLD_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.GOLD_INGOT, TIER_4}, true, SQUARE_HOLLOW, VanillaIngredient.GOLD_INGOT, 8);
			createCrop("horn_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.HORN_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, ITEM_RECIPE, new String[]{VanillaIngredient.HORN_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.HORN_CORAL, 8);
			createCrop("iron", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.IRON_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.IRON_INGOT, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.IRON_INGOT, 8);
			createCrop("jungle_log", TIER_1, Mods.Vanilla, CMT_LOG, new String[]{VanillaTex.JUNGLE_LOG}, ITEM_RECIPE, new String[]{VanillaIngredient.JUNGLE_LOG, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.JUNGLE_LOG, 8);
			createCrop("lapis", TIER_4, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.LAPIS_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.LAPIS_LAZULI, TIER_4}, true, SQUARE_HOLLOW, VanillaIngredient.LAPIS, 8);
			createCrop("nether", TIER_2, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.NETHERRACK}, ITEM_RECIPE, new String[]{VanillaIngredient.NETHERRACK, TIER_2}, true, SQUARE_HOLLOW, VanillaIngredient.NETHERRACK, 8);
			createCrop("netherite", TIER_6, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.NETHERITE_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.NETHERITE_INGOT, TIER_6}, true, SQUARE, VanillaIngredient.NETHERITE_INGOT, 1);
			createCrop("nether_star", TIER_6, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BEACON}, ITEM_RECIPE, new String[]{VanillaIngredient.NETHER_STAR, TIER_6}, true, SQUARE, VanillaIngredient.NETHER_STAR, 1);
			createCrop("oak_log", TIER_1, Mods.Vanilla, CMT_LOG, new String[]{VanillaTex.OAK_LOG}, ITEM_RECIPE, new String[]{VanillaIngredient.OAK_LOG, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.OAK_LOG, 8);
			createCrop("obsidian", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.OBSIDIAN}, ITEM_RECIPE, new String[]{VanillaIngredient.OBSIDIAN, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.OBSIDIAN, 8);
			createCrop("phantom", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.PHANTOM}, ITEM_RECIPE, new String[]{VanillaIngredient.PHANTOM_MEMBRANE, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.PHANTOM_MEMBRANE, 8);
			createCrop("prismarine", TIER_4, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.PRISMARINE}, ITEM_RECIPE, new String[]{VanillaIngredient.PRISMARINE, TIER_4}, true, SQUARE_HOLLOW, VanillaIngredient.PRISMARINE_SHARD, 8);
			createCrop("quartz", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.QUARTZ_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.QUARTZ, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.QUARTZ, 8);
			createCrop("redstone", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.REDSTONE_BLOCK}, ITEM_RECIPE, new String[]{VanillaIngredient.REDSTONE_DUST, TIER_3}, true, SQUARE, VanillaIngredient.REDSTONE_DUST, 16);
			createCrop("sand", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.SAND}, ITEM_RECIPE, new String[]{VanillaIngredient.SAND, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.SAND, 8);
			createCrop("skeleton", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.SKELETON}, ITEM_RECIPE, new String[]{VanillaIngredient.BONE, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.BONE, 8);
			createCrop("spruce_log", TIER_1, Mods.Vanilla, CMT_LOG, new String[]{VanillaTex.SPRUCE_LOG}, ITEM_RECIPE, new String[]{VanillaIngredient.SPRUCE_LOG, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.SPRUCE_LOG, 8);
			createCrop("stone", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.STONE}, ITEM_RECIPE, new String[]{VanillaIngredient.STONE, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.STONE, 8);
			createCrop("sponge", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.SPONGE}, ITEM_RECIPE, new String[]{VanillaIngredient.SPONGE, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.SPONGE, 4);
			createCrop("tube_coral", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.TUBE_CORAL_BLOCK, ResourceCropsTex.GRADIENT_BLUE}, ITEM_RECIPE, new String[]{VanillaIngredient.TUBE_CORAL, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.TUBE_CORAL, 8);
			createCrop("warped_stem", TIER_1, Mods.Vanilla, CMT_LOG, new String[]{VanillaTex.WARPED_STEM}, ITEM_RECIPE, new String[]{VanillaIngredient.WARPED_STEM, TIER_1}, true, SQUARE_HOLLOW, VanillaIngredient.WARPED_STEM, 8);
			createCrop("wither_skeleton", TIER_4, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.WITHER_SKELETON}, ITEM_RECIPE, new String[]{VanillaIngredient.WITHER_SKELETON_SKULL, TIER_4}, true, SQUARE, VanillaIngredient.WITHER_SKELETON_SKULL, 1);
			createCrop("zombie", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.ZOMBIE}, ITEM_RECIPE, new String[]{VanillaIngredient.ROTTEN_FLESH, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.ROTTEN_FLESH, 8);
			createCrop("slime", TIER_4, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.SLIME_BLOCK, ResourceCropsTex.GRADIENT_GREEN}, ITEM_RECIPE, new String[]{VanillaIngredient.SLIME_BLOCK, TIER_4}, true, SQUARE_HOLLOW, VanillaIngredient.SLIMEBALL, 8);
			createCrop("spider", TIER_3, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.SPIDER, ResourceCropsTex.GRADIENT_BROWN}, ITEM_RECIPE, new String[]{VanillaIngredient.STRING, TIER_3}, true, SQUARE_HOLLOW, VanillaIngredient.STRING, 8);
			createCrop("black_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BLACK_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.BLACK_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.BLACK_WOOL, 12);
			createCrop("blue_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BLUE_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.BLUE_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.BLUE_WOOL, 12);
			createCrop("brown_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BROWN_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.BROWN_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.BROWN_WOOL, 12);
			createCrop("cyan_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.CYAN_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.CYAN_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.CYAN_WOOL, 12);
			createCrop("gray_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.GRAY_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.GRAY_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.GRAY_WOOL, 12);
			createCrop("green_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.GREEN_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.GREEN_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.GREEN_WOOL, 12);
			createCrop("light_blue_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.LIGHT_BLUE_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.LIGHT_BLUE_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.LIGHT_BLUE_WOOL, 12);
			createCrop("light_gray_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.LIGHT_GRAY_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.LIGHT_GRAY_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.LIGHT_GRAY_WOOL, 12);
			createCrop("lime_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.LIME_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.LIME_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.LIME_WOOL, 12);
			createCrop("magenta_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.MAGENTA_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.MAGENTA_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.MAGENTA_WOOL, 12);
			createCrop("orange_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.ORANGE_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.ORANGE_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.ORANGE_WOOL, 12);
			createCrop("pink_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.PINK_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.PINK_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.PINK_WOOL, 12);
			createCrop("purple_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.PURPLE_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.PURPLE_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.PURPLE_WOOL, 12);
			createCrop("red_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.RED_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.RED_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.RED_WOOL, 12);
			createCrop("white_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.WHITE_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.WHITE_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.WHITE_WOOL, 12);
			createCrop("yellow_wool", TIER_1, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.YELLOW_WOOL}, ITEM_RECIPE, new String[]{VanillaIngredient.YELLOW_WOOL, TIER_1}, true, SQUARE, VanillaIngredient.YELLOW_WOOL, 12);
			createCrop("jeb_wool", TIER_6, Mods.Vanilla, CMT_ALL, new String[]{ResourceCropsTex.JEB_WOOL}, ITEM_RECIPE, new String[]{ResourceCropsIngredient.JEB_WOOL, TIER_6}, true, SQUARE, ResourceCropsIngredient.JEB_WOOL, 12);
			createCrop("chicken", TIER_2, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.CHICKEN}, ITEM_RECIPE, new String[]{VanillaIngredient.RAW_CHICKEN, TIER_2}, true, SQUARE, VanillaIngredient.RAW_CHICKEN, 4);
			createCrop("BBQ_chicken", TIER_2, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.BBQ_CHICKEN, ResourceCropsTex.GRADIENT_LIGHT_BEIGE}, NO_RECIPE, NO_INGREDIENT, true, SQUARE, VanillaIngredient.COOKED_CHICKEN, 4);
			createCrop("cow", TIER_2, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.COW, ResourceCropsTex.GRADIENT_BROWN}, ITEM_RECIPE, new String[]{VanillaIngredient.RAW_BEEF, TIER_2}, true, SQUARE, VanillaIngredient.RAW_BEEF, 4);
			createCrop("grilled_cow", TIER_2, Mods.Vanilla, CMT_ALL, new String[]{VanillaTex.GRILLED_COW, ResourceCropsTex.GRADIENT_BROWN}, NO_RECIPE, NO_INGREDIENT, true, SQUARE, VanillaIngredient.STEAK, 4);
		}	
		
		//AE2
		if(AE2){
			createCrop("certus", TIER_3, Mods.AE2, Mods.AE2Short, CMT_ALL, new String[]{AE2Tex.CERTUS_QUARTZ_BLOCK}, ITEM_RECIPE, new String[]{AE2Ingredient.CERTUS_QUARTZ_CRYSTAL, TIER_3}, true, SQUARE_HOLLOW, AE2Ingredient.CERTUS_QUARTZ_CRYSTAL, 8);
			createCrop("certus_charged", TIER_3, Mods.AE2, Mods.AE2Short, CMT_ALL, new String[]{AE2Tex.CHARGED_CERTUS_QUARTZ_BLOCK}, ITEM_RECIPE, new String[]{AE2Ingredient.CHARGED_CERTUS_QUARTZ_CRYSTAL, TIER_3}, true, SQUARE_HOLLOW, AE2Ingredient.CHARGED_CERTUS_QUARTZ_CRYSTAL, 4);
			createCrop("certus_pure", TIER_4, Mods.AE2, Mods.AE2Short, CMT_ALL, new String[]{AE2Tex.PURE_CERTUS_QUARTZ_BLOCK}, ITEM_RECIPE, new String[]{AE2Ingredient.PURE_CERTUS_QUARTZ_CRYSTAL, TIER_4}, true, SQUARE, AE2Ingredient.PURE_CERTUS_QUARTZ_CRYSTAL, 1);
			createCrop("fluix", TIER_4, Mods.AE2, Mods.AE2Short, CMT_ALL, new String[]{AE2Tex.FLUIX_BLOCK, ResourceCropsTex.GRADIENT_PURPLE}, ITEM_RECIPE, new String[]{AE2Ingredient.FLUIX_CRYSTAL, TIER_4}, true, SQUARE_HOLLOW, AE2Ingredient.FLUIX_CRYSTAL, 8);
			createCrop("fluix_pure", TIER_5, Mods.AE2, Mods.AE2Short, CMT_ALL, new String[]{AE2Tex.PURE_FLUIX_BLOCK}, ITEM_RECIPE, new String[]{AE2Ingredient.PURE_FLUIX_CRYSTAL, TIER_5}, true, SQUARE, AE2Ingredient.PURE_FLUIX_CRYSTAL, 1);
			createCrop("quartz_pure", TIER_4, Mods.AE2, Mods.AE2Short, CMT_ALL, new String[]{AE2Tex.PURE_NETHER_QUARTZ_BLOCK}, ITEM_RECIPE, new String[]{AE2Ingredient.PURE_NETHER_QUARTZ_CRYSTAL, TIER_4}, true, SQUARE, AE2Ingredient.PURE_QUARTZ_CRYSTAL, 1);
		}
		
		//Bewitchment
		if(Bewitchment){
			createCrop("alchemist_wool", TIER_3, Mods.BWM, CMT_ALL, new String[]{BewitchmentTex.ALCHEMIST_WOOL}, ITEM_RECIPE, new String[]{BewitchmentIngredient.ALCHEMIST_WOOL, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.ALCHEMIST_WOOL, 8);
			createCrop("besmirched_wool", TIER_3, Mods.BWM, CMT_ALL, new String[]{BewitchmentTex.BESMIRCHED_WOOL}, ITEM_RECIPE, new String[]{BewitchmentIngredient.BESMIRCHED_WOOL, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.BESMIRCHED_WOOL, 8);
			createCrop("blessed_stone", TIER_3, Mods.BWM, CMT_ALL, new String[]{BewitchmentTex.BLESSED_STONE}, ITEM_RECIPE, new String[]{BewitchmentIngredient.BLESSED_STONE, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.BLESSED_STONE, 8);
			createCrop("cypress_log", TIER_3, Mods.BWM, CMT_LOG, new String[]{BewitchmentTex.LOG_CYPRESS}, ITEM_RECIPE, new String[]{BewitchmentIngredient.CYPRESS_LOG, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.CYPRESS_LOG, 8);
			createCrop("dragons_blood_log", TIER_3, Mods.BWM, CMT_LOG, new String[]{BewitchmentTex.LOG_DRAGONS_BLOOD}, ITEM_RECIPE, new String[]{BewitchmentIngredient.DRAGONS_BLOOD_LOG, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.DRAGONS_BLOOD_LOG, 8);
			createCrop("dragons_blood_resin", TIER_3, Mods.BWM, CMT_ALL, new String[]{BewitchmentTex.DRAGONS_BLOOD_RESIN_BLOCK}, ITEM_RECIPE, new String[]{BewitchmentIngredient.DRAGONS_BLOOD_RESIN, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.DRAGONS_BLOOD_RESIN, 8);
			createCrop("elder_log", TIER_3, Mods.BWM, CMT_LOG, new String[]{BewitchmentTex.LOG_ELDER}, ITEM_RECIPE, new String[]{BewitchmentIngredient.ELDER_LOG, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.ELDER_LOG, 8);
			createCrop("hedgewitch_wool", TIER_3, Mods.BWM, CMT_ALL, new String[]{BewitchmentTex.HEDGEWITCH_WOOL}, ITEM_RECIPE, new String[]{BewitchmentIngredient.HEDGEWITCH_WOOL, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.HEDGEWITCH_WOOL, 8);
			createCrop("juniper_log", TIER_3, Mods.BWM, CMT_LOG, new String[]{BewitchmentTex.LOG_JUNIPER}, ITEM_RECIPE, new String[]{BewitchmentIngredient.JUNIPER_LOG, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.JUNIPER_LOG, 8);
			createCrop("salt", TIER_3, Mods.BWM, CMT_ALL, new String[]{BewitchmentTex.SALT_BLOCK}, ITEM_RECIPE, new String[]{BewitchmentIngredient.SALT, TIER_3}, true, SQUARE_HOLLOW, BewitchmentIngredient.SALT, 8);
		}
		
		//Biomemakeover
		if(Biomemakeover){
			createCrop("ancient_oak_log", TIER_1, Mods.BMO, CMT_LOG, new String[]{BiomemakeoverTex.ANCIENT_OAK_LOG}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.ANCIENT_OAK_LOG, TIER_1}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.ANCIENT_OAK_LOG, 8);
			createCrop("blighted_balsa_log", TIER_1, Mods.BMO, CMT_LOG, new String[]{BiomemakeoverTex.BLIGHTED_BALSA_LOG}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.BLIGHTED_BALSA_LOG, TIER_1}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.BLIGHTED_BALSA_LOG, 8);
			createCrop("blighted_cobblestone", TIER_2, Mods.BMO, CMT_ALL, new String[]{BiomemakeoverTex.BLIGHTED_COBBLESTONE}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.BLIGHTED_COBBLESTONE, TIER_2}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.BLIGHTED_COBBLESTONE, 8);
			createCrop("cladded_stone", TIER_2, Mods.BMO, CMT_ALL, new String[]{BiomemakeoverTex.CLADDED_STONE}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.CLADDED_STONE, TIER_2}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.CLADDED_STONE, 8);
			createCrop("glowshroom_stem", TIER_1, Mods.BMO, CMT_ALL, new String[]{BiomemakeoverTex.GLOWSHROOM_STEM}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.GLOWSHROOM_STEM, TIER_1}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.GLOWSHROOM_STEM, 8);
			createCrop("illunite_block", TIER_2, Mods.BMO, CMT_ALL, new String[]{BiomemakeoverTex.ILLUNITE_BLOCK}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.ILLUNITE_BLOCK, TIER_2}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.ILLUNITE_BLOCK, 8);
			createCrop("mesmerite", TIER_2, Mods.BMO, CMT_ALL, new String[]{BiomemakeoverTex.MESMERITE}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.MESMERITE, TIER_2}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.MESMERITE, 8);
			createCrop("orange_glowshroom_block", TIER_2, Mods.BMO, CMT_ALL, new String[]{BiomemakeoverTex.ORANGE_GLOWSHROOM_BLOCK}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.ORANGE_GLOWSHROOM_BLOCK, TIER_2}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.ORANGE_GLOWSHROOM_BLOCK, 8);
			createCrop("purple_glowshroom_block", TIER_2, Mods.BMO, CMT_ALL, new String[]{BiomemakeoverTex.PURPLE_GLOWSHROOM_BLOCK}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.PURPLE_GLOWSHROOM_BLOCK, TIER_2}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.PURPLE_GLOWSHROOM_BLOCK, 8);
			createCrop("swamp_cypress_log", TIER_1, Mods.BMO, CMT_LOG, new String[]{BiomemakeoverTex.SWAMP_CYPRESS_LOG}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.SWAMP_CYPRESS_LOG, TIER_1}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.SWAMP_CYPRESS_LOG, 8);
			createCrop("willow_log", TIER_1, Mods.BMO, CMT_LOG, new String[]{BiomemakeoverTex.WILLOW_LOG}, ITEM_RECIPE, new String[]{BiomemakeoverIngredient.WILLOW_LOG, TIER_1}, true, SQUARE_HOLLOW, BiomemakeoverIngredient.WILLOW_LOG, 8);
		}

		//Blockus
		if(Blockus){
			createCrop("asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT}, ITEM_RECIPE, new String[]{BlockusIngredient.ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.ASPHALT, 8);
			createCrop("blue_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_BLUE}, ITEM_RECIPE, new String[]{BlockusIngredient.BLUE_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.BLUE_ASPHALT, 8);
			createCrop("brown_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_BROWN}, ITEM_RECIPE, new String[]{BlockusIngredient.BROWN_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.BROWN_ASPHALT, 8);
			createCrop("cyan_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_CYAN}, ITEM_RECIPE, new String[]{BlockusIngredient.CYAN_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.CYAN_ASPHALT, 8);
			createCrop("gray_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_GRAY}, ITEM_RECIPE, new String[]{BlockusIngredient.GRAY_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.GRAY_ASPHALT, 8);
			createCrop("green_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_GREEN}, ITEM_RECIPE, new String[]{BlockusIngredient.GREEN_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.GREEN_ASPHALT, 8);
			createCrop("light_blue_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_LIGHT_BLUE}, ITEM_RECIPE, new String[]{BlockusIngredient.LIGHT_BLUE_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIGHT_BLUE_ASPHALT, 8);
			createCrop("light_gray_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_LIGHT_GRAY}, ITEM_RECIPE, new String[]{BlockusIngredient.LIGHT_GRAY_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIGHT_GRAY_ASPHALT, 8);
			createCrop("lime_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_LIME}, ITEM_RECIPE, new String[]{BlockusIngredient.LIME_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIME_ASPHALT, 8);
			createCrop("magenta_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_MAGENTA}, ITEM_RECIPE, new String[]{BlockusIngredient.MAGENTA_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.MAGENTA_ASPHALT, 8);
			createCrop("orange_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_ORANGE}, ITEM_RECIPE, new String[]{BlockusIngredient.ORANGE_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.ORANGE_ASPHALT, 8);
			createCrop("pink_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_PINK}, ITEM_RECIPE, new String[]{BlockusIngredient.PINK_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.PINK_ASPHALT, 8);
			createCrop("purple_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_PURPLE}, ITEM_RECIPE, new String[]{BlockusIngredient.PURPLE_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.PURPLE_ASPHALT, 8);
			createCrop("red_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_RED}, ITEM_RECIPE, new String[]{BlockusIngredient.RED_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.RED_ASPHALT, 8);
			createCrop("white_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_WHITE}, ITEM_RECIPE, new String[]{BlockusIngredient.WHITE_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.WHITE_ASPHALT, 8);
			createCrop("yellow_asphalt", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.ASPHALT_YELLOW}, ITEM_RECIPE, new String[]{BlockusIngredient.YELLOW_ASPHALT, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.YELLOW_ASPHALT, 8);
			createCrop("shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES}, ITEM_RECIPE, new String[]{BlockusIngredient.SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.SHINGLES, 8);
			createCrop("black_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.BLACK_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.BLACK_SHINGLES, 8);
			createCrop("brown_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_BROWN}, ITEM_RECIPE, new String[]{BlockusIngredient.BROWN_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.BROWN_SHINGLES, 8);
			createCrop("cyan_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_CYAN}, ITEM_RECIPE, new String[]{BlockusIngredient.CYAN_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.CYAN_SHINGLES, 8);
			createCrop("gray_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_GRAY}, ITEM_RECIPE, new String[]{BlockusIngredient.GRAY_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.GRAY_SHINGLES, 8);
			createCrop("green_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_GREEN}, ITEM_RECIPE, new String[]{BlockusIngredient.GREEN_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.GREEN_SHINGLES, 8);
			createCrop("light_blue_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_LIGHT_BLUE}, ITEM_RECIPE, new String[]{BlockusIngredient.LIGHT_BLUE_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIGHT_BLUE_SHINGLES, 8);
			createCrop("light_gray_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_LIGHT_GRAY}, ITEM_RECIPE, new String[]{BlockusIngredient.LIGHT_GRAY_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIGHT_GRAY_SHINGLES, 8);
			createCrop("lime_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_LIME}, ITEM_RECIPE, new String[]{BlockusIngredient.LIME_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIME_SHINGLES, 8);
			createCrop("magenta_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_MAGENTA}, ITEM_RECIPE, new String[]{BlockusIngredient.MAGENTA_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.MAGENTA_SHINGLES, 8);
			createCrop("orange_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_ORANGE}, ITEM_RECIPE, new String[]{BlockusIngredient.ORANGE_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.ORANGE_SHINGLES, 8);
			createCrop("pink_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_PINK}, ITEM_RECIPE, new String[]{BlockusIngredient.PINK_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.PINK_SHINGLES, 8);
			createCrop("purple_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_PURPLE}, ITEM_RECIPE, new String[]{BlockusIngredient.PURPLE_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.PURPLE_SHINGLES, 8);
			createCrop("red_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_RED}, ITEM_RECIPE, new String[]{BlockusIngredient.RED_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.RED_SHINGLES, 8);
			createCrop("white_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_WHITE}, ITEM_RECIPE, new String[]{BlockusIngredient.WHITE_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.WHITE_SHINGLES, 8);
			createCrop("yellow_shingles", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.SHINGLES_YELLOW}, ITEM_RECIPE, new String[]{BlockusIngredient.YELLOW_SHINGLES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.YELLOW_SHINGLES, 8);
			createCrop("black_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_BLACK, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.BLACK_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.BLACK_FUTURNEO, 8);
			createCrop("blue_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_BLUE, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.BLUE_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.BLUE_FUTURNEO, 8);
			createCrop("brown_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_BROWN, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.BROWN_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.BROWN_FUTURNEO, 8);
			createCrop("cyan_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_CYAN, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.CYAN_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.CYAN_FUTURNEO, 8);
			createCrop("gray_bright_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_GRAY_BRIGHT, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.GRAY_BRIGHT_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.GRAY_BRIGHT_FUTURNEO, 8);
			createCrop("gray_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_GRAY, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.GRAY_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.GRAY_FUTURNEO, 8);
			createCrop("green_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_GREEN, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.GREEN_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.GREEN_FUTURNEO, 8);
			createCrop("light_blue_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_LIGHT_BLUE, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.LIGHT_BLUE_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIGHT_BLUE_FUTURNEO, 8);
			createCrop("light_gray_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_LIGHT_GRAY, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.LIGHT_GRAY_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIGHT_GRAY_FUTURNEO, 8);
			createCrop("lime_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_LIME, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.LIME_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LIME_FUTURNEO, 8);
			createCrop("magenta_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_MAGENTA, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.MAGENTA_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.MAGENTA_FUTURNEO, 8);
			createCrop("orange_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_ORANGE, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.ORANGE_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.ORANGE_FUTURNEO, 8);
			createCrop("pink_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_PINK, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.PINK_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.PINK_FUTURNEO, 8);
			createCrop("purple_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_PURPLE, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.PURPLE_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.PURPLE_FUTURNEO, 8);
			createCrop("red_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_RED, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.RED_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.RED_FUTURNEO, 8);
			createCrop("white_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_WHITE, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.WHITE_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.WHITE_FUTURNEO, 8);
			createCrop("yellow_futurneo", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.FUTURNEO_YELLOW, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.YELLOW_FUTURNEO, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.YELLOW_FUTURNEO, 8);
			createCrop("bluestone", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.BLUESTONE}, ITEM_RECIPE, new String[]{BlockusIngredient.BLUESTONE, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.BLUESTONE, 8);
			createCrop("glowing_obsidian", TIER_3, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.GLOWING_OBSIDIAN, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.GLOWING_OBSIDIAN, TIER_3}, true, SQUARE_HOLLOW, BlockusIngredient.GLOWING_OBSIDIAN, 8);
			createCrop("legacy_bricks", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_BRICKS}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_BRICKS, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_BRICKS, 8);
			createCrop("legacy_coal_block", TIER_2, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_COAL_BLOCK, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_COAL_BLOCK, TIER_2}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_COAL_BLOCK, 8);
			createCrop("legacy_cobblestone", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_COBBLESTONE}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_COBBLESTONE, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_COBBLESTONE, 8);
			createCrop("legacy_crying_obsidian", TIER_3, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_CRYING_OBSIDIAN}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_CRYING_OBSIDIAN, TIER_3}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_CRYING_OBSIDIAN, 8);
			createCrop("legacy_diamond_block", TIER_5, Mods.Blockus, CMT_LOG, new String[]{BlockusTex.LEGACY_DIAMOND_BLOCK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_DIAMOND_BLOCK, TIER_5}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_DIAMOND_BLOCK, 8);
			createCrop("legacy_explosion_proof_gold_block", TIER_4, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_EXPLOSION_PROOF_GOLD_BLOCK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_EXPLOSION_PROOF_GOLD_BLOCK, TIER_4}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_EXPLOSION_PROOF_GOLD_BLOCK, 8);
			createCrop("legacy_first_cobblestone", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_FIRST_COBBLESTONE}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_FIRST_COBBLESTONE, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_FIRST_COBBLESTONE, 8);
			createCrop("legacy_first_grass_block", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_FIRST_GRASS_BLOCK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_FIRST_GRASS_BLOCK, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_FIRST_GRASS_BLOCK, 8);
			createCrop("legacy_glowing_obsidian", TIER_3, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_GLOWING_OBSIDIAN, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_GLOWING_OBSIDIAN, TIER_3}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_GLOWING_OBSIDIAN, 8);
			createCrop("legacy_glowstone", TIER_3, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_GLOWSTONE}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_GLOWSTONE, TIER_3}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_GLOWSTONE, 8);
			createCrop("legacy_gold_block", TIER_4, Mods.Blockus, CMT_LOG, new String[]{BlockusTex.LEGACY_GOLD_BLOCK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_GOLD_BLOCK, TIER_4}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_GOLD_BLOCK, 8);
			createCrop("legacy_grass_block", TIER_1, Mods.Blockus, CMT_LOG, new String[]{BlockusTex.LEGACY_GRASS_BLOCK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_GRASS_BLOCK, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_GRASS_BLOCK, 8);
			createCrop("legacy_gravel", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_GRAVEL}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_GRAVEL, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_GRAVEL, 8);
			createCrop("legacy_iron_block", TIER_3, Mods.Blockus, CMT_LOG, new String[]{BlockusTex.LEGACY_IRON_BLOCK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_IRON_BLOCK, TIER_3}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_IRON_BLOCK, 8);
			createCrop("legacy_lapis_block", TIER_4, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_LAPIS_BLOCK}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_LAPIS_BLOCK, TIER_4}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_LAPIS_BLOCK, 8);
			createCrop("legacy_leaves", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_LEAVES}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_LEAVES, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_LEAVES, 8);
			createCrop("legacy_mossy_cobblestone", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_MOSSY_COBBLESTONE}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_MOSSY_COBBLESTONE, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_MOSSY_COBBLESTONE, 8);
			createCrop("legacy_nether_reactor_core", TIER_5, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_NETHER_REACTOR_CORE}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_NETHER_REACTOR_CORE, TIER_5}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_NETHER_REACTOR_CORE, 8);
			createCrop("legacy_planks", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_PLANKS}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_PLANKS, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_PLANKS, 8);
			createCrop("legacy_sponge", TIER_1, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LEGACY_SPONGE}, ITEM_RECIPE, new String[]{BlockusIngredient.LEGACY_SPONGE, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.LEGACY_SPONGE, 8);
			createCrop("limestone", TIER_2, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.LIMESTONE}, ITEM_RECIPE, new String[]{BlockusIngredient.LIMESTONE, TIER_2}, true, SQUARE_HOLLOW, BlockusIngredient.LIMESTONE, 8);
			createCrop("marble", TIER_3, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.MARBLE}, ITEM_RECIPE, new String[]{BlockusIngredient.MARBLE, TIER_3}, true, SQUARE_HOLLOW, BlockusIngredient.MARBLE, 8);
			createCrop("rainbow_block", TIER_5, Mods.Blockus, CMT_RC, new String[]{BlockusTex.RAINBOW_BLOCK}, ITEM_RECIPE, new String[]{BlockusIngredient.RAINBOW_BLOCK, TIER_5}, true, SQUARE_HOLLOW, BlockusIngredient.RAINBOW_BLOCK, 8);
			createCrop("redstone_sand", TIER_3, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.REDSTONE_SAND}, ITEM_RECIPE, new String[]{BlockusIngredient.REDSTONE_SAND, TIER_3}, true, SQUARE_HOLLOW, BlockusIngredient.REDSTONE_SAND, 8);
			createCrop("stars_block", TIER_5, Mods.Blockus, CMT_ALL, new String[]{BlockusTex.STARS_BLOCK, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BlockusIngredient.STARS_BLOCK, TIER_5}, true, SQUARE_HOLLOW, BlockusIngredient.STARS_BLOCK, 8);
			createCrop("white_oak_log", TIER_1, Mods.Blockus, CMT_LOG, new String[]{BlockusTex.LOG_WHITE_OAK}, ITEM_RECIPE, new String[]{BlockusIngredient.WHITE_OAK_LOG, TIER_1}, true, SQUARE_HOLLOW, BlockusIngredient.WHITE_OAK_LOG, 8);
		}
		
		//Tech Reborn
		if(TechReborn){
			createCrop("advanced_alloy", TIER_3, Mods.TechReb, CMT_ALL, new String[]{TechRebornTex.ADVANCED_ALLOY_BLOCK}, ITEM_RECIPE, new String[]{TechRebornIngredient.ADVANCED_ALLOY_INGOT, TIER_3}, true, SQUARE_HOLLOW, TechRebornIngredient.ADVANCED_ALLOY_INGOT, 8);
			createCrop("hot_tungstensteel", TIER_3, Mods.TechReb, CMT_ALL, new String[]{TechRebornTex.HOT_TUNGSTENSTEEL_BLOCK}, ITEM_RECIPE, new String[]{TechRebornIngredient.HOT_TUNGSTENSTEEL_INGOT, TIER_3}, true, SQUARE_HOLLOW, TechRebornIngredient.HOT_TUNGSTENSTEEL_INGOT, 8);
			createCrop("peridot", TIER_3, Mods.TechReb, CMT_ALL, new String[]{TechRebornTex.PERIDOT_BLOCK}, new Boolean[]{true,  true}, new String[]{TechRebornIngredient.PERIDOT_GEM, TIER_3}, true, SQUARE_HOLLOW, TechRebornIngredient.PERIDOT_GEM, 8);
			createCrop("red_garnet", TIER_3, Mods.TechReb, CMT_ALL, new String[]{TechRebornTex.REFINED_IRON_BLOCK}, ITEM_RECIPE, new String[]{TechRebornIngredient.REFINED_IRON_INGOT, TIER_3}, true, SQUARE_HOLLOW, TechRebornIngredient.RED_GARNET_GEM, 8);
			createCrop("refined_iron", TIER_3, Mods.TechReb, CMT_ALL, new String[]{TechRebornTex.TUNGSTENSTEEL_BLOCK}, ITEM_RECIPE, new String[]{TechRebornIngredient.TUNGSTENSTEEL_INGOT, TIER_3}, true, SQUARE_HOLLOW, TechRebornIngredient.REFINED_IRON_INGOT, 8);
			createCrop("tungstensteel", TIER_3, Mods.TechReb, CMT_ALL, new String[]{TechRebornTex.RED_GARNET_BLOCK}, ITEM_RECIPE, new String[]{TechRebornIngredient.RED_GARNET_GEM, TIER_3}, true, SQUARE_HOLLOW, TechRebornIngredient.TUNGSTENSTEEL_INGOT, 8);
			createCrop("yellow_garnet", TIER_3, Mods.TechReb, CMT_ALL, new String[]{TechRebornTex.YELLOW_GARNET_BLOCK}, ITEM_RECIPE, new String[]{TechRebornIngredient.YELLOW_GARNET_GEM, TIER_3}, true, SQUARE_HOLLOW, TechRebornIngredient.YELLOW_GARNET_GEM, 8);
		}
		
		//Common Metals
		if(Common){
			createCropTinted("aluminium", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.ALUMINIUM_INGOT, TIER_3}, true, HexColors.METALS.ALUMINIUM, SQUARE_HOLLOW, CommonIngredient.ALUMINIUM_INGOT, 8);
			createCropTinted("brass", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.BRASS_INGOT, TIER_3}, true, HexColors.METALS.BRASS, SQUARE_HOLLOW, CommonIngredient.BRASS_INGOT, 8);
			createCropTinted("bronze", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.BRONZE_INGOT, TIER_3}, true, HexColors.METALS.BRONZE, SQUARE_HOLLOW, CommonIngredient.BRONZE_INGOT, 8);
			createCropTinted("chrome", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.CHROME_INGOT, TIER_3}, true, HexColors.METALS.CHROME, SQUARE_HOLLOW, CommonIngredient.CHROME_INGOT, 8);
			createCropTinted("copper", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.COPPER_INGOT, TIER_3}, true, HexColors.METALS.COPPER, SQUARE_HOLLOW, CommonIngredient.COPPER_INGOT, 8);
			createCropTinted("electrum", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.ELECTRUM_INGOT, TIER_3}, true, HexColors.METALS.ELECTRUM, SQUARE_HOLLOW, CommonIngredient.ELECTRUM_INGOT, 8);
			createCropTinted("invar", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.INVAR_INGOT, TIER_3}, true, HexColors.METALS.INVAR, SQUARE_HOLLOW, CommonIngredient.INVAR_INGOT, 8);
			createCropTinted("iridium", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.IRIDIUM_INGOT, TIER_3}, true, HexColors.METALS.IRIDIUM, SQUARE_HOLLOW, CommonIngredient.IRIDIUM_INGOT, 8);
			createCropTinted("lead", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.LEAD_INGOT, TIER_3}, true, HexColors.METALS.LEAD, SQUARE_HOLLOW, CommonIngredient.LEAD_INGOT, 8);
			createCropTinted("nickel", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.NICKEL_INGOT, TIER_3}, true, HexColors.METALS.NICKEL, SQUARE_HOLLOW, CommonIngredient.NICKEL_INGOT, 8);
			createCropTinted("platinum", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.PLATINUM_INGOT, TIER_3}, true, HexColors.METALS.PLATINUM, SQUARE_HOLLOW, CommonIngredient.PLATINUM_INGOT, 8);
			createCropTinted("ruby", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.SILVER_INGOT, TIER_3}, true, HexColors.METALS.RUBY, SQUARE_HOLLOW, CommonIngredient.SILVER_INGOT, 8);
			createCropTinted("sapphire", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.STEEL_INGOT, TIER_3}, true, HexColors.METALS.SAPPHIRE, SQUARE_HOLLOW, CommonIngredient.STEEL_INGOT, 8);
			createCropTinted("silver", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.TIN_INGOT, TIER_3}, true, HexColors.METALS.SILVER, SQUARE_HOLLOW, CommonIngredient.TIN_INGOT, 8);
			createCropTinted("steel", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.TITANIUM_INGOT, TIER_3}, true, HexColors.METALS.STEEL, SQUARE_HOLLOW, CommonIngredient.TITANIUM_INGOT, 8);
			createCropTinted("tin", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.TUNGSTEN_INGOT, TIER_3}, true, HexColors.METALS.TIN, SQUARE_HOLLOW, CommonIngredient.TUNGSTEN_INGOT, 8);
			createCropTinted("titanium", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.ZINC_INGOT, TIER_3}, true, HexColors.METALS.TITANIUM, SQUARE_HOLLOW, CommonIngredient.ZINC_INGOT, 8);
			createCropTinted("tungsten", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.RUBY_GEM, TIER_3}, true, HexColors.METALS.TUNGSTEN, SQUARE_HOLLOW, CommonIngredient.RUBY_GEM, 8);
			createCropTinted("zinc", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.SAPPHIRE_GEM, TIER_3}, true, HexColors.METALS.ZINC, SQUARE_HOLLOW, CommonIngredient.SAPPHIRE_GEM, 8);
			createCropTinted("amethyst", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.AMETHYST, TIER_3}, true, HexColors.METALS.AMETHYST, SQUARE_HOLLOW, CommonIngredient.AMETHYST, 8);
			createCropTinted("coal_coke", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.COAL_COKE, TIER_3}, true, HexColors.METALS.COAL_COKE, SQUARE_HOLLOW, CommonIngredient.COAL_COKE, 8);
			createCropTinted("cobalt", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.COBALT_INGOT, TIER_3}, true, HexColors.METALS.COBALT, SQUARE_HOLLOW, CommonIngredient.COBALT_INGOT, 8);
			createCropTinted("osmium", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.OSMIUM_INGOT, TIER_3}, true, HexColors.METALS.OSMIUM, SQUARE_HOLLOW, CommonIngredient.OSMIUM_INGOT, 8);
			createCropTinted("palladium", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.PALLADIUM_INGOT, TIER_3}, true, HexColors.METALS.PALLADIUM, SQUARE_HOLLOW, CommonIngredient.PALLADIUM_INGOT, 8);
			createCropTinted("plutonium", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.PLUTONIUM_INGOT, TIER_3}, true, HexColors.METALS.PLUTONIUM, SQUARE_HOLLOW, CommonIngredient.PLUTONIUM_INGOT, 8);
			createCropTinted("thorium", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.THORIUM_INGOT, TIER_3}, true, HexColors.METALS.THORIUM, SQUARE_HOLLOW, CommonIngredient.THORIUM_INGOT, 8);
			createCropTinted("topaz", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.TOPAZ_GEM, TIER_3}, true, HexColors.METALS.TOPAZ, SQUARE_HOLLOW, CommonIngredient.TOPAZ_GEM, 8);
			createCropTinted("uranium", TIER_3, Mods.ResCrop, Mods.C, CMT_ALL, new String[]{ResourceCropsTex.COMMON_METAL_SIDE}, TAG_RECIPE, new String[]{CommonIngredient.URANIUM_INGOT, TIER_3}, true, HexColors.METALS.URANIUM, SQUARE_HOLLOW, CommonIngredient.URANIUM_INGOT, 8);
		}
		
		//Industrial Revolution
		if(IndustrialRevolution){
			createCrop("nikolite", TIER_3, Mods.IndustrialRevolution, Mods.IndustrialRevolutionShort, CMT_ALL, new String[]{IndustrialRevolutionTex.NIKOLITE_BLOCK, ResourceCropsTex.GRADIENT_DARK_TEAL_HALF_LIGHT_BLUE}, ITEM_RECIPE, new String[]{IndustrialRevolutionIngredient.NIKOLITE_INGOT, TIER_3}, true, SQUARE_HOLLOW, IndustrialRevolutionIngredient.NIKOLITE_DUST, 8);
			createCrop("enriched_nikolite", TIER_5, Mods.IndustrialRevolution, Mods.IndustrialRevolutionShort, CMT_ALL, new String[]{IndustrialRevolutionTex.ENRICHED_NIKOLITE_BLOCK, ResourceCropsTex.GRADIENT_PURPLE}, ITEM_RECIPE, new String[]{IndustrialRevolutionIngredient.ENRICHED_NIKOLITE_INGOT, TIER_5}, true, SQUARE_HOLLOW, IndustrialRevolutionIngredient.ENRICHED_NIKOLITE_DUST, 8);
		}
		
		//Mythic Metals
		if(MythicMetals){
			createCrop("aetherium", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.ADAMANTITE_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.ADAMANTITE_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.AETHERIUM_INGOT, 8);
			createCrop("aquarium", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.AETHERIUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.AETHERIUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.AQUARIUM_INGOT, 8);
			createCrop("argonium", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.AQUARIUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.AQUARIUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.ARGONIUM_INGOT, 8);
			createCrop("banglum", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.ARGONIUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.ARGONIUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.BANGLUM_INGOT, 8);
			createCrop("carmot", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.BANGLUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.BANGLUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.CARMOT_INGOT, 8);
			createCrop("celestium", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.CARMOT_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.CARMOT_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.CELESTIUM_INGOT, 8);
			createCrop("discordium", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.CELESTIUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.CELESTIUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.DISCORDIUM_INGOT, 8);
			createCrop("durasteel", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.DISCORDIUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.DISCORDIUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.DURASTEEL_INGOT, 8);
			createCrop("etherite", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.DURASTEEL_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.DURASTEEL_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.ETHERITE_INGOT, 8);
			createCrop("hallowed", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.ETHERITE_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.ETHERITE_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.HALLOWED_INGOT, 8);
			createCrop("kyber", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.HALLOWED_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.HALLOWED_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.KYBER_INGOT, 8);
			createCrop("manganese", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.KYBER_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.KYBER_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.MANGANESE_INGOT, 8);
			createCrop("midas_gold", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.MANGANESE_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.MANGANESE_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.MIDAS_GOLD_INGOT, 8);
			createCrop("mythril", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.MIDAS_GOLD_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.MIDAS_GOLD_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.MYTHRIL_INGOT, 8);
			createCrop("orichalcum", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.MYTHRIL_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.MYTHRIL_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.ORICHALCUM_INGOT, 8);
			createCrop("prometheum", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.ORICHALCUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.ORICHALCUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.PROMETHEUM_INGOT, 8);
			createCrop("quadrillum", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.PROMETHEUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.PROMETHEUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.QUADRILLUM_INGOT, 8);
			createCrop("quicksilver", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.QUADRILLUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.QUADRILLUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.QUICKSILVER_INGOT, 8);
			createCrop("runite", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.QUICKSILVER_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.QUICKSILVER_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.RUNITE_INGOT, 8);
			createCrop("slowsilver", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.RUNITE_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.RUNITE_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.SLOWSILVER_INGOT, 8);
			createCrop("starrite", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.SLOWSILVER_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.SLOWSILVER_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.STARRITE_INGOT, 8);
			createCrop("stormyx", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.STARRITE_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.STARRITE_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.STORMYX_SHELL, 8);
			createCrop("tantalite", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.STORMYX_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.STORMYX_SHELL, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.TANTALITE_INGOT, 8);
			createCrop("truesilver", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.TANTALITE_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.TANTALITE_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.TRUESILVER_INGOT, 8);
			createCrop("unobtainium", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.TRUESILVER_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.TRUESILVER_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.UNOBTAINIUM_INGOT, 8);
			createCrop("vermiculite", TIER_3, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.UNOBTAINIUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.UNOBTAINIUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.VERMICULITE, 8);
			createCrop("ur", TIER_4, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.VERMICULITE_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.VERMICULITE, TIER_3}, true, SQUARE_HOLLOW, MythicMetalsIngredient.UR_INGOT, 8);
			createCrop("metallurgium", TIER_5, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.UR_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.UR_INGOT, TIER_4}, true, SQUARE_HOLLOW, MythicMetalsIngredient.METALLURGIUM_INGOT, 8);
			createCrop("adamantite", TIER_6, Mods.MythMet, CMT_ALL, new String[]{MythicMetalsTex.METALLURGIUM_BLOCK}, ITEM_RECIPE, new String[]{MythicMetalsIngredient.METALLURGIUM_INGOT, TIER_5}, true, SQUARE_HOLLOW, MythicMetalsIngredient.ADAMANTITE_INGOT, 8);
		}

		//Astromine
		if(Astromine){
			createCrop("asterite", TIER_3, Mods.Astro, CMT_ALL, new String[]{AstromineTex.ASTERITE_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.ASTERITE, TIER_3}, true, SQUARE_HOLLOW, AstromineIngredient.ASTERITE, 8);
			createCrop("fools_gold", TIER_3, Mods.Astro, CMT_ALL, new String[]{AstromineTex.FOOLS_GOLD_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.FOOLS_GOLD_INGOT, TIER_3}, true, SQUARE_HOLLOW, AstromineIngredient.FOOLS_GOLD_INGOT, 8);
			createCrop("galaxium", TIER_3, Mods.Astro, CMT_ALL, new String[]{AstromineTex.GALAXIUM_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.GALAXIUM, TIER_3}, true, SQUARE, AstromineIngredient.GALAXIUM, 1);
			createCrop("lunum", TIER_5, Mods.Astro, CMT_ALL, new String[]{AstromineTex.LUNUM_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.LUNUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, AstromineIngredient.LUNUM_INGOT, 8);
			createCrop("meteoric_steel", TIER_3, Mods.Astro, CMT_ALL, new String[]{AstromineTex.METEORIC_STEEL_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.METEORIC_STEEL_INGOT, TIER_3}, true, SQUARE_HOLLOW, AstromineIngredient.METEORIC_STEEL_INGOT, 8);
			createCrop("metite", TIER_3, Mods.Astro, CMT_ALL, new String[]{AstromineTex.METITE_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.METITE_INGOT, TIER_3}, true, SQUARE_HOLLOW, AstromineIngredient.METITE_INGOT, 8);
			createCrop("rose_gold", TIER_3, Mods.Astro, CMT_ALL, new String[]{AstromineTex.ROSE_GOLD_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.ROSE_GOLD_INGOT, TIER_3}, true, SQUARE_HOLLOW, AstromineIngredient.ROSE_GOLD_INGOT, 8);
			createCrop("stellum", TIER_3, Mods.Astro, CMT_ALL, new String[]{AstromineTex.STELLUM_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.STELLUM_INGOT, TIER_3}, true, SQUARE_HOLLOW, AstromineIngredient.STELLUM_INGOT, 8);
			createCrop("sterling_silver", TIER_3, Mods.Astro, CMT_ALL, new String[]{AstromineTex.STERLING_SILVER_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.STERLING_SILVER_INGOT, TIER_3}, true, SQUARE_HOLLOW, AstromineIngredient.STERLING_SILVER_INGOT, 8);
			createCrop("univite", TIER_6, Mods.Astro, CMT_ALL, new String[]{AstromineTex.UNIVITE_BLOCK}, ITEM_RECIPE, new String[]{AstromineIngredient.BLOCK_OF_UNIVITE, TIER_6}, true, SQUARE, AstromineIngredient.UNIVITE_NUGGET, 1);
		}
		
		//Oh The Biomes You'll Go (BYG)
		if(BYG){
			createCrop("aspen_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.ASPEN_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.ASPEN_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.ASPEN_LOG, 8);
			createCrop("baobab_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.BAOBAB_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.BAOBAB_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BAOBAB_LOG, 8);
			createCrop("blue_enchanted_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.BLUE_ENCHANTED_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.BLUE_ENCHANTED_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BLUE_ENCHANTED_LOG, 8);
			createCrop("bulbis_stem", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.BULBIS_STEM}, ITEM_RECIPE, new String[]{BYGIngredient.BULBIS_STEM, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BULBIS_STEM, 8);
			createCrop("cherry_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.CHERRY_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.CHERRY_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.CHERRY_LOG, 8);
			createCrop("cika_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.CIKA_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.CIKA_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.CIKA_LOG, 8);
			createCrop("cypress_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.CYPRESS_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.CYPRESS_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.CYPRESS_LOG, 8);
			createCrop("ebony_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.EBONY_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.EBONY_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.EBONY_LOG, 8);
			createCrop("embur_pedu", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.EMBUR_PEDU}, ITEM_RECIPE, new String[]{BYGIngredient.EMBUR_PEDU, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.EMBUR_PEDU, 8);
			createCrop("ether_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.ETHER_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.ETHER_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.ETHER_LOG, 8);
			createCrop("fir_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.FIR_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.FIR_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.FIR_LOG, 8);
			createCrop("glacial_oak_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.GLACIAL_OAK_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.GLACIAL_OAK_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.GLACIAL_OAK_LOG, 8);
			createCrop("green_enchanted_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.GREEN_ENCHANTED_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.GREEN_ENCHANTED_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.GREEN_ENCHANTED_LOG, 8);
			createCrop("holly_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.HOLLY_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.HOLLY_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.HOLLY_LOG, 8);
			createCrop("jacaranda_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.JACARANDA_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.JACARANDA_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.JACARANDA_LOG, 8);
			createCrop("joshua_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.JOSHUA_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.JOSHUA_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.JOSHUA_LOG, 8);
			createCrop("lament_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.LAMENT_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.LAMENT_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.LAMENT_LOG, 8);
			createCrop("mahogany_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.MAHOGANY_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.MAHOGANY_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.MAHOGANY_LOG, 8);
			createCrop("mangrove_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.MANGROVE_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.MANGROVE_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.MANGROVE_LOG, 8);
			createCrop("maple_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.MAPLE_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.MAPLE_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.MAPLE_LOG, 8);
			createCrop("nightshade_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.NIGHTSHADE_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.NIGHTSHADE_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.NIGHTSHADE_LOG, 8);
			createCrop("palm_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.PALM_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.PALM_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PALM_LOG, 8);
			createCrop("palo_verde_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.PALO_VERDE_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.PALO_VERDE_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PALO_VERDE_LOG, 8);
			createCrop("pine_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.PINE_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.PINE_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PINE_LOG, 8);
			createCrop("rainbow_eucalyptus_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.RAINBOW_EUCALYPTUS_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.RAINBOW_EUCALYPTUS_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.RAINBOW_EUCALYPTUS_LOG, 8);
			createCrop("skyris_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.SKYRIS_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.SKYRIS_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.SKYRIS_LOG, 8);
			createCrop("sythian_stem", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.SYTHIAN_STEM}, ITEM_RECIPE, new String[]{BYGIngredient.SYTHIAN_STEM, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.SYTHIAN_STEM, 8);
			createCrop("willow_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.WILLOW_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.WILLOW_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.WILLOW_LOG, 8);
			createCrop("witch_hazel_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.WITCH_HAZEL_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.WITCH_HAZEL_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.WITCH_HAZEL_LOG, 8);
			createCrop("withering_oak_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.WITHERING_OAK_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.WITHERING_OAK_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.WITHERING_OAK_LOG, 8);
			createCrop("zelkova_log", TIER_1, Mods.BYG, CMT_LOG, new String[]{BYGTex.ZELKOVA_LOG}, ITEM_RECIPE, new String[]{BYGIngredient.ZELKOVA_LOG, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.ZELKOVA_LOG, 8);
			createCrop("ametrine_gem", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.AMETRINE_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.AMETRINE_GEMS, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.AMETRINE_GEMS, 8);
			createCrop("anthracite", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.ANTHRACITE_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.ANTHRACITE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.ANTHRACITE, 8);
			createCrop("black_ice", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.BLACK_ICE}, ITEM_RECIPE, new String[]{BYGIngredient.BLACK_ICE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BLACK_ICE, 8);
			createCrop("black_sand", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.BLACK_SAND}, ITEM_RECIPE, new String[]{BYGIngredient.BLACK_SAND, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BLACK_SAND, 8);
			createCrop("blue_glowcane", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.BLUE_GLOWCANE_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.BLUE_GLOWCANE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BLUE_GLOWCANE, 8);
			createCrop("blue_netherrack", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.BLUE_NETHERRACK}, ITEM_RECIPE, new String[]{BYGIngredient.BLUE_NETHERRACK, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BLUE_NETHERRACK, 8);
			createCrop("blue_sand", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.BLUE_SAND}, ITEM_RECIPE, new String[]{BYGIngredient.BLUE_SAND, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BLUE_SAND, 8);
			createCrop("brimstone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.BRIMSTONE}, ITEM_RECIPE, new String[]{BYGIngredient.BRIMSTONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.BRIMSTONE, 8);
			createCrop("cryptic_stone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.CRYPTIC_STONE}, ITEM_RECIPE, new String[]{BYGIngredient.CRYPTIC_STONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.CRYPTIC_STONE, 8);
			createCrop("dacite", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.DACITE}, ITEM_RECIPE, new String[]{BYGIngredient.DACITE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.DACITE, 8);
			createCrop("ether_soil", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.ETHER_SOIL}, ITEM_RECIPE, new String[]{BYGIngredient.ETHER_SOIL, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.ETHER_SOIL, 8);
			createCrop("ether_stone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.ETHER_STONE}, ITEM_RECIPE, new String[]{BYGIngredient.ETHER_STONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.ETHER_STONE, 8);
			createCrop("frost_magma", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.FROST_MAGMA}, ITEM_RECIPE, new String[]{BYGIngredient.FROST_MAGMA, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.FROST_MAGMA, 8);
			createCrop("lignite", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.LIGNITE_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.LIGNITE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.LIGNITE, 8);
			createCrop("magmatic_stone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.MAGMATIC_STONE}, ITEM_RECIPE, new String[]{BYGIngredient.MAGMATIC_STONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.MAGMATIC_STONE, 8);
			createCrop("meadow_dirt", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.MEADOW_DIRT}, ITEM_RECIPE, new String[]{BYGIngredient.MEADOW_DIRT, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.MEADOW_DIRT, 8);
			createCrop("mossy_netherrack", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.MOSSY_NETHERRACK}, ITEM_RECIPE, new String[]{BYGIngredient.MOSSY_NETHERRACK, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.MOSSY_NETHERRACK, 8);
			createCrop("mossy_stone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.MOSSY_STONE}, ITEM_RECIPE, new String[]{BYGIngredient.MOSSY_STONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.MOSSY_STONE, 8);
			createCrop("mud", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.MUD}, ITEM_RECIPE, new String[]{BYGIngredient.MUD, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.MUD, 8);
			createCrop("nylium_soul_sand", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.NYLIUM_SOUL_SAND}, ITEM_RECIPE, new String[]{BYGIngredient.NYLIUM_SOUL_SAND, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.NYLIUM_SOUL_SAND, 8);
			createCrop("peat", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.PEAT}, ITEM_RECIPE, new String[]{BYGIngredient.PEAT, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PEAT, 8);
			createCrop("pendorite_scrap", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.PENDORITE_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.PENDORITE_SCRAPS, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PENDORITE_SCRAPS, 8);
			createCrop("pink_sand", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.PINK_SAND}, ITEM_RECIPE, new String[]{BYGIngredient.PINK_SAND, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PINK_SAND, 8);
			createCrop("pollen_dust", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.POLLEN_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.POLLEN_DUST, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.POLLEN_DUST, 8);
			createCrop("purple_glowcane", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.PURPLE_GLOWCANE_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.PURPLE_GLOWCANE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PURPLE_GLOWCANE, 8);
			createCrop("purple_sand", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.PURPLE_SAND}, ITEM_RECIPE, new String[]{BYGIngredient.PURPLE_SAND, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PURPLE_SAND, 8);
			createCrop("purpur_stone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.PURPUR_STONE}, ITEM_RECIPE, new String[]{BYGIngredient.PURPUR_STONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.PURPUR_STONE, 8);
			createCrop("quartzite_sand", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.QUARTZITE_SAND}, ITEM_RECIPE, new String[]{BYGIngredient.QUARTZITE_SAND, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.QUARTZITE_SAND, 8);
			createCrop("red_glowcane", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.RED_GLOWCANE_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.RED_GLOWCANE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.RED_GLOWCANE, 8);
			createCrop("red_rock", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.RED_ROCK}, ITEM_RECIPE, new String[]{BYGIngredient.RED_ROCK, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.RED_ROCK, 8);
			createCrop("rocky_stone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.ROCKY_STONE}, ITEM_RECIPE, new String[]{BYGIngredient.ROCKY_STONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.ROCKY_STONE, 8);
			createCrop("scoria_stone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.SCORIA_STONE}, ITEM_RECIPE, new String[]{BYGIngredient.SCORIA_STONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.SCORIA_STONE, 8);
			createCrop("soapstone", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.SOAPSTONE}, ITEM_RECIPE, new String[]{BYGIngredient.SOAPSTONE, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.SOAPSTONE, 8);
			createCrop("subzero_ash", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.SUBZERO_ASH}, ITEM_RECIPE, new String[]{BYGIngredient.SUBZERO_ASH, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.SUBZERO_ASH, 8);
			createCrop("therium_shard", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.THERIUM_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.THERIUM_SHARD, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.THERIUM_SHARD, 8);
			createCrop("warped_coral", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.WARPED_CORAL_BLOCK}, ITEM_RECIPE, new String[]{BYGIngredient.WARPED_CORAL, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.WARPED_CORAL, 8);
			createCrop("white_sand", TIER_1, Mods.BYG, CMT_ALL, new String[]{BYGTex.WHITE_SAND}, ITEM_RECIPE, new String[]{BYGIngredient.WHITE_SAND, TIER_1}, true, SQUARE_HOLLOW, BYGIngredient.WHITE_SAND, 8);
		}
		
		//Botania
		if(Botania){
			createCrop("livingrock", TIER_1, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.LIVINGROCK}, ITEM_RECIPE, new String[]{BotaniaIngredient.LIVINGROCK, TIER_1}, true, SQUARE_HOLLOW, BotaniaIngredient.LIVINGROCK, 8);
			createCrop("livingwood", TIER_1, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.LIVINGWOOD, ResourceCropsTex.GRADIENT_BROWN}, ITEM_RECIPE, new String[]{BotaniaIngredient.LIVINGWOOD, TIER_1}, true, SQUARE_HOLLOW, BotaniaIngredient.LIVINGWOOD, 8);
			createCrop("manasteel", TIER_3, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.MANASTEEL_BLOCK}, ITEM_RECIPE, new String[]{BotaniaIngredient.MANASTEEL_INGOT, TIER_3}, true, SQUARE_HOLLOW, BotaniaIngredient.MANASTEEL_INGOT, 8);
			createCrop("mana_diamond", TIER_5, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.MANA_DIAMOND_BLOCK}, ITEM_RECIPE, new String[]{BotaniaIngredient.MANA_DIAMOND, TIER_5}, true, SQUARE, BotaniaIngredient.MANA_DIAMOND, 1);
			createCrop("mana_pearl", TIER_3, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.MANA_PEARL_BLOCK}, ITEM_RECIPE, new String[]{BotaniaIngredient.MANA_PEARL, TIER_3}, true, SQUARE_HOLLOW, BotaniaIngredient.MANA_PEARL, 8);
			createCrop("terrasteel", TIER_5, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.TERRASTEEL_BLOCK, ResourceCropsTex.GRADIENT_GREEN}, ITEM_RECIPE, new String[]{BotaniaIngredient.TERRASTEEL_INGOT, TIER_5}, true, SQUARE_HOLLOW, BotaniaIngredient.TERRASTEEL_INGOT, 4);
			createCrop("elementium", TIER_4, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.ELEMENTIUM_BLOCK}, ITEM_RECIPE, new String[]{BotaniaIngredient.ELEMENTIUM_INGOT, TIER_4}, true, SQUARE_HOLLOW, BotaniaIngredient.ELEMENTIUM_INGOT, 2);
			createCrop("dragonstone", TIER_4, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.DRAGONSTONE_BLOCK}, ITEM_RECIPE, new String[]{BotaniaIngredient.DRAGONSTONE, TIER_4}, true, SQUARE_HOLLOW, BotaniaIngredient.DRAGONSTONE, 2);
			createCrop("pixie_dust", TIER_4, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.PIXIE_DUST_BLOCK}, ITEM_RECIPE, new String[]{BotaniaIngredient.PIXIE_DUST, TIER_4}, true, SQUARE_HOLLOW, BotaniaIngredient.PIXIE_DUST, 8);
			createCrop("gaia_spirit_ingot", TIER_6, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.GAIA_SPIRIT_INGOT_BLOCK}, ITEM_RECIPE, new String[]{BotaniaIngredient.GAIA_SPIRIT_INGOT, TIER_6}, true, SQUARE, BotaniaIngredient.GAIA_SPIRIT_INGOT, 1);
			createCrop("dreamwood", TIER_1, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.DREAMWOOD}, ITEM_RECIPE, new String[]{BotaniaIngredient.DREAMWOOD, TIER_1}, true, SQUARE_HOLLOW, BotaniaIngredient.DREAMWOOD, 8);
			createCrop("smokey_quartz", TIER_3, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.SMOKEY_QUARTZ_SIDE, ResourceCropsTex.GRADIENT_BLACK}, ITEM_RECIPE, new String[]{BotaniaIngredient.SMOKEY_QUARTZ, TIER_3}, true, SQUARE_HOLLOW, BotaniaIngredient.SMOKEY_QUARTZ, 8);
			createCrop("mana_quartz", TIER_3, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.MANA_QUARTZ_SIDE, ResourceCropsTex.GRADIENT_LIGHT_BLUE}, ITEM_RECIPE, new String[]{BotaniaIngredient.MANA_QUARTZ, TIER_3}, true, SQUARE_HOLLOW, BotaniaIngredient.MANA_QUARTZ, 8);
			createCrop("lavender_quartz", TIER_3, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.LAVENDER_QUARTZ_SIDE, ResourceCropsTex.GRADIENT_HALVED_PURPLE}, ITEM_RECIPE, new String[]{BotaniaIngredient.LAVENDER_QUARTZ, TIER_3}, true, SQUARE_HOLLOW, BotaniaIngredient.LAVENDER_QUARTZ, 8);
			createCrop("red_quartz", TIER_3, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.RED_QUARTZ_SIDE, ResourceCropsTex.GRADIENT_RED}, ITEM_RECIPE, new String[]{BotaniaIngredient.RED_QUARTZ, TIER_3}, true, SQUARE_HOLLOW, BotaniaIngredient.RED_QUARTZ, 8);
			createCrop("elven_quartz", TIER_3, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.ELVEN_QUARTZ_SIDE, ResourceCropsTex.GRADIENT_GREEN}, ITEM_RECIPE, new String[]{BotaniaIngredient.ELVEN_QUARTZ, TIER_3}, true, SQUARE_HOLLOW, BotaniaIngredient.ELVEN_QUARTZ, 8);
			createCrop("sunny_quartz", TIER_3, Mods.Bota, CMT_ALL, new String[]{BotaniaTex.SUNNY_QUARTZ_SIDE, ResourceCropsTex.GRADIENT_YELLOW}, ITEM_RECIPE, new String[]{BotaniaIngredient.SUNNY_QUARTZ, TIER_3}, true, SQUARE_HOLLOW, BotaniaIngredient.SUNNY_QUARTZ, 8);
		}
		
		//Conjuring
		if(Conjuring){
			createCrop("soul_alloy", TIER_5, Mods.Conjuring, CMT_ALL, new String[]{ConjuringTex.SOUL_ALLOY_BLOCK}, ITEM_RECIPE, new String[]{ConjuringIngredient.SOUL_ALLOY, TIER_5}, true, SQUARE, ConjuringIngredient.SOUL_ALLOY, 2);
			createCrop("soul_rod", TIER_5, Mods.Conjuring, CMT_ALL, new String[]{ConjuringTex.SOUL_ROD_BLOCK}, ITEM_RECIPE, new String[]{ConjuringIngredient.SOUL_ROD, TIER_5}, true, STAR, ConjuringIngredient.SOUL_ROD, 4);
			createCrop("soul_brick", TIER_5, Mods.Conjuring, CMT_ALL, new String[]{ConjuringTex.SOUL_BRICK_BLOCK}, ITEM_RECIPE, new String[]{ConjuringIngredient.SOUL_BRICK, TIER_5}, true, SQUARE_HOLLOW, ConjuringIngredient.SOUL_BRICK, 4);
			createCrop("conjuration_essence", TIER_4, Mods.Conjuring, CMT_ALL, new String[]{ConjuringTex.CONJURATION_ESSENCE_BLOCK}, ITEM_RECIPE, new String[]{ConjuringIngredient.CONJURATION_ESSENCE, TIER_4}, true, SQUARE, ConjuringIngredient.CONJURATION_ESSENCE, 1);
			createCrop("lesser_conjuration_essence", TIER_3, Mods.Conjuring, CMT_ALL, new String[]{ConjuringTex.CONJURATION_ESSENCE_LESSER_BLOCK}, ITEM_RECIPE, new String[]{ConjuringIngredient.LESSER_CONJURATION_ESSENCE, TIER_3}, true, SQUARE, ConjuringIngredient.LESSER_CONJURATION_ESSENCE, 2);
		}

		//Deep Mob Learning: Refabricated
		if(DeepMobLearning){
			createCrop("soot_covered_redstone", TIER_4, Mods.DML, CMT_ALL, new String[]{DeepMobLearningTex.SOOT_COVERED_REDSTONE_BLOCK, ResourceCropsTex.GRADIENT_RED}, ITEM_RECIPE, new String[]{DeepMobLearningIngredient.SOOT_COVERED_REDSTONE, TIER_4}, true, SQUARE_HOLLOW, DeepMobLearningIngredient.SOOT_COVERED_REDSTONE, 8);
			createCrop("glitch_ingot", TIER_6, Mods.DML, CMT_ALL, new String[]{DeepMobLearningTex.GLITCH_INGOT_BLOCK, ResourceCropsTex.GRADIENT_TEAL}, ITEM_RECIPE, new String[]{DeepMobLearningIngredient.GLITCH_INGOT, TIER_6}, true, SQUARE_HOLLOW, DeepMobLearningIngredient.GLITCH_INGOT, 8);
		}

		//BetterEnd
		if(BetterEnd){
			createCrop("ender_shard", TIER_4, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.ENDER_SHARD_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.ENDER_SHARD, TIER_4}, true, SQUARE, BetterEndIngredient.ENDER_SHARD, 2);
			createCrop("aeternium", TIER_4, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.AETERNIUM_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.AETERNIUM_INGOT, TIER_4}, true, SQUARE_HOLLOW, BetterEndIngredient.AETERNIUM_INGOT, 8);
			createCrop("crystal_shard", TIER_4, Mods.BetterE, CMT_RC, new String[]{BetterEndTex.CRYSTAL_SHARD_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.CRYSTAL_SHARDS, TIER_4}, true, SQUARE_HOLLOW, BetterEndIngredient.CRYSTAL_SHARDS, 8);
			createCrop("amber_gem", TIER_4, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.AMBER_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.AMBER_GEM, TIER_4}, true, SQUARE_HOLLOW, BetterEndIngredient.AMBER_GEM, 8);
			createCrop("hydralux_petal", TIER_4, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.HYDRALUX_PETAL_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.HYDRALUX_PETAL, TIER_4}, true, PETAL, BetterEndIngredient.HYDRALUX_PETAL, 2);
			createCrop("eternal_crystal", TIER_4, Mods.BetterE, CMT_RC, new String[]{BetterEndTex.ETERNAL_CRYSTAL_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.ETERNAL_CRYSTAL, TIER_4}, true, SQUARE, BetterEndIngredient.ETERNAL_CRYSTAL, 1);
			createCrop("enchanted_petal", TIER_4, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.ENCHANTED_PETAL_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.ENCHANTED_PETAL, TIER_4}, true, PETAL, BetterEndIngredient.ENCHANTED_PETAL, 1);
			createCrop("end_stone_dust", TIER_1, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.END_STONE_DUST}, ITEM_RECIPE, new String[]{BetterEndIngredient.END_STONE_DUST, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.END_STONE_DUST, 8);
			createCrop("flavolite", TIER_1, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.FLAVOLITE}, ITEM_RECIPE, new String[]{BetterEndIngredient.FLAVOLITE, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.FLAVOLITE, 8);
			createCrop("violecite", TIER_1, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.VIOLECITE}, ITEM_RECIPE, new String[]{BetterEndIngredient.VIOLECITE, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.VIOLECITE, 8);
			createCrop("sulfuric_rock", TIER_1, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.SULFURIC_ROCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.SULFURIC_ROCK, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.SULFURIC_ROCK, 8);
			createCrop("missing_tile", TIER_1, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.MISSING_TILE}, ITEM_RECIPE, new String[]{BetterEndIngredient.MISSING_TILE, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.MISSING_TILE, 8);
			createCrop("mossy_glowshroom_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.MOSSY_GLOWSHROOM_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.MOSSY_GLOWSHROOM_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.MOSSY_GLOWSHROOM_LOG, 8);
			createCrop("pythadendron_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.PYTHADENDRON_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.PYTHADENDRON_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.PYTHADENDRON_LOG, 8);
			createCrop("end_lotus_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.END_LOTUS_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.END_LOTUS_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.END_LOTUS_LOG, 8);
			createCrop("lacugrove_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.LACUGROVE_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.LACUGROVE_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.LACUGROVE_LOG, 8);
			createCrop("dragon_tree_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.DRAGON_TREE_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.DRAGON_TREE_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.DRAGON_TREE_LOG, 8);
			createCrop("tenanea_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.TENANEA_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.TENANEA_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.TENANEA_LOG, 8);
			createCrop("helix_tree_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.HELIX_TREE_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.HELIX_TREE_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.HELIX_TREE_LOG, 8);
			createCrop("umbrella_tree_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.UMBRELLA_TREE_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.UMBRELLA_TREE_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.UMBRELLA_TREE_LOG, 8);
			createCrop("jellyshroom_log", TIER_1, Mods.BetterE, CMT_LOG, new String[]{BetterEndTex.JELLYSHROOM_LOG}, ITEM_RECIPE, new String[]{BetterEndIngredient.JELLYSHROOM_LOG, TIER_1}, true, SQUARE_HOLLOW, BetterEndIngredient.JELLYSHROOM_LOG, 8);
			createCrop("thallasium", TIER_4, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.THALLASIUM_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.THALLASIUM_INGOT, TIER_4}, true, SQUARE_HOLLOW, BetterEndIngredient.THALLASIUM_INGOT, 8);
			createCrop("terminite", TIER_4, Mods.BetterE, CMT_ALL, new String[]{BetterEndTex.TERMINITE_BLOCK}, ITEM_RECIPE, new String[]{BetterEndIngredient.TERMINITE_INGOT, TIER_4}, true, SQUARE_HOLLOW, BetterEndIngredient.TERMINITE_INGOT, 8);
		}
		
		//The Aether Reborn
		if(Aether){
			createCrop("aether_dirt", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.AETHER_DIRT), ITEM_RECIPE, new String[]{AetherIngredient.AETHER_DIRT, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.AETHER_DIRT, 8);
			createCrop("holystone", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.HOLYSTONE), ITEM_RECIPE, new String[]{AetherIngredient.HOLYSTONE, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.HOLYSTONE, 8);
			createCrop("mossy_holystone", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.HOLYSTONE_MOSSY), ITEM_RECIPE, new String[]{AetherIngredient.MOSSY_HOLYSTONE, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.MOSSY_HOLYSTONE, 8);
			createCrop("icestone", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.ICESTONE), ITEM_RECIPE, new String[]{AetherIngredient.ICESTONE, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.ICESTONE, 8);
			createCrop("quicksoil", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.QUICKSOIL), ITEM_RECIPE, new String[]{AetherIngredient.QUICKSOIL, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.QUICKSOIL, 8);
			createCrop("quicksoil_glass", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.QUICKSOIL_GLASS), NO_RECIPE, new String[]{"",""}, true, SQUARE_HOLLOW, AetherIngredient.QUICKSOIL_GLASS, 8);
			createCrop("skyroot_log", TIER_1, Mods.Aether, Mods.AetherShort, CMT_LOG, aetherTex(AetherTex.SKYROOT_LOG), ITEM_RECIPE, new String[]{AetherIngredient.SKYROOT_LOG, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.SKYROOT_LOG, 8);
			createCrop("golden_oak_log", TIER_1, Mods.Aether, Mods.AetherShort, CMT_LOG, aetherTex(AetherTex.GOLDEN_OAK_LOG), ITEM_RECIPE, new String[]{AetherIngredient.GOLDEN_OAK_LOG, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.GOLDEN_OAK_LOG, 8);
			createCrop("crystal_log", TIER_1, Mods.Aether, Mods.AetherShort, CMT_LOG, aetherTex(AetherTex.CRYSTAL_LOG), ITEM_RECIPE, new String[]{AetherIngredient.CRYSTAL_LOG, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.CRYSTAL_LOG, 8);
			createCrop("wisteria_log", TIER_1, Mods.Aether, Mods.AetherShort, CMT_LOG, aetherTex(AetherTex.WISTERIA_LOG), ITEM_RECIPE, new String[]{AetherIngredient.WISTERIA_LOG, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.WISTERIA_LOG, 8);
			createCrop("blue_aercloud", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.AERCLOUD_BLUE), ITEM_RECIPE, new String[]{AetherIngredient.BLUE_AERCLOUD, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.BLUE_AERCLOUD, 8);
			createCrop("cold_aercloud", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.AERCLOUD_COLD), ITEM_RECIPE, new String[]{AetherIngredient.COLD_AERCLOUD, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.COLD_AERCLOUD, 8);
			createCrop("golden_aercloud", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.AERCLOUD_GOLD), ITEM_RECIPE, new String[]{AetherIngredient.GOLDEN_AERCLOUD, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.GOLDEN_AERCLOUD, 8);
			createCrop("pink_aercloud", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.AERCLOUD_PINK), ITEM_RECIPE, new String[]{AetherIngredient.PINK_AERCLOUD, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.PINK_AERCLOUD, 8);
			createCrop("aerogel", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.AEROGEL), ITEM_RECIPE, new String[]{AetherIngredient.AEROGEL, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.AEROGEL, 8);
			createCrop("blue_berry", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.BLUE_BERRY_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.BLUE_BERRY, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.BLUE_BERRY, 8);
			createCrop("enchanted_blue_berry", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.ENCHANTED_BLUE_BERRY_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.ENCHANTED_BLUE_BERRY, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.ENCHANTED_BLUE_BERRY, 8);
			createCrop("candy_cane", TIER_1, Mods.Aether, Mods.AetherShort, CMT_RC, aetherTex(AetherTex.CANDY_CANE_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.CANDY_CANE, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.CANDY_CANE, 8);
			createCrop("ginger_bread_man", TIER_1, Mods.Aether, Mods.AetherShort, CMT_RC, aetherTex(AetherTex.GINGER_BREAD_MAN_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.GINGER_BREAD_MAN, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.GINGER_BREAD_MAN, 8);
			createCrop("blue_gummy_swet", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.GUMMY_SWET_BLUE), ITEM_RECIPE, new String[]{AetherIngredient.BLUE_GUMMY_SWET, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.BLUE_GUMMY_SWET, 8);
			createCrop("golden_gummy_swet", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.GUMMY_SWET_GOLD), ITEM_RECIPE, new String[]{AetherIngredient.GOLDEN_GUMMY_SWET, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.GOLDEN_GUMMY_SWET, 8);
			createCrop("swet_ball", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.SWET_BALL_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.SWET_BALL, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.SWET_BALL, 8);
			createCrop("white_apple", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.WHITE_APPLE_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.WHITE_APPLE, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.WHITE_APPLE, 8);
			createCrop("golden_amber", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.GOLDEN_AMBER_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.GOLDEN_AMBER, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.GOLDEN_AMBER, 8);
			createCrop("aechor_petal", TIER_1, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.AECHOR_PETAL_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.AECHOR_PETAL, TIER_1}, true, SQUARE_HOLLOW, AetherIngredient.AECHOR_PETAL, 8);
			createCrop("ambrosium_shard", TIER_2, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.AMBROSIUM_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.AMBROSIUM_SHARD, TIER_2}, true, SQUARE_HOLLOW, AetherIngredient.AMBROSIUM_SHARD, 8);
			createCrop("zanite_gemstone", TIER_3, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.ZANITE_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.ZANITE_GEMSTONE, TIER_3}, true, SQUARE_HOLLOW, AetherIngredient.ZANITE_GEMSTONE, 8);
			createCrop("gravitite_gemstone", TIER_5, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.GRAVITITE_BLOCK), ITEM_RECIPE, new String[]{AetherIngredient.GRAVITITE_GEMSTONE, TIER_5}, true, STAR, AetherIngredient.GRAVITITE_GEMSTONE, 1);
			createCrop("angelic_stone", TIER_2, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.ANGELIC_STONE), ITEM_RECIPE, new String[]{AetherIngredient.ANGELIC_STONE, TIER_2}, true, SQUARE_HOLLOW, AetherIngredient.ANGELIC_STONE, 8);
			createCrop("light_angelic_stone", TIER_2, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.ANGELIC_LIGHT_STONE), ITEM_RECIPE, new String[]{AetherIngredient.LIGHT_ANGELIC_STONE, TIER_2}, true, SQUARE_HOLLOW, AetherIngredient.LIGHT_ANGELIC_STONE, 8);
			createCrop("carved_stone", TIER_2, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.CARVED_STONE), ITEM_RECIPE, new String[]{AetherIngredient.CARVED_STONE, TIER_3}, true, SQUARE_HOLLOW, AetherIngredient.CARVED_STONE, 8);
			createCrop("light_carved_stone", TIER_2, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.CARVED_STONE), ITEM_RECIPE, new String[]{AetherIngredient.CARVED_STONE, TIER_3}, true, SQUARE_HOLLOW, AetherIngredient.LIGHT_CARVED_STONE, 8);
			createCrop("hellfire_stone", TIER_3, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.HELLFIRE_STONE), ITEM_RECIPE, new String[]{AetherIngredient.HELLFIRE_STONE, TIER_3}, true, SQUARE_HOLLOW, AetherIngredient.HELLFIRE_STONE, 8);
			createCrop("light_hellfire_stone", TIER_3, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.HELLFIRE_LIGHT_STONE), ITEM_RECIPE, new String[]{AetherIngredient.LIGHT_HELLFIRE_STONE, TIER_3}, true, SQUARE_HOLLOW, AetherIngredient.LIGHT_HELLFIRE_STONE, 8);
			createCrop("sentry_stone", TIER_4, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.SENTRY_STONE), ITEM_RECIPE, new String[]{AetherIngredient.SENTRY_STONE, TIER_4}, true, SQUARE_HOLLOW, AetherIngredient.SENTRY_STONE, 8);
			createCrop("light_sentry_stone", TIER_4, Mods.Aether, Mods.AetherShort, CMT_ALL, aetherTex(AetherTex.SENTRY_LIGHT_STONE), ITEM_RECIPE, new String[]{AetherIngredient.LIGHT_SENTRY_STONE, TIER_4}, true, SQUARE_HOLLOW, AetherIngredient.LIGHT_SENTRY_STONE, 8);
		}
		
		if(ResourceCrops){
			createCrop("404", Strings.TIER_UNKNOWN, Mods.ResCrop, CMT_ALL, new String[]{"missing_texture", ResourceCropsTex.BLOCK_404}, new Boolean[]{false,false}, NO_INGREDIENT, true, SQUARE_HOLLOW, VanillaIngredient.BARRIER, 1);
		}
	}

	public static String[] aetherTex(String input){
		return new String[]{input, ResourceCropsTex.LEAVES_AETHER, ResourceCropsTex.STEM_AETHER};
	}

	public static ItemSeeds itemSetting(BlockCrop block, String Mod, String name, String tier){
		if(Mods.checkDevEnv()){
			return new ItemSeeds(block,
			new FabricItemSettings().group(Main.GROUP),
			tier,
			Mod,
			name
		);
		}else{
			return new ItemSeeds(block,
			new FabricItemSettings().group(Main.GROUP_SEEDS),
			tier,
			Mod,
			name
		);
		}
	}

	public static ItemSeeds itemSetting(BlockCrop block, String Mod, String name, String tier, Boolean enableGlint){
		if(Mods.checkDevEnv()){
			return new ItemSeeds(block,
			new FabricItemSettings().group(Main.GROUP),
			tier,
			Mod,
			name,
			enableGlint
		);
		}else{
			return new ItemSeeds(block,
			new FabricItemSettings().group(Main.GROUP_SEEDS),
			tier,
			Mod,
			name,
			enableGlint
		);
		}
	}
	
	public static final Object createCrop(String cropName, String tier, String modNameToCheck, String modNameToLabel, String cropModelType, String[] resourceTex, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable, Boolean enableGlint, String[] pattern, String outputItem, int outputAmount){
		Block FRED = crop(cropName, tier, modNameToCheck, modNameToLabel);
		ItemSeeds WILMA = seeds(cropName, tier, modNameToCheck, modNameToLabel, FRED);
		essence(cropName, tier, modNameToCheck, modNameToLabel, pattern, outputItem, outputAmount);
		if(modNameToCheck==Mods.Astromine || modNameToCheck==Mods.AstromineCore){
			if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==true){RegisterCrop.addCrop(Mods.Astro, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);}
			if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==false){RegisterCrop.addCrop(Mods.Astro, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);}
			if(Mods.checkMod(Mods.Astromine)==false && Mods.checkMod(Mods.AstromineCore)==true){RegisterCrop.addCrop(Mods.Astro, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);}
		}else{
			if(Mods.checkMod(modNameToCheck)){
				Main.logDebugMessage(modNameToCheck + " detected, now registering BlockCrop: " + Mods.ResCrop + ":crop_" + modNameToLabel + "/" + cropName.toLowerCase() + ", using model: CropModelTypes." + cropModelType.toUpperCase());
				RegisterCrop.addCrop(modNameToLabel, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);
			}
		}
		return null;
	}
	
	public static final Object createCrop(String cropName, String tier, String modNameToCheck, String modNameToLabel, String cropModelType, String[] resourceTex, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable, String[] pattern, String outputItem, int outputAmount){
		return createCrop(cropName, tier, modNameToCheck, modNameToLabel, cropModelType, resourceTex, addRecipe, ingredients, addLootTable, false, pattern, outputItem, outputAmount);
	}
	
	public static final Object createCrop(String cropName, String tier, String modName, String cropModelType, String[] resourceTex, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable, String[] pattern, String outputItem, int outputAmount){
		return createCrop(cropName, tier, modName, modName, cropModelType, resourceTex, addRecipe, ingredients, addLootTable, false, pattern, outputItem, outputAmount);
	}
	
	public static final Object createCrop(String cropName, String tier, String modName, String cropModelType, String[] resourceTex, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable, Boolean enableGlint, String[] pattern, String outputItem, int outputAmount){
		return createCrop(cropName, tier, modName, modName, cropModelType, resourceTex, addRecipe, ingredients, addLootTable, enableGlint, pattern, outputItem, outputAmount);
	}
	public static BlockCrop crop(String cropName, String tier, String modNameToCheck, String modNameToLabel){
		return new BlockCrop(tier, modNameToLabel, cropName);
	}
	public static ItemSeeds seeds(String cropName, String tier, String modNameToCheck, String modNameToLabel, Block block, Boolean enableGlint){
		return new ItemSeeds((BlockCrop) block, new FabricItemSettings().group(Main.GROUP_SEEDS), tier, modNameToLabel, cropName, enableGlint);
	}
	public static ItemSeeds seeds(String cropName, String tier, String modNameToCheck, String modNameToLabel, Block block){
		return seeds(cropName, tier, modNameToCheck, modNameToLabel, block, false);
	}
	public static Item essence(String cropName, String tier, String modNameToCheck, String modNameToLabel, String[] pattern, String outputItem, int outputAmount){
		Item ITEM_DECLARATION = new ItemEssence(new Item.Settings().group(Main.GROUP_ESSENCE), tier, modNameToLabel, cropName, pattern, outputItem, outputAmount);
		RegisterItem.addEssenceItem(modNameToCheck, modNameToLabel, cropName, ITEM_DECLARATION);
		return null;
	}
	
	public static final Object createCropInternal(String cropName, String tier, String modName, String cropModelType, String[] resourceTex, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable, int hex, String[] pattern, String outputItem, int outputAmount){
		Block FRED = cropTinted(cropName.toLowerCase(), tier, modName, modName, hex);
		ItemSeeds WILMA = seedsTinted(cropName.toLowerCase(), tier, modName, modName, FRED, hex);
		essence(cropName.toLowerCase(), tier, modName, modName, pattern, outputItem, outputAmount);
		// Item DINO = essence(cropName.toLowerCase(), tier, modName, modName);
		Main.logDebugMessage(modName + " detected, now registering Internal BlockCrop: " + Mods.ResCrop + ":crop_" + modName + "/" + cropName.toLowerCase() + ", using model: CropModelTypes." + cropModelType.toUpperCase());
		RegisterCrop.addCrop(modName, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);
		
		// if(cropName.toLowerCase()=="tier_1"){
		// 	RegisterEntityLoot.loopThroughArrays(DINO, 1, 5, 5F, Entities.vanillaPassive);
		// 	RegisterEntityLoot.loopThroughArrays(DINO, 1, 5, 5F, Entities.vanillaNeutral);
		// 	RegisterEntityLoot.loopThroughArrays(DINO, 1, 5, 5.3F, Entities.vanillaHostile);
		// }else if(cropName.toLowerCase()=="tier_2"){
		// 	RegisterEntityLoot.loopThroughArrays(DINO, 1, 5, 1F, Entities.vanillaNeutral);
		// 	RegisterEntityLoot.loopThroughArrays(DINO, 1, 5, 1F, Entities.vanillaHostile);
		// }else if(cropName.toLowerCase()=="tier_3"){
		// 	RegisterEntityLoot.loopThroughArrays(DINO, 1, 5, 0.1F, Entities.vanillaHostile);
		// }else if(cropName.toLowerCase()=="tier_5"){
		// 	RegisterEntityLoot.loopThroughArrays(DINO, Entities.vanillaBoss);
		// }else if(cropName.toLowerCase()=="tier_6"){
		// 	RegisterEntityLoot.loopThroughArrays(DINO, 3, 9, 0.1F, Entities.vanillaBoss);
		// }
		return null;
	}
	
	public static final Object createCropTinted(String cropName, String tier, String modNameToCheck, String modNameToLabel, String cropModelType, String[] resourceTex, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable, int hex, String[] pattern, String outputItem, int outputAmount){
		Block FRED = cropTinted(cropName.toLowerCase(), tier, modNameToCheck, modNameToLabel, hex);
		ItemSeeds WILMA = seedsTinted(cropName.toLowerCase(), tier, modNameToCheck, modNameToLabel, FRED, hex);
		essenceTinted(cropName.toLowerCase(), tier, modNameToCheck, modNameToLabel, hex, pattern, outputItem, outputAmount);
		if(modNameToCheck==Mods.Astromine || modNameToCheck==Mods.AstromineCore){
			if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==true){RegisterCrop.addCrop(Mods.Astro, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);}
			if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==false){RegisterCrop.addCrop(Mods.Astro, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);}
			if(Mods.checkMod(Mods.Astromine)==false && Mods.checkMod(Mods.AstromineCore)==true){RegisterCrop.addCrop(Mods.Astro, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);}
		}else if(Mods.checkMod(modNameToCheck)){
			Main.logDebugMessage(modNameToCheck + " detected, now registering Tinted BlockCrop: " + Mods.ResCrop + ":crop_" + modNameToLabel + "/" + cropName.toLowerCase() + ", using model: CropModelTypes." + cropModelType.toUpperCase());
			RegisterCrop.addCrop(modNameToLabel, cropName.toLowerCase(), FRED, WILMA, resourceTex, cropModelType, addRecipe, ingredients, addLootTable);
		}
		return null;
	}
	
	public static final Object createCropTinted(String cropName, String tier, String modName, String cropModelType, String[] resourceTex, Boolean[] addRecipe, String[] ingredients, Boolean addLootTable, int hex, String[] pattern, String outputItem, int outputAmount){
		return createCropTinted(cropName.toLowerCase(), tier, modName, modName, cropModelType, resourceTex, addRecipe, ingredients, addLootTable, hex, pattern, outputItem, outputAmount);
	}
	
	
	
	public static BlockCrop cropTinted(String cropName, String tier, String modNameToCheck, String modNameToLabel, int hex){return new BlockCrop(tier, modNameToLabel, cropName, hex);}
	public static ItemSeeds seedsTinted(String cropName, String tier, String modNameToCheck, String modNameToLabel, Block block, int hex){return new ItemSeeds((BlockCrop) block, new FabricItemSettings().group(Main.GROUP_SEEDS), tier, modNameToLabel, cropName.toLowerCase(), hex);}
	
	
	public static Item essenceTinted(String cropName, String tier, String modNameToCheck, String modNameToLabel, int hex, String[] pattern, String outputItem, int outputAmount){
		Item ITEM_DECLARATION = new ItemEssence(new Item.Settings().group(Main.GROUP_ESSENCE), tier, modNameToLabel, cropName.toLowerCase(), hex, pattern, outputItem, outputAmount);
		RegisterItem.addEssenceItem(modNameToCheck, modNameToLabel, cropName.toLowerCase(), ITEM_DECLARATION);
		return null;
	}
	//Total Lines before registery rewrite(2-May-2021): 2135, after registry rewrite(2-May-2021): 644
}