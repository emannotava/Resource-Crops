package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class BetterEnd {
	public static void init(){
		if(Mods.checkMod(Mods.BetterEnd)==true || Mods.checkDevEnv()==true){
			RegisterCrop.addCrop(Mods.BetterEnd, "ender_shard", Crops.ender_shard);
			RegisterCrop.addCrop(Mods.BetterEnd, "aeternium", Crops.aeternium);
			RegisterCrop.addCrop(Mods.BetterEnd, "crystal_shard", Crops.crystal_shard);
			RegisterCrop.addCrop(Mods.BetterEnd, "amber_gem", Crops.amber_gem);
			RegisterCrop.addCrop(Mods.BetterEnd, "hydralux_petal", Crops.hydralux_petal);
			RegisterCrop.addCrop(Mods.BetterEnd, "eternal_crystal", Crops.eternal_crystal);
			RegisterCrop.addCrop(Mods.BetterEnd, "enchanted_petal", Crops.enchanted_petal);
			RegisterCrop.addCrop(Mods.BetterEnd, "end_stone_dust", Crops.end_stone_dust);
			RegisterCrop.addCrop(Mods.BetterEnd, "flavolite", Crops.flavolite);
			RegisterCrop.addCrop(Mods.BetterEnd, "violecite", Crops.violecite);
			RegisterCrop.addCrop(Mods.BetterEnd, "sulfuric_rock", Crops.sulfuric_rock);
			RegisterCrop.addCrop(Mods.BetterEnd, "missing_tile", Crops.missing_tile);
			RegisterCrop.addCrop(Mods.BetterEnd, "mossy_glowshroom", Crops.mossy_glowshroom);
			RegisterCrop.addCrop(Mods.BetterEnd, "pythadendron", Crops.pythadendron);
			RegisterCrop.addCrop(Mods.BetterEnd, "end_lotus", Crops.end_lotus);
			RegisterCrop.addCrop(Mods.BetterEnd, "lacugrove", Crops.lacugrove);
			RegisterCrop.addCrop(Mods.BetterEnd, "dragon_tree", Crops.dragon_tree);
			RegisterCrop.addCrop(Mods.BetterEnd, "tenanea", Crops.tenanea);
			RegisterCrop.addCrop(Mods.BetterEnd, "helix_tree", Crops.helix_tree);
			RegisterCrop.addCrop(Mods.BetterEnd, "umbrella_tree", Crops.umbrella_tree);
			RegisterCrop.addCrop(Mods.BetterEnd, "jellyshroom", Crops.jellyshroom);
			RegisterCrop.addCrop(Mods.BetterEnd, "thallasium", Crops.thallasium);
			RegisterCrop.addCrop(Mods.BetterEnd, "terminite", Crops.terminite);
		}
	}
}
