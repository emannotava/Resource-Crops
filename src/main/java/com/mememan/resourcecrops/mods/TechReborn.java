package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class TechReborn {
	public static void init(){
		if(Mods.checkMod(Mods.TechReborn)==true){
			RegisterCrop.addCrop(Mods.TechReborn, "advanced_alloy", Crops.advanced_alloy);
			RegisterCrop.addCrop(Mods.TechReborn, "aluminum", Crops.aluminum);
			RegisterCrop.addCrop(Mods.TechReborn, "brass", Crops.brass);
			RegisterCrop.addCrop(Mods.TechReborn, "bronze", Crops.bronze);
			RegisterCrop.addCrop(Mods.TechReborn, "chrome", Crops.chrome);
			RegisterCrop.addCrop(Mods.TechReborn, "copper", Crops.copper);
			RegisterCrop.addCrop(Mods.TechReborn, "electrum", Crops.electrum);
			RegisterCrop.addCrop(Mods.TechReborn, "hot_tungstensteel", Crops.hot_tungstensteel);
			RegisterCrop.addCrop(Mods.TechReborn, "invar", Crops.invar);
			RegisterCrop.addCrop(Mods.TechReborn, "iridium", Crops.iridium);
			RegisterCrop.addCrop(Mods.TechReborn, "iridium_alloy", Crops.iridium_alloy);
			RegisterCrop.addCrop(Mods.TechReborn, "lead", Crops.lead);
			RegisterCrop.addCrop(Mods.TechReborn, "nickel", Crops.nickel);
			RegisterCrop.addCrop(Mods.TechReborn, "peridot", Crops.peridot);
			RegisterCrop.addCrop(Mods.TechReborn, "platinum", Crops.platinum);
			RegisterCrop.addCrop(Mods.TechReborn, "red_garnet", Crops.red_garnet);
			RegisterCrop.addCrop(Mods.TechReborn, "refined_iron", Crops.refined_iron);
			RegisterCrop.addCrop(Mods.TechReborn, "ruby", Crops.ruby);
			RegisterCrop.addCrop(Mods.TechReborn, "sapphire", Crops.sapphire);
			RegisterCrop.addCrop(Mods.TechReborn, "silver", Crops.silver);
			RegisterCrop.addCrop(Mods.TechReborn, "steel", Crops.steel);
			RegisterCrop.addCrop(Mods.TechReborn, "tin", Crops.tin);
			RegisterCrop.addCrop(Mods.TechReborn, "titanium", Crops.titanium);
			RegisterCrop.addCrop(Mods.TechReborn, "tungsten", Crops.tungsten);
			RegisterCrop.addCrop(Mods.TechReborn, "tungstensteel", Crops.tungstensteel);
			RegisterCrop.addCrop(Mods.TechReborn, "yellow_garnet", Crops.yellow_garnet);
			RegisterCrop.addCrop(Mods.TechReborn, "zinc", Crops.zinc);
		}
	}
}
