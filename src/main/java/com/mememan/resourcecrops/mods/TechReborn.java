package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class TechReborn {
	public static void init(){
		if(Mods.checkMod(Mods.TechReborn)==true){
			RegisterCrop.addCrop(Mods.TechReborn, "advanced_alloy", Crops.advanced_alloy, Crops.advanced_alloy_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "aluminum", Crops.aluminum, Crops.aluminum_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "brass", Crops.brass, Crops.brass_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "bronze", Crops.bronze, Crops.bronze_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "chrome", Crops.chrome, Crops.chrome_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "copper", Crops.copper, Crops.copper_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "electrum", Crops.electrum, Crops.electrum_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "hot_tungstensteel", Crops.hot_tungstensteel, Crops.hot_tungstensteel_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "invar", Crops.invar, Crops.invar_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "iridium", Crops.iridium, Crops.iridium_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "iridium_alloy", Crops.iridium_alloy, Crops.iridium_alloy_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "lead", Crops.lead, Crops.lead_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "nickel", Crops.nickel, Crops.nickel_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "peridot", Crops.peridot, Crops.peridot_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "platinum", Crops.platinum, Crops.platinum_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "red_garnet", Crops.red_garnet, Crops.red_garnet_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "refined_iron", Crops.refined_iron, Crops.refined_iron_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "ruby", Crops.ruby, Crops.ruby_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "sapphire", Crops.sapphire, Crops.sapphire_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "silver", Crops.silver, Crops.silver_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "steel", Crops.steel, Crops.steel_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "tin", Crops.tin, Crops.tin_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "titanium", Crops.titanium, Crops.titanium_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "tungsten", Crops.tungsten, Crops.tungsten_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "tungstensteel", Crops.tungstensteel, Crops.tungstensteel_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "yellow_garnet", Crops.yellow_garnet, Crops.yellow_garnet_item, true);
			RegisterCrop.addCrop(Mods.TechReborn, "zinc", Crops.zinc, Crops.zinc_item, true);
		}
	}
}
