package com.mememan.resourcecrops.item;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.loot.RegisterCropLoot;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class RegisterItem {
	
	public static final Item essence_tier_1 = new ItemEssence(new Item.Settings().group(Main.GROUP_MAIN), "1");
	public static final Item essence_tier_2 = new ItemEssence(new Item.Settings().group(Main.GROUP_MAIN), "2");
	public static final Item essence_tier_3 = new ItemEssence(new Item.Settings().group(Main.GROUP_MAIN), "3");
	public static final Item essence_tier_4 = new ItemEssence(new Item.Settings().group(Main.GROUP_MAIN), "4");
	public static final Item essence_tier_5 = new ItemEssence(new Item.Settings().group(Main.GROUP_MAIN), "5");
	public static final Item essence_tier_6 = new ItemEssence(new Item.Settings().group(Main.GROUP_MAIN), "6");
	public static final Item essence_tier_infinity = new ItemEssence(new Item.Settings().group(Main.GROUP_MAIN).rarity(Rarity.RARE), "infinity");
	public static final Item essence_tier_creative = new ItemEssence(new Item.Settings().group(Main.GROUP_MAIN).rarity(Rarity.EPIC), "creative");
	
	public static final Item debug_item = addItem("debug_item", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item nugget_thurston = addItem("nugget_thurston", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item ingot_thurston = addItem("ingot_thurston", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item crafting_seed = addItem("crafting_seed", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item dragon_egg_fragment = addItem("dragon_egg_fragment", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item dragon_egg_piece = addItem("dragon_egg_piece", new Item(new Item.Settings().group(Main.GROUP_MAIN)));

	//Logo's
	public static final Item RESOURCECROPS_ICON = addItem("resourcecrops_icon", new Item(new Item.Settings()));
	public static final Item VANILLA_ICON = addItem("vanilla_icon", new Item(new Item.Settings()));
	public static final Item AE2_ICON = addItem("ae2_icon", new Item(new Item.Settings()));
	public static final Item TECHREBORN_ICON = addItem("techreborn_icon", new Item(new Item.Settings()));
	public static final Item INDUSTRIALREVOLUTION_ICON = addItem("industrialrevolution_icon", new Item(new Item.Settings()));
	public static final Item MYTHICMETALS_ICON = addItem("mythicmetals_icon", new Item(new Item.Settings()));
	public static final Item ASTROMINE_ICON = addItem("astromine_icon", new Item(new Item.Settings()));
	public static final Item BYG_ICON = addItem("byg_icon", new Item(new Item.Settings()));
	public static final Item BOTANIA_ICON = addItem("botania_icon", new Item(new Item.Settings()));
	public static final Item BLOCKUS_ICON = addItem("blockus_icon", new Item(new Item.Settings()));
	public static final Item BIOMEMAKEOVER_ICON = addItem("biomemakeover_icon", new Item(new Item.Settings()));
	public static final Item BEWITCHMENT_ICON = addItem("bewitchment_icon", new Item(new Item.Settings()));
	public static final Item BETTEREND_ICON = addItem("betterend_icon", new Item(new Item.Settings()));
	public static final Item C_ICON = addItem("c_icon", new Item(new Item.Settings()));
	public static final Item CONJURING_ICON = addItem("conjuring_icon", new Item(new Item.Settings()));
	public static final Item DML_REFABRICATED_ICON = addItem("dml-refabricated_icon", new Item(new Item.Settings()));
	public static final Item AETHER_ICON = addItem("aether_icon", new Item(new Item.Settings()));
	
	
	public static void initialize(){

	}

	public static Item addItem(String itemName, Item ItemDeclaration){
		return Registry.register(Registry.ITEM, new Identifier(Strings.modId, itemName), ItemDeclaration);
	}

	public static Item addEssenceItem(String modNameShort, String itemName, Item ItemDeclaration){
		addEssenceItem(modNameShort, modNameShort, itemName, ItemDeclaration);
		return null;
	}

	public static Item addEssenceItem(String modNameFull, String modNameShort, String itemName, Item ItemDeclaration){
		if(Mods.checkMod(modNameFull)==true){
			// RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + itemName));
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName), ItemDeclaration);
		}else if(modNameShort==Mods.BetterEnd && Mods.checkMod(Mods.BetterEnd)==false && Mods.checkDevEnv()==true){
			// RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + itemName));
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName), ItemDeclaration);
		}
		
		else if(modNameShort==Mods.Astromine && Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==true){
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName), ItemDeclaration);
		}else if(modNameShort==Mods.Astromine && Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==false){
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName), ItemDeclaration);
		}else if(modNameShort==Mods.Astromine && Mods.checkMod(Mods.Astromine)==false && Mods.checkMod(Mods.AstromineCore)==true){
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName), ItemDeclaration);
		}
		
		else{
			return null;
		}
	}
}
