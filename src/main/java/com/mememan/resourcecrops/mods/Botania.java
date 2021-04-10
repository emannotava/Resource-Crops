package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;

public class Botania {
	public static void init(){
		if(Mods.checkMod(Mods.Botania)==true){
			RegisterCrop.addCrop(Mods.Botania, "livingrock", Crops.livingrock, Crops.livingrock_item, true);
			RegisterCrop.addCrop(Mods.Botania, "livingwood", Crops.livingwood, Crops.livingwood_item, true);
			RegisterCrop.addCrop(Mods.Botania, "manasteel", Crops.manasteel, Crops.manasteel_item, true);
			RegisterCrop.addCrop(Mods.Botania, "mana_diamond", Crops.mana_diamond, Crops.mana_diamond_item, true);
			RegisterCrop.addCrop(Mods.Botania, "mana_pearl", Crops.mana_pearl, Crops.mana_pearl_item, true);
			RegisterCrop.addCrop(Mods.Botania, "terrasteel", Crops.terrasteel, Crops.terrasteel_item, true);
			RegisterCrop.addCrop(Mods.Botania, "elementium", Crops.elementium, Crops.elementium_item, true);
			RegisterCrop.addCrop(Mods.Botania, "dragonstone", Crops.dragonstone, Crops.dragonstone_item, true);
			RegisterCrop.addCrop(Mods.Botania, "pixie_dust", Crops.pixie_dust, Crops.pixie_dust_item, true);
			RegisterCrop.addCrop(Mods.Botania, "gaia_spirit_ingot", Crops.gaia_spirit_ingot, Crops.gaia_spirit_ingot_item, true);
			RegisterCrop.addCrop(Mods.Botania, "dreamwood", Crops.dreamwood, Crops.dreamwood_item, true);
			RegisterCrop.addCrop(Mods.Botania, "smokey_quartz", Crops.smokey_quartz, Crops.smokey_quartz_item, true);
			RegisterCrop.addCrop(Mods.Botania, "mana_quartz", Crops.mana_quartz, Crops.mana_quartz_item, true);
			RegisterCrop.addCrop(Mods.Botania, "lavender_quartz", Crops.lavender_quartz, Crops.lavender_quartz_item, true);
			RegisterCrop.addCrop(Mods.Botania, "red_quartz", Crops.red_quartz, Crops.red_quartz_item, true);
			RegisterCrop.addCrop(Mods.Botania, "elven_quartz", Crops.elven_quartz, Crops.elven_quartz_item, true);
			RegisterCrop.addCrop(Mods.Botania, "sunny_quartz", Crops.sunny_quartz, Crops.sunny_quartz_item, true);
			RegisterCrop.addCrop(Mods.Botania, "rune_mana", Crops.rune_mana, Crops.rune_mana_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_water", Crops.rune_water, Crops.rune_water_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_air", Crops.rune_air, Crops.rune_air_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_fire", Crops.rune_fire, Crops.rune_fire_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_earth", Crops.rune_earth, Crops.rune_earth_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_spring", Crops.rune_spring, Crops.rune_spring_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_autumn", Crops.rune_autumn, Crops.rune_autumn_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_winter", Crops.rune_winter, Crops.rune_winter_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_summer", Crops.rune_summer, Crops.rune_summer_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_envy", Crops.rune_envy, Crops.rune_envy_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_lust", Crops.rune_lust, Crops.rune_lust_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_sloth", Crops.rune_sloth, Crops.rune_sloth_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_gluttony", Crops.rune_gluttony, Crops.rune_gluttony_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_pride", Crops.rune_pride, Crops.rune_pride_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_wrath", Crops.rune_wrath, Crops.rune_wrath_item, false);
			RegisterCrop.addCrop(Mods.Botania, "rune_greed", Crops.rune_greed, Crops.rune_greed_item, false);
		}
	}
}
