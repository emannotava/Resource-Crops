package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class BetterEnd {
	public static void init(){
		if(Mods.checkMod(Mods.BetterEnd)==true || Mods.checkDevEnv()==true){
			RegisterCrop.addCrop(Mods.BetterEnd, "ender_shard", Crops.ender_shard, Crops.ender_shard_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "aeternium", Crops.aeternium, Crops.aeternium_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "crystal_shard", Crops.crystal_shard, Crops.crystal_shard_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "amber_gem", Crops.amber_gem, Crops.amber_gem_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "hydralux_petal", Crops.hydralux_petal, Crops.hydralux_petal_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "eternal_crystal", Crops.eternal_crystal, Crops.eternal_crystal_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "enchanted_petal", Crops.enchanted_petal, Crops.enchanted_petal_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "end_stone_dust", Crops.end_stone_dust, Crops.end_stone_dust_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "flavolite", Crops.flavolite, Crops.flavolite_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "violecite", Crops.violecite, Crops.violecite_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "sulfuric_rock", Crops.sulfuric_rock, Crops.sulfuric_rock_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "missing_tile", Crops.missing_tile, Crops.missing_tile_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "mossy_glowshroom", Crops.mossy_glowshroom, Crops.mossy_glowshroom_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "pythadendron", Crops.pythadendron, Crops.pythadendron_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "end_lotus", Crops.end_lotus, Crops.end_lotus_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "lacugrove", Crops.lacugrove, Crops.lacugrove_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "dragon_tree", Crops.dragon_tree, Crops.dragon_tree_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "tenanea", Crops.tenanea, Crops.tenanea_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "helix_tree", Crops.helix_tree, Crops.helix_tree_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "umbrella_tree", Crops.umbrella_tree, Crops.umbrella_tree_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "jellyshroom", Crops.jellyshroom, Crops.jellyshroom_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "thallasium", Crops.thallasium, Crops.thallasium_item, true);
			RegisterCrop.addCrop(Mods.BetterEnd, "terminite", Crops.terminite, Crops.terminite_item, true);
		}
	}
}
