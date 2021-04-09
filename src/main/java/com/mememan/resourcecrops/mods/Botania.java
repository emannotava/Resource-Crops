package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class Botania {
	public static void init(){
		if(Mods.checkMod(Mods.Botania)==true){
			RegisterCrop.addCrop(Mods.Botania, "livingrock", Crops.certus);
			RegisterCrop.addCrop(Mods.Botania, "livingwood", Crops.livingwood);
			RegisterCrop.addCrop(Mods.Botania, "manasteel", Crops.manasteel);
			RegisterCrop.addCrop(Mods.Botania, "mana_diamond", Crops.mana_diamond);
			RegisterCrop.addCrop(Mods.Botania, "mana_pearl", Crops.mana_pearl);
			RegisterCrop.addCrop(Mods.Botania, "terrasteel", Crops.terrasteel);
			RegisterCrop.addCrop(Mods.Botania, "elementium", Crops.elementium);
			RegisterCrop.addCrop(Mods.Botania, "dragonstone", Crops.dragonstone);
			RegisterCrop.addCrop(Mods.Botania, "pixie_dust", Crops.pixie_dust);
			RegisterCrop.addCrop(Mods.Botania, "gaia_spirit_ingot", Crops.gaia_spirit_ingot);
			RegisterCrop.addCrop(Mods.Botania, "dreamwood", Crops.dreamwood);
			RegisterCrop.addCrop(Mods.Botania, "smokey_quartz", Crops.smokey_quartz);
			RegisterCrop.addCrop(Mods.Botania, "mana_quartz", Crops.mana_quartz);
			RegisterCrop.addCrop(Mods.Botania, "lavender_quartz", Crops.lavender_quartz);
			RegisterCrop.addCrop(Mods.Botania, "red_quartz", Crops.red_quartz);
			RegisterCrop.addCrop(Mods.Botania, "elven_quartz", Crops.elven_quartz);
			RegisterCrop.addCrop(Mods.Botania, "sunny_quartz", Crops.sunny_quartz);
			RegisterCrop.addCrop(Mods.Botania, "rune_mana", Crops.rune_mana);
			RegisterCrop.addCrop(Mods.Botania, "rune_water", Crops.rune_water);
			RegisterCrop.addCrop(Mods.Botania, "rune_air", Crops.rune_air);
			RegisterCrop.addCrop(Mods.Botania, "rune_fire", Crops.rune_fire);
			RegisterCrop.addCrop(Mods.Botania, "rune_earth", Crops.rune_earth);
			RegisterCrop.addCrop(Mods.Botania, "rune_spring", Crops.rune_spring);
			RegisterCrop.addCrop(Mods.Botania, "rune_autumn", Crops.rune_autumn);
			RegisterCrop.addCrop(Mods.Botania, "rune_winter", Crops.rune_winter);
			RegisterCrop.addCrop(Mods.Botania, "rune_summer", Crops.rune_summer);
			RegisterCrop.addCrop(Mods.Botania, "rune_envy", Crops.rune_envy);
			RegisterCrop.addCrop(Mods.Botania, "rune_lust", Crops.rune_lust);
			RegisterCrop.addCrop(Mods.Botania, "rune_sloth", Crops.rune_sloth);
			RegisterCrop.addCrop(Mods.Botania, "rune_gluttony", Crops.rune_gluttony);
			RegisterCrop.addCrop(Mods.Botania, "rune_pride", Crops.rune_pride);
			RegisterCrop.addCrop(Mods.Botania, "rune_wrath", Crops.rune_wrath);
			RegisterCrop.addCrop(Mods.Botania, "rune_greed", Crops.rune_greed);
		}
	}
}
