package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.TechRebornTex;

import static com.mememan.resourcecrops.lib.ingredient.TechRebornIngredient.*;

public class TechReborn {
	public static void init(){
		if(Mods.checkMod(Mods.TechReborn)==true){
			RegisterCrop.addCrop(Mods.TechReborn, "advanced_alloy", Crops.ADVANCED_ALLOY, Crops.ADVANCED_ALLOY_ITEM, new String[]{TechRebornTex.ADVANCED_ALLOY_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ADVANCED_ALLOY_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "bronze", Crops.BRONZE, Crops.BRONZE_ITEM, new String[]{TechRebornTex.BRONZE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BRONZE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "chrome", Crops.CHROME, Crops.CHROME_ITEM, new String[]{TechRebornTex.CHROME_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CHROME_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "hot_tungstensteel", Crops.HOT_TUNGSTENSTEEL, Crops.HOT_TUNGSTENSTEEL_ITEM, new String[]{TechRebornTex.HOT_TUNGSTENSTEEL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HOT_TUNGSTENSTEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "invar", Crops.INVAR, Crops.INVAR_ITEM, new String[]{TechRebornTex.INVAR_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{INVAR_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "nickel", Crops.NICKEL, Crops.NICKEL_ITEM, new String[]{TechRebornTex.NICKEL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NICKEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "refined_iron", Crops.REFINED_IRON, Crops.REFINED_IRON_ITEM, new String[]{TechRebornTex.REFINED_IRON_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{REFINED_IRON_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "tungstensteel", Crops.TUNGSTENSTEEL, Crops.TUNGSTENSTEEL_ITEM, new String[]{TechRebornTex.TUNGSTENSTEEL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TUNGSTENSTEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "red_garnet", Crops.RED_GARNET, Crops.RED_GARNET_ITEM, new String[]{TechRebornTex.RED_GARNET_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{RED_GARNET_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.TechReborn, "yellow_garnet", Crops.YELLOW_GARNET, Crops.YELLOW_GARNET_ITEM, new String[]{TechRebornTex.YELLOW_GARNET_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{YELLOW_GARNET_GEM, Strings.Tier3}, true);
		}
	}
}
