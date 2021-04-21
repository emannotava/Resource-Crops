package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.IndustrialRevolutionTex;

import static com.mememan.resourcecrops.lib.ingredient.IndustrialRevolutionIngredient.*;

public class IndustrialRevolution {
	public static void init(){
		if(Mods.checkMod(Mods.IndustrialRevolution)==true){
			RegisterCrop.addCrop(Mods.IndustrialRevolutionShort, "nikolite", Crops.NIKOLITE, Crops.NIKOLITE_ITEM, new String[]{IndustrialRevolutionTex.NIKOLITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{NIKOLITE_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.IndustrialRevolutionShort, "enriched_nikolite", Crops.ENRICHED_NIKOLITE, Crops.ENRICHED_NIKOLITE_ITEM, new String[]{IndustrialRevolutionTex.ENRICHED_NIKOLITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ENRICHED_NIKOLITE_INGOT, Strings.Tier5}, true);
		}
	}
}
