package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;

public class Botania {
	public static void init(){
		if(Mods.checkMod(Mods.Botania)==true){
			RegisterCrop.addCrop(Mods.Botania, "livingrock", Strings.Tier1, Strings.defaultCropAge, Crops.certus, "livingrock", false);
			RegisterCrop.addCrop(Mods.Botania, "livingwood", Strings.Tier1, Strings.defaultCropAge, Crops.livingwood, "livingwood", false);
			RegisterCrop.addCrop(Mods.Botania, "manasteel", Strings.Tier3, Strings.defaultCropAge, Crops.manasteel, "manasteel_ingot", false);
			RegisterCrop.addCrop(Mods.Botania, "mana_diamond", Strings.Tier5, Strings.defaultCropAge, Crops.mana_diamond, "mana_diamond", false);
			RegisterCrop.addCrop(Mods.Botania, "mana_pearl", Strings.Tier3, Strings.defaultCropAge, Crops.mana_pearl, "mana_pearl", false);
			RegisterCrop.addCrop(Mods.Botania, "terrasteel", Strings.Tier5, Strings.defaultCropAge, Crops.terrasteel, "terrasteel_ingot", false);
			RegisterCrop.addCrop(Mods.Botania, "elementium", Strings.Tier4, Strings.defaultCropAge, Crops.elementium, "elementium_ingot", false);
			RegisterCrop.addCrop(Mods.Botania, "dragonstone", Strings.Tier4, Strings.defaultCropAge, Crops.dragonstone, "dragonstone", false);
			RegisterCrop.addCrop(Mods.Botania, "pixie_dust", Strings.Tier4, Strings.defaultCropAge, Crops.pixie_dust, "pixie_dust", false);
			RegisterCrop.addCrop(Mods.Botania, "gaia_spirit_ingot", Strings.Tier6, Strings.defaultCropAge, Crops.gaia_spirit_ingot, "gaia_spirit_ingot", false);
			RegisterCrop.addCrop(Mods.Botania, "dreamwood", Strings.Tier1, Strings.defaultCropAge, Crops.dreamwood, "dreamwood", false);
			RegisterCrop.addCrop(Mods.Botania, "smokey_quartz", Strings.Tier3, Strings.defaultCropAge, Crops.smokey_quartz, "smokey_quartz", false);
			RegisterCrop.addCrop(Mods.Botania, "mana_quartz", Strings.Tier3, Strings.defaultCropAge, Crops.mana_quartz, "mana_quartz", false);
			RegisterCrop.addCrop(Mods.Botania, "lavender_quartz", Strings.Tier3, Strings.defaultCropAge, Crops.lavender_quartz, "lavender_quartz", false);
			RegisterCrop.addCrop(Mods.Botania, "red_quartz", Strings.Tier3, Strings.defaultCropAge, Crops.red_quartz, "red_quartz", false);
			RegisterCrop.addCrop(Mods.Botania, "elven_quartz", Strings.Tier3, Strings.defaultCropAge, Crops.elven_quartz, "elven_quartz", false);
			RegisterCrop.addCrop(Mods.Botania, "sunny_quartz", Strings.Tier3, Strings.defaultCropAge, Crops.sunny_quartz, "sunny_quartz", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_mana", Strings.Tier6, 80, Crops.rune_mana, "rune_mana", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_water", Strings.Tier6, 80, Crops.rune_water, "rune_water", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_air", Strings.Tier6, 80, Crops.rune_air, "rune_air", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_fire", Strings.Tier6, 80, Crops.rune_fire, "rune_fire", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_earth", Strings.Tier6, 80, Crops.rune_earth, "rune_earth", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_spring", Strings.Tier6, 80, Crops.rune_spring, "rune_spring", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_autumn", Strings.Tier6, 80, Crops.rune_autumn, "rune_autumn", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_winter", Strings.Tier6, 80, Crops.rune_winter, "rune_winter", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_summer", Strings.Tier6, 80, Crops.rune_summer, "rune_summer", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_envy", Strings.Tier6, 80, Crops.rune_envy, "rune_envy", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_lust", Strings.Tier6, 80, Crops.rune_lust, "rune_lust", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_sloth", Strings.Tier6, 80, Crops.rune_sloth, "rune_sloth", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_gluttony", Strings.Tier6, 80, Crops.rune_gluttony, "rune_gluttony", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_pride", Strings.Tier6, 80, Crops.rune_pride, "rune_pride", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_wrath", Strings.Tier6, 80, Crops.rune_wrath, "rune_wrath", false);
			RegisterCrop.addCrop(Mods.Botania, "rune_greed", Strings.Tier6, 80, Crops.rune_greed, "rune_greed", false);
		}
	}
}
