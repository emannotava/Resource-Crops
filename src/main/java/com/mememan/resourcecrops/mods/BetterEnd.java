package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import static com.mememan.resourcecrops.lib.ingredient.BetterEndIngredient.*;

public class BetterEnd {
	public static void init(){
		if(Mods.checkMod(Mods.BetterEnd)==true || Mods.checkDevEnv()==true){
			RegisterCrop.addCrop(Mods.BetterEnd, "ender_shard", Crops.ENDER_SHARD, Crops.ENDER_SHARD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ENDER_SHARD, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "aeternium", Crops.AETERNIUM, Crops.AETERNIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AETERNIUM_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "crystal_shard", Crops.CRYSTAL_SHARD, Crops.CRYSTAL_SHARD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CRYSTAL_SHARDS, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "amber_gem", Crops.AMBER_GEM, Crops.AMBER_GEM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AMBER_GEM, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "hydralux_petal", Crops.HYDRALUX_PETAL, Crops.HYDRALUX_PETAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HYDRALUX_PETAL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "eternal_crystal", Crops.ETERNAL_CRYSTAL, Crops.ETERNAL_CRYSTAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ETERNAL_CRYSTAL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "enchanted_petal", Crops.ENCHANTED_PETAL, Crops.ENCHANTED_PETAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ENCHANTED_PETAL, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "end_stone_dust", Crops.END_STONE_DUST, Crops.END_STONE_DUST_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{END_STONE_DUST, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "flavolite", Crops.FLAVOLITE, Crops.FLAVOLITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{FLAVOLITE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "violecite", Crops.VIOLECITE, Crops.VIOLECITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{VIOLECITE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "sulfuric_rock", Crops.SULFURIC_ROCK, Crops.SULFURIC_ROCK_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SULFURIC_ROCK, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "missing_tile", Crops.MISSING_TILE, Crops.MISSING_TILE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MISSING_TILE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "mossy_glowshroom", Crops.MOSSY_GLOWSHROOM, Crops.MOSSY_GLOWSHROOM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MOSSY_GLOWSHROOM_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "pythadendron", Crops.PYTHADENDRON, Crops.PYTHADENDRON_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PYTHADENDRON_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "end_lotus", Crops.END_LOTUS, Crops.END_LOTUS_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{END_LOTUS_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "lacugrove", Crops.LACUGROVE, Crops.LACUGROVE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LACUGROVE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "dragon_tree", Crops.DRAGON_TREE, Crops.DRAGON_TREE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DRAGON_TREE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "tenanea", Crops.TENANEA, Crops.TENANEA_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TENANEA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "helix_tree", Crops.HELIX_TREE, Crops.HELIX_TREE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HELIX_TREE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "umbrella_tree", Crops.UMBRELLA_TREE, Crops.UMBRELLA_TREE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{UMBRELLA_TREE_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "jellyshroom", Crops.JELLYSHROOM, Crops.JELLYSHROOM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{JELLYSHROOM_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "thallasium", Crops.THALLASIUM, Crops.THALLASIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{THALLASIUM_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "terminite", Crops.TERMINITE, Crops.TERMINITE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TERMINITE_INGOT, Strings.Tier4}, true);
		}
	}
}
