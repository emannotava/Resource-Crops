package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.BYGTex;

import static com.mememan.resourcecrops.lib.ingredient.BYGIngredient.*;

public class BYG {
	public static void init(){
		if(Mods.checkMod(Mods.BYG)==true){
			RegisterCrop.addCrop(Mods.BYG, "aspen", Crops.ASPEN, Crops.ASPEN_ITEM, new String[]{BYGTex.LOG_ASPEN}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{ASPEN_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "baobab", Crops.BAOBAB, Crops.BAOBAB_ITEM, new String[]{BYGTex.LOG_BAOBAB}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{BAOBAB_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "blue_enchanted_log", Crops.BLUE_ENCHANTED_LOG, Crops.BLUE_ENCHANTED_LOG_ITEM, new String[]{BYGTex.LOG_BLUE_ENCHANTED}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{BLUE_ENCHANTED_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "bulbis", Crops.BULBIS, Crops.BULBIS_ITEM, new String[]{BYGTex.BULBIS_STEM}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{BULBIS_STEM, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "cherry", Crops.CHERRY, Crops.CHERRY_ITEM, new String[]{BYGTex.LOG_CHERRY}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{CHERRY_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "cika", Crops.CIKA, Crops.CIKA_ITEM, new String[]{BYGTex.LOG_CIKA}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{CIKA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "cypress", Crops.CYPRESS, Crops.CYPRESS_ITEM, new String[]{BYGTex.LOG_CYPRESS}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{CYPRESS_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "ebony", Crops.EBONY, Crops.EBONY_ITEM, new String[]{BYGTex.LOG_EBONY}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{EBONY_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "embur_pedu", Crops.EMBUR_PEDU, Crops.EMBUR_PEDU_ITEM, new String[]{BYGTex.EMBUR_PEDU}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{EMBUR_PEDU, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "ether", Crops.ETHER, Crops.ETHER_ITEM, new String[]{BYGTex.LOG_ETHER}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{ETHER_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "fir", Crops.FIR, Crops.FIR_ITEM, new String[]{BYGTex.LOG_FIR}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{FIR_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "glacial_oak", Crops.GLACIAL_OAK, Crops.GLACIAL_OAK_ITEM, new String[]{BYGTex.LOG_GLACIAL_OAK}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{GLACIAL_OAK_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "green_enchanted_log", Crops.GREEN_ENCHANTED_LOG, Crops.GREEN_ENCHANTED_LOG_ITEM, new String[]{BYGTex.LOG_GREEN_ENCHANTED}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{GREEN_ENCHANTED_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "holly", Crops.HOLLY, Crops.HOLLY_ITEM, new String[]{BYGTex.LOG_HOLLY}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{HOLLY_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "jacaranda", Crops.JACARANDA, Crops.JACARANDA_ITEM, new String[]{BYGTex.LOG_JACARANDA}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{JACARANDA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "joshua", Crops.JOSHUA, Crops.JOSHUA_ITEM, new String[]{BYGTex.LOG_JOSHUA}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{JOSHUA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "lament", Crops.LAMENT, Crops.LAMENT_ITEM, new String[]{BYGTex.LOG_LAMENT}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LAMENT_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "mahogany", Crops.MAHOGANY, Crops.MAHOGANY_ITEM, new String[]{BYGTex.LOG_MAHOGANY}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{MAHOGANY_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "mangrove", Crops.MANGROVE, Crops.MANGROVE_ITEM, new String[]{BYGTex.LOG_MANGROVE}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{MANGROVE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "maple", Crops.MAPLE, Crops.MAPLE_ITEM, new String[]{BYGTex.LOG_MAPLE}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{MAPLE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "nightshade", Crops.NIGHTSHADE, Crops.NIGHTSHADE_ITEM, new String[]{BYGTex.LOG_NIGHTSHADE}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{NIGHTSHADE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "palm", Crops.PALM, Crops.PALM_ITEM, new String[]{BYGTex.LOG_PALM}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{PALM_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "palo_verde", Crops.PALO_VERDE, Crops.PALO_VERDE_ITEM, new String[]{BYGTex.LOG_PALO_VERDE}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{PALO_VERDE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "pine", Crops.PINE, Crops.PINE_ITEM, new String[]{BYGTex.LOG_PINE}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{PINE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "rainbow_eucalyptus", Crops.RAINBOW_EUCALYPTUS, Crops.RAINBOW_EUCALYPTUS_ITEM, new String[]{BYGTex.LOG_RAINBOW_EUCALYPTUS}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{RAINBOW_EUCALYPTUS_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "skyris", Crops.SKYRIS, Crops.SKYRIS_ITEM, new String[]{BYGTex.LOG_SKYRIS}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{SKYRIS_LOG, Strings.Tier1}, true);
			// RegisterCrop.addCrop(Mods.BYG, "sythian", Crops.SYTHIAN, Crops.SYTHIAN_ITEM, new String[]{BYGTex.SYTHIAN_STEM}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{SYTHIAN_STEM, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "willow", Crops.WILLOW, Crops.WILLOW_ITEM, new String[]{BYGTex.LOG_WILLOW}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{WILLOW_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "witch_hazel", Crops.WITCH_HAZEL, Crops.WITCH_HAZEL_ITEM, new String[]{BYGTex.LOG_WITCH_HAZEL}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{WITCH_HAZEL_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "withering_oak", Crops.WITHERING_OAK, Crops.WITHERING_OAK_ITEM, new String[]{BYGTex.LOG_WITHERING_OAK}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{WITHERING_OAK_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "zelkova", Crops.ZELKOVA, Crops.ZELKOVA_ITEM, new String[]{BYGTex.LOG_ZELKOVA}, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{ZELKOVA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "ametrine", Crops.AMETRINE, Crops.AMETRINE_ITEM, new String[]{BYGTex.AMETRINE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AMETRINE_GEMS, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "anthracite", Crops.ANTHRACITE, Crops.ANTHRACITE_ITEM, new String[]{BYGTex.ANTHRACITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ANTHRACITE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "black_ice", Crops.BLACK_ICE, Crops.BLACK_ICE_ITEM, new String[]{BYGTex.BLACK_ICE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLACK_ICE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "black_sand", Crops.BLACK_SAND, Crops.BLACK_SAND_ITEM, new String[]{BYGTex.BLACK_SAND}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLACK_SAND, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "blue_glowcane", Crops.BLUE_GLOWCANE, Crops.BLUE_GLOWCANE_ITEM, new String[]{BYGTex.BLUE_GLOWCANE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLUE_GLOWCANE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "blue_netherrack", Crops.BLUE_NETHERRACK, Crops.BLUE_NETHERRACK_ITEM, new String[]{BYGTex.BLUE_NETHERRACK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLUE_NETHERRACK, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "blue_sand", Crops.BLUE_SAND, Crops.BLUE_SAND_ITEM, new String[]{BYGTex.BLUE_SAND}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLUE_SAND, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "brimstone", Crops.BRIMSTONE, Crops.BRIMSTONE_ITEM, new String[]{BYGTex.BRIMSTONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BRIMSTONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "cryptic_stone", Crops.CRYPTIC_STONE, Crops.CRYPTIC_STONE_ITEM, new String[]{BYGTex.CRYPTIC_STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CRYPTIC_STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "dacite", Crops.DACITE, Crops.DACITE_ITEM, new String[]{BYGTex.DACITE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DACITE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "ether_soil", Crops.ETHER_SOIL, Crops.ETHER_SOIL_ITEM, new String[]{BYGTex.ETHER_SOIL}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ETHER_SOIL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "ether_stone", Crops.ETHER_STONE, Crops.ETHER_STONE_ITEM, new String[]{BYGTex.ETHER_STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ETHER_STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "frost_magma", Crops.FROST_MAGMA, Crops.FROST_MAGMA_ITEM, new String[]{BYGTex.FROST_MAGMA}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{FROST_MAGMA, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "lignite", Crops.LIGNITE, Crops.LIGNITE_ITEM, new String[]{BYGTex.LIGNITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LIGNITE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "magmatic_stone", Crops.MAGMATIC_STONE, Crops.MAGMATIC_STONE_ITEM, new String[]{BYGTex.MAGMATIC_STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MAGMATIC_STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "meadow_dirt", Crops.MEADOW_DIRT, Crops.MEADOW_DIRT_ITEM, new String[]{BYGTex.MEADOW_DIRT}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MEADOW_DIRT, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "mossy_netherrack", Crops.MOSSY_NETHERRACK, Crops.MOSSY_NETHERRACK_ITEM, new String[]{BYGTex.MOSSY_NETHERRACK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MOSSY_NETHERRACK, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "mossy_stone", Crops.MOSSY_STONE, Crops.MOSSY_STONE_ITEM, new String[]{BYGTex.MOSSY_STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MOSSY_STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "mud", Crops.MUD, Crops.MUD_ITEM, new String[]{BYGTex.MUD}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MUD_BLOCK, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "nylium_soul_sand", Crops.NYLIUM_SOUL_SAND, Crops.NYLIUM_SOUL_SAND_ITEM, new String[]{BYGTex.NYLIUM_SOUL_SAND}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NYLIUM_SOUL_SAND, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "peat", Crops.PEAT, Crops.PEAT_ITEM, new String[]{BYGTex.PEAT}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PEAT, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "pendorite", Crops.PENDORITE, Crops.PENDORITE_ITEM, new String[]{BYGTex.PENDORITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PENDORITE_SCRAPS, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "pink_sand", Crops.PINK_SAND, Crops.PINK_SAND_ITEM, new String[]{BYGTex.PINK_SAND}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PINK_SAND, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "pollen", Crops.POLLEN, Crops.POLLEN_ITEM, new String[]{BYGTex.POLLEN_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{POLLEN_DUST, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "purple_glowcane", Crops.PURPLE_GLOWCANE, Crops.PURPLE_GLOWCANE_ITEM, new String[]{BYGTex.PURPLE_GLOWCANE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PURPLE_GLOWCANE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "purple_sand", Crops.PURPLE_SAND, Crops.PURPLE_SAND_ITEM, new String[]{BYGTex.PURPLE_SAND}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PURPLE_SAND, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "purpur_stone", Crops.PURPUR_STONE, Crops.PURPUR_STONE_ITEM, new String[]{BYGTex.PURPUR_STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PURPUR_STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "quartzite_sand", Crops.QUARTZITE_SAND, Crops.QUARTZITE_SAND_ITEM, new String[]{BYGTex.QUARTZITE_SAND}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{QUARTZITE_SAND, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "red_glowcane", Crops.RED_GLOWCANE, Crops.RED_GLOWCANE_ITEM, new String[]{BYGTex.RED_GLOWCANE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{RED_GLOWCANE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "red_rock", Crops.RED_ROCK, Crops.RED_ROCK_ITEM, new String[]{BYGTex.RED_ROCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{RED_ROCK, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "rocky_stone", Crops.ROCKY_STONE, Crops.ROCKY_STONE_ITEM, new String[]{BYGTex.ROCKY_STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ROCKY_STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "scoria_stone", Crops.SCORIA_STONE, Crops.SCORIA_STONE_ITEM, new String[]{BYGTex.SCORIA_STONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SCORIA_STONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "soapstone", Crops.SOAPSTONE, Crops.SOAPSTONE_ITEM, new String[]{BYGTex.SOAPSTONE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SOAPSTONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "subzero_ash", Crops.SUBZERO_ASH, Crops.SUBZERO_ASH_ITEM, new String[]{BYGTex.SUBZERO_ASH}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SUBZERO_ASH, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "therium", Crops.THERIUM, Crops.THERIUM_ITEM, new String[]{BYGTex.THERIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{THERIUM_SHARD, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "warped_coral", Crops.WARPED_CORAL, Crops.WARPED_CORAL_ITEM, new String[]{BYGTex.WARPED_CORAL}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{WARPED_CORAL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BYG, "white_sand", Crops.WHITE_SAND, Crops.WHITE_SAND_ITEM, new String[]{BYGTex.WHITE_SAND}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{WHITE_SAND, Strings.Tier1}, true);
		}
	}
}
