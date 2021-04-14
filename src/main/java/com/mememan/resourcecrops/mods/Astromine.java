package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;

public class Astromine {
	public static void init(){
		if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==true){register();}
		if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==false){register();}
		if(Mods.checkMod(Mods.Astromine)==false && Mods.checkMod(Mods.AstromineCore)==true){register();}
	}
	public static void register(){
		RegisterCrop.addCrop(Mods.Astromine, "asterite", Crops.ASTERITE, Crops.ASTERITE_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "fools_gold", Crops.FOOLS_GOLD, Crops.FOOLS_GOLD_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "galaxium", Crops.GALAXIUM, Crops.GALAXIUM_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "lunum", Crops.LUNUM, Crops.LUNUM_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "meteoric_steel", Crops.METEORIC_STEEL, Crops.METEORIC_STEEL_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "metite", Crops.METITE, Crops.METITE_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "rose_gold", Crops.ROSE_GOLD, Crops.ROSE_GOLD_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "stellum", Crops.STELLUM, Crops.STELLUM_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "sterling_silver", Crops.STERLING_SILVER, Crops.STERLING_SILVER_ITEM, CropModelTypes.ALL, true);
		RegisterCrop.addCrop(Mods.Astromine, "univite", Crops.UNIVITE, Crops.UNIVITE_ITEM, CropModelTypes.ALL, true);
	}
}
