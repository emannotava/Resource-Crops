package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.item.IngotCommonMetal;
import com.mememan.resourcecrops.item.NuggetCommonMetal;
import com.mememan.resourcecrops.lib.HexColors;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.registry.RegisterRecipe;
import com.mememan.resourcecrops.registry.RegisterTags;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterMetal {

	public static void initialize(){
		createMetal("aluminium", HexColors.Metals.ALUMINIUM);
		createMetal("beryllium", HexColors.Metals.BERYLLIUM);
		createMetal("bismuth", HexColors.Metals.BISMUTH);
		createMetal("brass", HexColors.Metals.BRASS);
		createMetal("bronze", HexColors.Metals.BRONZE);
		createMetal("chrome", HexColors.Metals.CHROME);
		createMetal("chromium", HexColors.Metals.CHROMIUM);
		createMetal("cobalt", HexColors.Metals.COBALT);
		createMetal("copper", HexColors.Metals.COPPER);
		createMetal("electrum", HexColors.Metals.ELECTRUM);
		createMetal("gallium", HexColors.Metals.GALLIUM);
		createMetal("indium", HexColors.Metals.INDIUM);
		createMetal("invar", HexColors.Metals.INVAR);
		createMetal("iridium", HexColors.Metals.IRIDIUM);
		createMetal("lead", HexColors.Metals.LEAD);
		createMetal("magnesium", HexColors.Metals.MAGNESIUM);
		createMetal("manganese", HexColors.Metals.MANGANESE);
		createMetal("mercury", HexColors.Metals.MERCURY);
		createMetal("nickel", HexColors.Metals.NICKEL);
		createMetal("osmium", HexColors.Metals.OSMIUM);
		createMetal("palladium", HexColors.Metals.PALLADIUM);
		createMetal("platinum", HexColors.Metals.PLATINUM);
		createMetal("plutonium", HexColors.Metals.PLUTONIUM);
		createMetal("potassium", HexColors.Metals.POTASSIUM);
		createMetal("rhodium", HexColors.Metals.RHODIUM);
		createMetal("samarium", HexColors.Metals.SAMARIUM);
		createMetal("scandium", HexColors.Metals.SCANDIUM);
		createMetal("silver", HexColors.Metals.SILVER);
		createMetal("sodium", HexColors.Metals.SODIUM);
		createMetal("steel", HexColors.Metals.STEEL);
		createMetal("thorium", HexColors.Metals.THORIUM);
		createMetal("tin", HexColors.Metals.TIN);
		createMetal("titanium", HexColors.Metals.TITANIUM);
		createMetal("tungsten", HexColors.Metals.TUNGSTEN);
		createMetal("uranium", HexColors.Metals.URANIUM);
		createMetal("zinc", HexColors.Metals.ZINC);
	}

	public static final Object createMetal(String name, int color){
		nuggetMetal(name, color);
		ingotMetal(name, color);
		blockMetal(name, color);
		String localized_name = Mods.ResourceCrops + ":common_metal/" + name;
		String localized_block_name = localized_name + "_block";
		String localized_ingot_name = localized_name + "_ingot";
		String localized_nugget_name = localized_name + "_nugget";
		RegisterTags.addToTag("c:" + name + "_block", localized_block_name);
		RegisterTags.addToTag("c:" + name + "_blocks", localized_block_name);
		RegisterTags.addToTag("c:" + name + "_ingot", localized_ingot_name);
		RegisterTags.addToTag("c:" + name + "_ingots", localized_ingot_name);
		RegisterTags.addToTag("c:" + name + "_nugget", localized_nugget_name);
		RegisterTags.addToTag("c:" + name + "_nuggets", localized_nugget_name);
		RegisterRecipe.addIngotToBlockRecipe(localized_block_name, "c:" + name + "_ingot");
		RegisterRecipe.addBlockToIngotRecipe(localized_ingot_name, "c:" + name + "_block");
		RegisterRecipe.addIngotToNuggetRecipe(localized_nugget_name, "c:" + name + "_ingot");
		return null;
	}

	public static Block blockMetal(String name, int color){
		return new BlockCommonMetal(name, color);
	}

	public static Item ingotMetal(String name, int color){
		return new IngotCommonMetal(name, color);
	}

	public static Item nuggetMetal(String name, int color){
		return new NuggetCommonMetal(name, color);
	}
}
