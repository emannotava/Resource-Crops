package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class Astromine {
	public static void init(){
		if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==true){register();}
		if(Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==false){register();}
		if(Mods.checkMod(Mods.Astromine)==false && Mods.checkMod(Mods.AstromineCore)==true){register();}
	}
	public static void register(){
		RegisterCrop.addCrop(Mods.Astromine, "asterite", Crops.asterite, Crops.asterite_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "fools_gold", Crops.fools_gold, Crops.fools_gold_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "galaxium", Crops.galaxium, Crops.galaxium_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "lunum", Crops.lunum, Crops.lunum_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "meteoric_steel", Crops.meteoric_steel, Crops.meteoric_steel_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "metite", Crops.metite, Crops.metite_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "rose_gold", Crops.rose_gold, Crops.rose_gold_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "stellum", Crops.stellum, Crops.stellum_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "sterling_silver", Crops.sterling_silver, Crops.sterling_silver_item, true);
		RegisterCrop.addCrop(Mods.Astromine, "univite", Crops.univite, Crops.univite_item, true);
	}
}
