package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.item.GemCommonJewel;
import com.mememan.resourcecrops.lib.HexColors;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterJewel {

	public static void initialize(){
		createJewel("ruby", HexColors.Jewels.RUBY);
		createJewel("sapphire", HexColors.Jewels.SAPPHIRE);
		createJewel("amethyst", HexColors.Jewels.AMETHYST);
		createJewel("topaz", HexColors.Jewels.TOPAZ);
	}

	public static final Object createJewel(String name, int color){
		gemJewel(name, color);
		blockJewel(name, color);
		return null;
	}

	public static Block blockJewel(String name, int color){
		return new BlockCommonJewel(name, color);
	}

	public static Item gemJewel(String name, int color){
		return new GemCommonJewel(name, color);
	}
}
