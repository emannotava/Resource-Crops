package com.mememan.resourcecrops.mods;

import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.lib.*;
import com.mememan.resourcecrops.lib.tex.CommonTex;

import static com.mememan.resourcecrops.lib.ingredient.CommonIngredient.*;

public class Common {
	public static void init(){
		if(Mods.checkMod(Mods.CottonResources)==true){

			//TODO Add individual checks per crop for each mod that contains its resource material
			RegisterCrop.addCrop(Mods.COMMON, "aluminum", Crops.ALUMINUM, Crops.ALUMINUM_ITEM, new String[]{CommonTex.ALUMINUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{ALUMINUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "brass", Crops.BRASS, Crops.BRASS_ITEM, new String[]{CommonTex.BRASS_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{BRASS_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "copper", Crops.COPPER, Crops.COPPER_ITEM, new String[]{CommonTex.COPPER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{COPPER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "electrum", Crops.ELECTRUM, Crops.ELECTRUM_ITEM, new String[]{CommonTex.ELECTRUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{ELECTRUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "iridium", Crops.IRIDIUM, Crops.IRIDIUM_ITEM, new String[]{CommonTex.IRIDIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{IRIDIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "lead", Crops.LEAD, Crops.LEAD_ITEM, new String[]{CommonTex.LEAD_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{LEAD_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "platinum", Crops.PLATINUM, Crops.PLATINUM_ITEM, new String[]{CommonTex.PLATINUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{PLATINUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "silver", Crops.SILVER, Crops.SILVER_ITEM, new String[]{CommonTex.SILVER_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{SILVER_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "steel", Crops.STEEL, Crops.STEEL_ITEM, new String[]{CommonTex.STEEL_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{STEEL_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "tin", Crops.TIN, Crops.TIN_ITEM, new String[]{CommonTex.TIN_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{TIN_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "titanium", Crops.TITANIUM, Crops.TITANIUM_ITEM, new String[]{CommonTex.TITANIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{TITANIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "tungsten", Crops.TUNGSTEN, Crops.TUNGSTEN_ITEM, new String[]{CommonTex.TUNGSTEN_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{TUNGSTEN_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "zinc", Crops.ZINC, Crops.ZINC_ITEM, new String[]{CommonTex.ZINC_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{ZINC_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "peridot", Crops.PERIDOT, Crops.PERIDOT_ITEM, new String[]{CommonTex.PERIDOT_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{PERIDOT_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "ruby", Crops.RUBY, Crops.RUBY_ITEM, new String[]{CommonTex.RUBY_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{RUBY_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "sapphire", Crops.SAPPHIRE, Crops.SAPPHIRE_ITEM, new String[]{CommonTex.SAPPHIRE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{SAPPHIRE_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "amethyst", Crops.AMETHYST, Crops.AMETHYST_ITEM, new String[]{CommonTex.AMETHYST_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{AMETHYST, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "coal_coke", Crops.COAL_COKE, Crops.COAL_COKE_ITEM, new String[]{CommonTex.COAL_COKE_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{COAL_COKE, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "cobalt", Crops.COBALT, Crops.COBALT_ITEM, new String[]{CommonTex.COBALT_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{COBALT_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "osmium", Crops.OSMIUM, Crops.OSMIUM_ITEM, new String[]{CommonTex.OSMIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{OSMIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "palladium", Crops.PALLADIUM, Crops.PALLADIUM_ITEM, new String[]{CommonTex.PALLADIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{PALLADIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "plutonium", Crops.PLUTONIUM, Crops.PLUTONIUM_ITEM, new String[]{CommonTex.PLUTONIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{PLUTONIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "thorium", Crops.THORIUM, Crops.THORIUM_ITEM, new String[]{CommonTex.THORIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{THORIUM_INGOT, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "topaz", Crops.TOPAZ, Crops.TOPAZ_ITEM, new String[]{CommonTex.TOPAZ_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{TOPAZ_GEM, Strings.Tier3}, true);
			RegisterCrop.addCrop(Mods.COMMON, "uranium", Crops.URANIUM, Crops.URANIUM_ITEM, new String[]{CommonTex.URANIUM_BLOCK}, CropModelTypes.ALL, new Boolean[]{true, true}, new String[]{URANIUM_INGOT, Strings.Tier3}, true);
		}
	}
}
