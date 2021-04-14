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
	
	public static final Item essence_tier_1 = new ItemEssence(new Item.Settings().group(Main.GROUPMAIN), "1");
	public static final Item essence_tier_2 = new ItemEssence(new Item.Settings().group(Main.GROUPMAIN), "2");
	public static final Item essence_tier_3 = new ItemEssence(new Item.Settings().group(Main.GROUPMAIN), "3");
	public static final Item essence_tier_4 = new ItemEssence(new Item.Settings().group(Main.GROUPMAIN), "4");
	public static final Item essence_tier_5 = new ItemEssence(new Item.Settings().group(Main.GROUPMAIN), "5");
	public static final Item essence_tier_6 = new ItemEssence(new Item.Settings().group(Main.GROUPMAIN), "6");
	public static final Item essence_tier_infinity = new ItemEssence(new Item.Settings().group(Main.GROUPMAIN).rarity(Rarity.RARE), "infinity");
	public static final Item essence_tier_creative = new ItemEssence(new Item.Settings().group(Main.GROUPMAIN).rarity(Rarity.EPIC), "creative");
	
	public static final Item debug_item = addItem("debug_item", new Item(new Item.Settings().group(Main.GROUPMAIN)));
	public static final Item nugget_thurston = addItem("nugget_thurston", new Item(new Item.Settings().group(Main.GROUPMAIN)));
	public static final Item ingot_thurston = addItem("ingot_thurston", new Item(new Item.Settings().group(Main.GROUPMAIN)));
	public static final Item crafting_seed = addItem("crafting_seed", new Item(new Item.Settings().group(Main.GROUPMAIN)));
	public static final Item dragon_egg_fragment = addItem("dragon_egg_fragment", new Item(new Item.Settings().group(Main.GROUPMAIN)));
	public static final Item dragon_egg_piece = addItem("dragon_egg_piece", new Item(new Item.Settings().group(Main.GROUPMAIN)));
	
	
	public static void initialize(){
		//addItem("essence_tier_1", essence_tier_1);
		//addItem("essence_tier_2", essence_tier_2);
		//addItem("essence_tier_3", essence_tier_3);
		//addItem("essence_tier_4", essence_tier_4);
		//addItem("essence_tier_5", essence_tier_5);
		//addItem("essence_tier_6", essence_tier_6);
		//addItem("essence_tier_infinity", essence_tier_infinity);
		//addItem("essence_tier_creative", essence_tier_creative);
	}

	public static Item addItem(String itemName, Item ItemDeclaration){
		return Registry.register(Registry.ITEM, new Identifier(Strings.modId, itemName), ItemDeclaration);
	}

	public static Item addEssenceItem(String modNameShort, String itemName, Item ItemDeclaration){
		if(Mods.checkMod(modNameShort)==true){
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + itemName));
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName), ItemDeclaration);
		}else if(modNameShort==Mods.BetterEnd && Mods.checkMod(Mods.BetterEnd)==false && Mods.checkDevEnv()==true){
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + itemName));
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

	public static Item addEssenceItem(String modNameFull, String modNameShort, String itemName, Item ItemDeclaration){
		if(Mods.checkMod(modNameFull)==true){
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + itemName));
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName), ItemDeclaration);
		}else{
			return null;
		}
	}
}
