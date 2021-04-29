package com.mememan.resourcecrops.item;
import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;

import com.mememan.resourcecrops.lib.tex.VanillaTex;
import com.mememan.resourcecrops.registry.RegisterTags;
import com.mememan.resourcecrops.util.text.Humanify;

import net.devtech.arrp.json.models.JModel;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mememan.resourcecrops.Main.ASSETS;

public class NuggetCommonMetal extends Item {

	public String NAME = "Meow";
	public String NAME_HUMANIFY = "Meow";
	public static FabricItemSettings ITEM_SETTINGS(){
		return new FabricItemSettings().group(Main.GROUP_MAIN);
	}

	public NuggetCommonMetal(String name, int hex){
		super(ITEM_SETTINGS());
		NAME = "common_metal/" + name + "_nugget";
		NAME_HUMANIFY = name;
		addItem(NAME, this);
		ASSETS.addModel(JModel.modelKeepElements("minecraft:item/generated").textures(JModel.textures().var("layer0", VanillaTex.IRON_NUGGET)), new Identifier(Mods.ResourceCrops, "item/" + NAME));
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> hex, this);
		RegisterTags.addToTag("c:" + name + "_nugget", Mods.ResourceCrops + ":" + NAME);
	}

	@Override
	public String getTranslationKey(){
		return Humanify.convert(NAME_HUMANIFY) + " Nugget";
	}
	
	public static Item addItem(String itemName, Item itemDeclaration){
		return Registry.register(Registry.ITEM, new Identifier(Strings.modId, itemName), itemDeclaration);
	}
}