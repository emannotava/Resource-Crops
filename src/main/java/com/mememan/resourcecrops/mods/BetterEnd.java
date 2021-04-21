package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.BetterEndTex;

import static com.mememan.resourcecrops.lib.ingredient.BetterEndIngredient.*;

public class BetterEnd {
	public static void init(){
		if(Mods.checkMod(Mods.BetterEnd)==true || Mods.checkDevEnv()==true){
			RegisterCrop.addCrop(Mods.BetterEnd, "ender_shard", Crops.ENDER_SHARD, Crops.ENDER_SHARD_ITEM, new String[]{BetterEndTex.ENDER_SHARD_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ENDER_SHARD, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "aeternium", Crops.AETERNIUM, Crops.AETERNIUM_ITEM, new String[]{BetterEndTex.AETERNIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AETERNIUM_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "crystal_shard", Crops.CRYSTAL_SHARD, Crops.CRYSTAL_SHARD_ITEM, new String[]{BetterEndTex.CRYSTAL_SHARD_BLOCK}, CropModelTypes.RADIAL_CENTER, new Boolean[]{true,false}, new String[]{CRYSTAL_SHARDS, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "amber_gem", Crops.AMBER_GEM, Crops.AMBER_GEM_ITEM, new String[]{BetterEndTex.AMBER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AMBER_GEM, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "hydralux_petal", Crops.HYDRALUX_PETAL, Crops.HYDRALUX_PETAL_ITEM, new String[]{BetterEndTex.HYDRALUX_PETAL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HYDRALUX_PETAL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "eternal_crystal", Crops.ETERNAL_CRYSTAL, Crops.ETERNAL_CRYSTAL_ITEM, new String[]{BetterEndTex.ETERNAL_CRYSTAL_BLOCK}, CropModelTypes.RADIAL_CENTER, new Boolean[]{true,false}, new String[]{ETERNAL_CRYSTAL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "enchanted_petal", Crops.ENCHANTED_PETAL, Crops.ENCHANTED_PETAL_ITEM, new String[]{BetterEndTex.ENCHANTED_PETAL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ENCHANTED_PETAL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "end_stone_dust", Crops.END_STONE_DUST, Crops.END_STONE_DUST_ITEM, new String[]{BetterEndTex.END_STONE_DUST}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{END_STONE_DUST, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "flavolite", Crops.FLAVOLITE, Crops.FLAVOLITE_ITEM, new String[]{BetterEndTex.FLAVOLITE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{FLAVOLITE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "violecite", Crops.VIOLECITE, Crops.VIOLECITE_ITEM, new String[]{BetterEndTex.VIOLECITE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{VIOLECITE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "sulfuric_rock", Crops.SULFURIC_ROCK, Crops.SULFURIC_ROCK_ITEM, new String[]{BetterEndTex.SULFURIC_ROCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SULFURIC_ROCK, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "missing_tile", Crops.MISSING_TILE, Crops.MISSING_TILE_ITEM, new String[]{BetterEndTex.MISSING_TILE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MISSING_TILE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "mossy_glowshroom", Crops.MOSSY_GLOWSHROOM, Crops.MOSSY_GLOWSHROOM_ITEM, new String[]{BetterEndTex.LOG_MOSSY_GLOWSHROOM}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MOSSY_GLOWSHROOM_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "pythadendron", Crops.PYTHADENDRON, Crops.PYTHADENDRON_ITEM, new String[]{BetterEndTex.LOG_PYTHADENDRON}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PYTHADENDRON_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "end_lotus", Crops.END_LOTUS, Crops.END_LOTUS_ITEM, new String[]{BetterEndTex.LOG_END_LOTUS}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{END_LOTUS_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "lacugrove", Crops.LACUGROVE, Crops.LACUGROVE_ITEM, new String[]{BetterEndTex.LOG_LACUGROVE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LACUGROVE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "dragon_tree", Crops.DRAGON_TREE, Crops.DRAGON_TREE_ITEM, new String[]{BetterEndTex.LOG_DRAGON_TREE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DRAGON_TREE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "tenanea", Crops.TENANEA, Crops.TENANEA_ITEM, new String[]{BetterEndTex.LOG_TENANEA}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TENANEA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "helix_tree", Crops.HELIX_TREE, Crops.HELIX_TREE_ITEM, new String[]{BetterEndTex.LOG_HELIX_TREE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HELIX_TREE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "umbrella_tree", Crops.UMBRELLA_TREE, Crops.UMBRELLA_TREE_ITEM, new String[]{BetterEndTex.LOG_UMBRELLA_TREE}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{UMBRELLA_TREE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "jellyshroom", Crops.JELLYSHROOM, Crops.JELLYSHROOM_ITEM, new String[]{BetterEndTex.LOG_JELLYSHROOM}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{JELLYSHROOM_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "thallasium", Crops.THALLASIUM, Crops.THALLASIUM_ITEM, new String[]{BetterEndTex.THALLASIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{THALLASIUM_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "terminite", Crops.TERMINITE, Crops.TERMINITE_ITEM, new String[]{BetterEndTex.TERMINITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TERMINITE_INGOT, Strings.Tier4}, true);
		}
	}
}
