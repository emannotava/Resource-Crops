package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.BewitchmentTex;

import static com.mememan.resourcecrops.lib.ingredient.BewitchmentIngredient.*;

public class Bewitchment {
	public static void init(){
		if(Mods.checkMod(Mods.Bewitchment)==true){
			RegisterCrop.addCrop(Mods.Bewitchment, "alchemist_wool", Crops.ALCHEMIST_WOOL, Crops.ALCHEMIST_WOOL_ITEM, new String[]{BewitchmentTex.ALCHEMIST_WOOL},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ALCHEMIST_WOOL, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "besmirched_wool", Crops.BESMIRCHED_WOOL, Crops.BESMIRCHED_WOOL_ITEM, new String[]{BewitchmentTex.BESMIRCHED_WOOL},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BESMIRCHED_WOOL, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "blessed_stone", Crops.BLESSED_STONE, Crops.BLESSED_STONE_ITEM, new String[]{BewitchmentTex.BLESSED_STONE},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLESSED_STONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "cypress_log", Crops.LOG_CYPRESS, Crops.LOG_CYPRESS_ITEM, new String[]{BewitchmentTex.LOG_CYPRESS},CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LOG_CYPRESS, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "dragons_blood_log", Crops.LOG_DRAGONS_BLOOD, Crops.LOG_DRAGONS_BLOOD_ITEM, new String[]{BewitchmentTex.LOG_DRAGONS_BLOOD},CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LOG_DRAGONS_BLOOD, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "dragons_blood_resin", Crops.DRAGONS_BLOOD_RESIN, Crops.DRAGONS_BLOOD_RESIN_ITEM, new String[]{BewitchmentTex.DRAGONS_BLOOD_RESIN_BLOCK},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DRAGONS_BLOOD_RESIN, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "elder_log", Crops.LOG_ELDER, Crops.LOG_ELDER_ITEM, new String[]{BewitchmentTex.LOG_ELDER},CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LOG_ELDER, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "hedgewitch_wool", Crops.HEDGEWITCH_WOOL, Crops.HEDGEWITCH_WOOL_ITEM, new String[]{BewitchmentTex.HEDGEWITCH_WOOL},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HEDGEWITCH_WOOL, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "juniper_log", Crops.LOG_JUNIPER, Crops.LOG_JUNIPER_ITEM, new String[]{BewitchmentTex.LOG_JUNIPER},CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{LOG_JUNIPER, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Bewitchment, "salt", Crops.SALT, Crops.SALT_ITEM, new String[]{BewitchmentTex.SALT_BLOCK},CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SALT, Strings.Tier3}, true);
		}
	}
}
