package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.item.GemCommonJewel;
import com.mememan.resourcecrops.lib.HexColors;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.registry.RegisterRecipe;
import com.mememan.resourcecrops.registry.RegisterTags;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterJewel {

	public static void initialize(){
		createJewel("ruby", HexColors.Jewels.RUBY, "c:rubies");
		createJewel("sapphire", HexColors.Jewels.SAPPHIRE, "c:sapphires");
		createJewel("amethyst", HexColors.Jewels.AMETHYST, "c:amethysts");
		createJewel("topaz", HexColors.Jewels.TOPAZ, "c:topazes");
	}

	public static final Object createJewel(String name, int color, String tagName){
		gemJewel(name, color);
		blockJewel(name, color);
		String localized_name = Mods.ResourceCrops + ":common_jewel/" + name;
		String localized_block_name = localized_name + "_block";
		String localized_gem_name = localized_name + "_gem";
		RegisterTags.addToTag("c:" + name + "_block", localized_block_name);
		RegisterTags.addToTag("c:" + name + "_blocks", localized_block_name);
		RegisterTags.addToTag(tagName, localized_gem_name);
		RegisterTags.addToTag(tagName, localized_gem_name);
		RegisterRecipe.addIngotToBlockRecipe(localized_block_name, tagName);
		RegisterRecipe.addBlockToIngotRecipe(localized_gem_name, "c:" + name + "_block");
		return null;
	}

	public static Block blockJewel(String name, int color){
		return new BlockCommonJewel(name, color);
	}

	public static Item gemJewel(String name, int color){
		return new GemCommonJewel(name, color);
	}
}
