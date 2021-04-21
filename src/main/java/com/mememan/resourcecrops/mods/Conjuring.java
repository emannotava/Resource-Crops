package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.ConjuringTex;

import static com.mememan.resourcecrops.lib.ingredient.ConjuringIngredient.*;

public class Conjuring {
	public static void init(){
		if(Mods.checkMod(Mods.Conjuring)==true){
			RegisterCrop.addCrop(Mods.Conjuring, "soul_alloy", Crops.SOUL_ALLOY, Crops.SOUL_ALLOY_ITEM, new String[]{ConjuringTex.SOUL_ALLOY_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SOUL_ALLOY, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.Conjuring, "soul_brick", Crops.SOUL_BRICK, Crops.SOUL_BRICK_ITEM, new String[]{ConjuringTex.SOUL_BRICK_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SOUL_BRICK, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.Conjuring, "soul_rod", Crops.SOUL_ROD, Crops.SOUL_ROD_ITEM, new String[]{ConjuringTex.SOUL_ROD_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SOUL_ROD, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.Conjuring, "conjuration_essence", Crops.CONJURATION_ESSENCE, Crops.CONJURATION_ESSENCE_ITEM, new String[]{ConjuringTex.CONJURATION_ESSENCE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CONJURATION_ESSENCE, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.Conjuring, "conjuration_essence_lesser", Crops.CONJURATION_ESSENCE_LESSER, Crops.CONJURATION_ESSENCE_LESSER_ITEM, new String[]{ConjuringTex.CONJURATION_ESSENCE_LESSER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LESSER_CONJURATION_ESSENCE, Strings.Tier3}, true);
		}
	}
}
