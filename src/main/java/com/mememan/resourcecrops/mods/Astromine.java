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
		RegisterCrop.addCrop(Mods.Astromine, "asterite", Crops.asterite);
		RegisterCrop.addCrop(Mods.Astromine, "fools_gold", Crops.fools_gold);
		RegisterCrop.addCrop(Mods.Astromine, "galaxium", Crops.galaxium);
		RegisterCrop.addCrop(Mods.Astromine, "lunum", Crops.lunum);
		RegisterCrop.addCrop(Mods.Astromine, "meteoric_steel", Crops.meteoric_steel);
		RegisterCrop.addCrop(Mods.Astromine, "metite", Crops.metite);
		RegisterCrop.addCrop(Mods.Astromine, "rose_gold", Crops.rose_gold);
		RegisterCrop.addCrop(Mods.Astromine, "stellum", Crops.stellum);
		RegisterCrop.addCrop(Mods.Astromine, "sterling_silver", Crops.sterling_silver);
		RegisterCrop.addCrop(Mods.Astromine, "univite", Crops.univite);
	}
}
