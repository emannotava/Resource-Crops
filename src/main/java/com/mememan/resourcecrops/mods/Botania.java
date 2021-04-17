package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import static com.mememan.resourcecrops.lib.ingredient.BotaniaIngredient.*;

public class Botania {
	public static void init(){
		if(Mods.checkMod(Mods.Botania)==true){
			RegisterCrop.addCrop(Mods.Botania, "livingrock", Crops.LIVINGROCK, Crops.LIVINGROCK_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LIVINGROCK, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.Botania, "livingwood", Crops.LIVINGWOOD, Crops.LIVINGWOOD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LIVINGWOOD, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.Botania, "manasteel", Crops.MANASTEEL, Crops.MANASTEEL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MANASTEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Botania, "mana_diamond", Crops.MANA_DIAMOND, Crops.MANA_DIAMOND_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MANA_DIAMOND, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.Botania, "mana_pearl", Crops.MANA_PEARL, Crops.MANA_PEARL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MANA_PEARL, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Botania, "terrasteel", Crops.TERRASTEEL, Crops.TERRASTEEL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{TERRASTEEL_INGOT, Strings.Tier5}, true);
			RegisterCrop.addCrop(Mods.Botania, "elementium", Crops.ELEMENTIUM, Crops.ELEMENTIUM_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ELEMENTIUM_INGOT, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.Botania, "dragonstone", Crops.DRAGONSTONE, Crops.DRAGONSTONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DRAGONSTONE, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.Botania, "pixie_dust", Crops.PIXIE_DUST, Crops.PIXIE_DUST_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PIXIE_DUST, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.Botania, "gaia_spirit_ingot", Crops.GAIA_SPIRIT_INGOT, Crops.GAIA_SPIRIT_INGOT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GAIA_SPIRIT_INGOT, Strings.Tier6}, true);
			RegisterCrop.addCrop(Mods.Botania, "dreamwood", Crops.DREAMWOOD, Crops.DREAMWOOD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{DREAMWOOD, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.Botania, "smokey_quartz", Crops.SMOKEY_QUARTZ, Crops.SMOKEY_QUARTZ_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SMOKEY_QUARTZ, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Botania, "mana_quartz", Crops.MANA_QUARTZ, Crops.MANA_QUARTZ_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MANA_QUARTZ, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Botania, "lavender_quartz", Crops.LAVENDER_QUARTZ, Crops.LAVENDER_QUARTZ_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LAVENDER_QUARTZ, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Botania, "red_quartz", Crops.RED_QUARTZ, Crops.RED_QUARTZ_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{RED_QUARTZ, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Botania, "elven_quartz", Crops.ELVEN_QUARTZ, Crops.ELVEN_QUARTZ_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ELVEN_QUARTZ, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.Botania, "sunny_quartz", Crops.SUNNY_QUARTZ, Crops.SUNNY_QUARTZ_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SUNNY_QUARTZ, Strings.Tier3}, true);
		}
	}
}
