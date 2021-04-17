package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import static com.mememan.resourcecrops.lib.ingredient.AetherIngredient.*;

public class Aether {
	public static void init(){
		if(Mods.checkMod(Mods.Aether)==true){
			RegisterCrop.addCrop(Mods.AetherShort, "aether_dirt", Crops.AETHER_DIRT, Crops.AETHER_DIRT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AETHER_DIRT, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "holystone", Crops.HOLYSTONE, Crops.HOLYSTONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HOLYSTONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "holystone_mossy", Crops.HOLYSTONE_MOSSY, Crops.HOLYSTONE_MOSSY_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{MOSSY_HOLYSTONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "icestone", Crops.ICESTONE, Crops.ICESTONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ICESTONE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "quicksoil", Crops.QUICKSOIL, Crops.QUICKSOIL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{QUICKSOIL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "quicksoil_glass", Crops.QUICKSOIL_GLASS, Crops.QUICKSOIL_GLASS_ITEM, CropModelTypes.ALL, new Boolean[]{false,false}, new String[]{"", ""}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "skyroot_log", Crops.SKYROOT_LOG, Crops.SKYROOT_LOG_ITEM, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{SKYROOT_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "golden_oak", Crops.GOLDEN_OAK, Crops.GOLDEN_OAK_ITEM, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{GOLDEN_OAK_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "crystal_log", Crops.CRYSTAL_LOG, Crops.CRYSTAL_LOG_ITEM, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{CRYSTAL_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "wisteria_log", Crops.WISTERIA_LOG, Crops.WISTERIA_LOG_ITEM, CropModelTypes.LOG, new Boolean[]{true,false}, new String[]{WISTERIA_LOG, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "aercloud_blue", Crops.AERCLOUD_BLUE, Crops.AERCLOUD_BLUE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLUE_AERCLOUD, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "aercloud_cold", Crops.AERCLOUD_COLD, Crops.AERCLOUD_COLD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{COLD_AERCLOUD, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "aercloud_gold", Crops.AERCLOUD_GOLD, Crops.AERCLOUD_GOLD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GOLDEN_AERCLOUD, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "aercloud_pink", Crops.AERCLOUD_PINK, Crops.AERCLOUD_PINK_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{PINK_AERCLOUD, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "aerogel", Crops.AEROGEL, Crops.AEROGEL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AEROGEL, Strings.Tier1}, true);

			RegisterCrop.addCrop(Mods.AetherShort, "blue_berry", Crops.BLUE_BERRY, Crops.BLUE_BERRY_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLUE_BERRY, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "enchanted_blue_berry", Crops.ENCHANTED_BLUE_BERRY, Crops.ENCHANTED_BLUE_BERRY_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ENCHANTED_BLUE_BERRY, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "candy_cane", Crops.CANDY_CANE, Crops.CANDY_CANE_ITEM, CropModelTypes.RADIAL_CENTER, new Boolean[]{true,false}, new String[]{CANDY_CANE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "ginger_bread_man", Crops.GINGER_BREAD_MAN, Crops.GINGER_BREAD_MAN_ITEM, CropModelTypes.RADIAL_CENTER, new Boolean[]{true,false}, new String[]{GINGER_BREAD_MAN, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "gummy_swet_blue", Crops.GUMMY_SWET_BLUE, Crops.GUMMY_SWET_BLUE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{BLUE_GUMMY_SWET, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "gummy_swet_gold", Crops.GUMMY_SWET_GOLD, Crops.GUMMY_SWET_GOLD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GOLDEN_GUMMY_SWET, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "swet_ball", Crops.SWET_BALL, Crops.SWET_BALL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SWET_BALL, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "white_apple", Crops.WHITE_APPLE, Crops.WHITE_APPLE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{WHITE_APPLE, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "golden_amber", Crops.GOLDEN_AMBER, Crops.GOLDEN_AMBER_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GOLDEN_AMBER, Strings.Tier1}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "aechor_petal", Crops.AECHOR_PETAL, Crops.AECHOR_PETAL_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AECHOR_PETAL, Strings.Tier1}, true);

			RegisterCrop.addCrop(Mods.AetherShort, "ambrosium_shard", Crops.AMBROSIUM_SHARD, Crops.AMBROSIUM_SHARD_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{AMBROSIUM_SHARD, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "zanite_gemstone", Crops.ZANITE_GEMSTONE, Crops.ZANITE_GEMSTONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ZANITE_GEMSTONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "gravitite_gemstone", Crops.GRAVITITE_GEMSTONE, Crops.GRAVITITE_GEMSTONE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{GRAVITITE_GEMSTONE, Strings.Tier5}, true);

			RegisterCrop.addCrop(Mods.AetherShort, "angelic", Crops.ANGELIC, Crops.ANGELIC_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{ANGELIC_STONE, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "angelic_light", Crops.ANGELIC_LIGHT, Crops.ANGELIC_LIGHT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LIGHT_ANGELIC_STONE, Strings.Tier2}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "carved", Crops.CARVED, Crops.CARVED_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{CARVED_STONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "hellfire", Crops.HELLFIRE, Crops.HELLFIRE_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{HELLFIRE_STONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "hellfire_light", Crops.HELLFIRE_LIGHT, Crops.HELLFIRE_LIGHT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LIGHT_HELLFIRE_STONE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "sentry", Crops.SENTRY, Crops.SENTRY_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{SENTRY_STONE, Strings.Tier4}, true);
			RegisterCrop.addCrop(Mods.AetherShort, "sentry_light", Crops.SENTRY_LIGHT, Crops.SENTRY_LIGHT_ITEM, CropModelTypes.ALL, new Boolean[]{true,false}, new String[]{LIGHT_SENTRY_STONE, Strings.Tier4}, true);
		}
	}
}
