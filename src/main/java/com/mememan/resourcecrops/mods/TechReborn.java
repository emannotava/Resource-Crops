package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import static com.mememan.resourcecrops.lib.ingredient.TechRebornIngredient.*;

public class TechReborn {
	public static void init(){
		if(Mods.checkMod(Mods.TechReborn)==true){
			RegisterCrop.addCrop(Mods.TechReborn, "advanced_alloy", Crops.ADVANCED_ALLOY, Crops.ADVANCED_ALLOY_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ADVANCED_ALLOY_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "aluminum", Crops.ALUMINUM, Crops.ALUMINUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ALUMINUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "brass", Crops.BRASS, Crops.BRASS_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BRASS_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "bronze", Crops.BRONZE, Crops.BRONZE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BRONZE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "chrome", Crops.CHROME, Crops.CHROME_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CHROME_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "copper", Crops.COPPER, Crops.COPPER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{COPPER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "electrum", Crops.ELECTRUM, Crops.ELECTRUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ELECTRUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "hot_tungstensteel", Crops.HOT_TUNGSTENSTEEL, Crops.HOT_TUNGSTENSTEEL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HOT_TUNGSTENSTEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "invar", Crops.INVAR, Crops.INVAR_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{INVAR_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "iridium", Crops.IRIDIUM, Crops.IRIDIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{IRIDIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "iridium_alloy", Crops.IRIDIUM_ALLOY, Crops.IRIDIUM_ALLOY_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{IRIDIUM_ALLOY_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "lead", Crops.LEAD, Crops.LEAD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LEAD_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "nickel", Crops.NICKEL, Crops.NICKEL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NICKEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "platinum", Crops.PLATINUM, Crops.PLATINUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PLATINUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "refined_iron", Crops.REFINED_IRON, Crops.REFINED_IRON_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{REFINED_IRON_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "silver", Crops.SILVER, Crops.SILVER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SILVER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "steel", Crops.STEEL, Crops.STEEL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "tin", Crops.TIN, Crops.TIN_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TIN_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "titanium", Crops.TITANIUM, Crops.TITANIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TITANIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "tungsten", Crops.TUNGSTEN, Crops.TUNGSTEN_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TUNGSTEN_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "tungstensteel", Crops.TUNGSTENSTEEL, Crops.TUNGSTENSTEEL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TUNGSTENSTEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "zinc", Crops.ZINC, Crops.ZINC_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ZINC_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "peridot", Crops.PERIDOT, Crops.PERIDOT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PERIDOT_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "red_garnet", Crops.RED_GARNET, Crops.RED_GARNET_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{RED_GARNET_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "ruby", Crops.RUBY, Crops.RUBY_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{RUBY_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "sapphire", Crops.SAPPHIRE, Crops.SAPPHIRE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SAPPHIRE_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "yellow_garnet", Crops.YELLOW_GARNET, Crops.YELLOW_GARNET_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{YELLOW_GARNET_GEM, Strings.Tier3}, true);
		}
	}
}
