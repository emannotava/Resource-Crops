package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.item.IngotCommonMetal;
import com.mememan.resourcecrops.item.NuggetCommonMetal;
import com.mememan.resourcecrops.lib.HexColors;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterMetal {

	public static void initialize(){
		createMetal("aluminium", HexColors.Metals.ALUMINIUM);
		createMetal("beryllium", HexColors.Metals.BERYLLIUM);
		createMetal("bismuth", HexColors.Metals.BISMUTH);
		createMetal("chromium", HexColors.Metals.CHROMIUM);
		createMetal("cobalt", HexColors.Metals.COBALT);
		createMetal("copper", HexColors.Metals.COPPER);
		createMetal("iridium", HexColors.Metals.IRIDIUM);
		createMetal("brass", HexColors.Metals.BRASS);
		createMetal("bronze", HexColors.Metals.BRONZE);
		createMetal("gallium", HexColors.Metals.GALLIUM);
		createMetal("indium", HexColors.Metals.INDIUM);
		createMetal("lead", HexColors.Metals.LEAD);
		createMetal("magnesium", HexColors.Metals.MAGNESIUM);
		createMetal("manganese", HexColors.Metals.MANGANESE);
		createMetal("mercury", HexColors.Metals.MERCURY);
		createMetal("nickel", HexColors.Metals.NICKEL);
		createMetal("plutonium", HexColors.Metals.PLUTONIUM);
		createMetal("potassium", HexColors.Metals.POTASSIUM);
		createMetal("rhodium", HexColors.Metals.RHODIUM);
		createMetal("samarium", HexColors.Metals.SAMARIUM);
		createMetal("scandium", HexColors.Metals.SCANDIUM);
		createMetal("silver", HexColors.Metals.SILVER);
		createMetal("sodium", HexColors.Metals.SODIUM);
		createMetal("titanium", HexColors.Metals.TITANIUM);
		createMetal("tin", HexColors.Metals.TIN);
		createMetal("uranium", HexColors.Metals.URANIUM);
		createMetal("zinc", HexColors.Metals.ZINC);
	}

	public static final Object createMetal(String name, int color){
		nuggetMetal(name, color);
		ingotMetal(name, color);
		blockMetal(name, color);
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
