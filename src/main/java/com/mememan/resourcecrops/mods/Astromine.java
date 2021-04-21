package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.AstromineTex;

import static com.mememan.resourcecrops.lib.ingredient.AstromineIngredient.*;

public class Astromine {
	public static void init(){
		if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==true){register();}
		if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==false){register();}
		if(Mods.checkMod(Mods.Astromine)==false && Mods.checkMod(Mods.AstromineCore)==true){register();}
	}
	public static void register(){
		RegisterCrop.addCrop(Mods.Astromine, "asterite", Crops.ASTERITE, Crops.ASTERITE_ITEM, new String[]{AstromineTex.ASTERITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ASTERITE, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "fools_gold", Crops.FOOLS_GOLD, Crops.FOOLS_GOLD_ITEM, new String[]{AstromineTex.FOOLS_GOLD_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{FOOLS_GOLD_INGOT, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "galaxium", Crops.GALAXIUM, Crops.GALAXIUM_ITEM, new String[]{AstromineTex.GALAXIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GALAXIUM, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "lunum", Crops.LUNUM, Crops.LUNUM_ITEM, new String[]{AstromineTex.LUNUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LUNUM_INGOT, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "meteoric_steel", Crops.METEORIC_STEEL, Crops.METEORIC_STEEL_ITEM, new String[]{AstromineTex.METEORIC_STEEL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{METEORIC_STEEL_INGOT, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "metite", Crops.METITE, Crops.METITE_ITEM, new String[]{AstromineTex.METITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{METITE_INGOT, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "rose_gold", Crops.ROSE_GOLD, Crops.ROSE_GOLD_ITEM, new String[]{AstromineTex.ROSE_GOLD_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ROSE_GOLD_INGOT, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "stellum", Crops.STELLUM, Crops.STELLUM_ITEM, new String[]{AstromineTex.STELLUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STELLUM_INGOT, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "sterling_silver", Crops.STERLING_SILVER, Crops.STERLING_SILVER_ITEM, new String[]{AstromineTex.STERLING_SILVER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{STERLING_SILVER_INGOT, Strings.Tier3}, true);
		RegisterCrop.addCrop(Mods.Astromine, "univite", Crops.UNIVITE, Crops.UNIVITE_ITEM, new String[]{AstromineTex.UNIVITE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{UNIVITE_INGOT, Strings.Tier6}, true);
	}
}
