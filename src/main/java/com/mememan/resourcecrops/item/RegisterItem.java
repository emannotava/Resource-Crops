package com.mememan.resourcecrops.item;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Entities;
import com.mememan.resourcecrops.lib.HexColors;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.loot.RegisterCropLoot;
import com.mememan.resourcecrops.loot.RegisterEntityLoot;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
// import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class RegisterItem {
	
	public static final Item debug_item = addItem("debug_item", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item nugget_thurston = addItem("nugget_thurston", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item ingot_thurston = addItem("ingot_thurston", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item crafting_seed = addItem("crafting_seed", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item dragon_egg_fragment = addItem("dragon_egg_fragment", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	public static final Item dragon_egg_piece = addItem("dragon_egg_piece", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
	
	public static final Item METALLIC_ESSENCE_INGOT_TIER_1 = new ItemMetallicEssenceIngot("metallic_essence_ingot", "1", HexColors.TIER_1);
	public static final Item METALLIC_ESSENCE_INGOT_TIER_2 = new ItemMetallicEssenceIngot("metallic_essence_ingot", "2", HexColors.TIER_2);
	public static final Item METALLIC_ESSENCE_INGOT_TIER_3 = new ItemMetallicEssenceIngot("metallic_essence_ingot", "3", HexColors.TIER_3);
	public static final Item METALLIC_ESSENCE_INGOT_TIER_4 = new ItemMetallicEssenceIngot("metallic_essence_ingot", "4", HexColors.TIER_4);
	public static final Item METALLIC_ESSENCE_INGOT_TIER_5 = new ItemMetallicEssenceIngot("metallic_essence_ingot", "5", HexColors.TIER_5);
	public static final Item METALLIC_ESSENCE_INGOT_TIER_6 = new ItemMetallicEssenceIngot("metallic_essence_ingot", "6", HexColors.TIER_6);

	public static final Item INFUSION_STONE_TIER_SINGLIUM = addItem("infusion_stone/tier_singlium", new Item(new Item.Settings().group(Main.GROUP_MAIN).maxDamage(128)));
	public static final Item INFUSION_STONE_TIER_DOUBLIUM = addItem("infusion_stone/tier_doublium", new Item(new Item.Settings().group(Main.GROUP_MAIN).maxDamage(128)));
	public static final Item INFUSION_STONE_TIER_TRILIUM = addItem("infusion_stone/tier_trilium", new Item(new Item.Settings().group(Main.GROUP_MAIN).maxDamage(128)));
	public static final Item INFUSION_STONE_TIER_QUADRIUM = addItem("infusion_stone/tier_quadrium", new Item(new Item.Settings().group(Main.GROUP_MAIN).maxDamage(128)));
	public static final Item INFUSION_STONE_TIER_QUINTERIUM = addItem("infusion_stone/tier_quinterium", new Item(new Item.Settings().group(Main.GROUP_MAIN).maxDamage(128)));
	public static final Item INFUSION_STONE_TIER_SILERIUM = addItem("infusion_stone/tier_silerium", new Item(new Item.Settings().group(Main.GROUP_MAIN).maxDamage(128)));
	public static final Item INFUSION_STONE_TIER_INFINITY = addItem("infusion_stone/tier_infinity", new Item(new Item.Settings().group(Main.GROUP_MAIN).maxDamage(128)));
	
	//Logo's
	public static final Item MAIN_ICON = addItem("icon/main", new Item(new Item.Settings()));
	public static final Item SEEDS_ICON = addItem("icon/seeds", new Item(new Item.Settings()));
	public static final Item ESSENCE_ICON = addItem("icon/essence", new Item(new Item.Settings()));
	public static final Item EXPERIMENTAL_ICON = addItem("icon/experimental", new Item(new Item.Settings()));
	public static final Item TOOLS_ICON = addItem("icon/tools", new Item(new Item.Settings()));
	// public static final Item VANILLA_ICON = addItem("vanilla_icon", new Item(new Item.Settings()));
	// public static final Item AE2_ICON = addItem("ae2_icon", new Item(new Item.Settings()));
	// public static final Item TECHREBORN_ICON = addItem("techreborn_icon", new Item(new Item.Settings()));
	// public static final Item INDUSTRIALREVOLUTION_ICON = addItem("industrialrevolution_icon", new Item(new Item.Settings()));
	// public static final Item MYTHICMETALS_ICON = addItem("mythicmetals_icon", new Item(new Item.Settings()));
	// public static final Item ASTROMINE_ICON = addItem("astromine_icon", new Item(new Item.Settings()));
	// public static final Item BYG_ICON = addItem("byg_icon", new Item(new Item.Settings()));
	// public static final Item BOTANIA_ICON = addItem("botania_icon", new Item(new Item.Settings()));
	// public static final Item BLOCKUS_ICON = addItem("blockus_icon", new Item(new Item.Settings()));
	// public static final Item BIOMEMAKEOVER_ICON = addItem("biomemakeover_icon", new Item(new Item.Settings()));
	// public static final Item BEWITCHMENT_ICON = addItem("bewitchment_icon", new Item(new Item.Settings()));
	// public static final Item BETTEREND_ICON = addItem("betterend_icon", new Item(new Item.Settings()));
	// public static final Item C_ICON = addItem("c_icon", new Item(new Item.Settings()));
	// public static final Item CONJURING_ICON = addItem("conjuring_icon", new Item(new Item.Settings()));
	// public static final Item DML_REFABRICATED_ICON = addItem("dml-refabricated_icon", new Item(new Item.Settings()));
	// public static final Item AETHER_ICON = addItem("aether_icon", new Item(new Item.Settings()));
	
	
	public static void initialize(){

	}

	public static Item addItem(String itemName, Item ItemDeclaration){
		return Registry.register(Registry.ITEM, new Identifier(Strings.modId, itemName.toLowerCase()), ItemDeclaration);
	}

	public static Item addEssenceItem(String modNameShort, String itemName, Item ItemDeclaration){
		addEssenceItem(modNameShort, modNameShort, itemName.toLowerCase(), ItemDeclaration);
		return null;
	}

	public static Item addEssenceItem(String modNameFull, String modNameShort, String itemName, Item ItemDeclaration){
		if(itemName.toLowerCase()=="tier_1"){
			RegisterEntityLoot.loopThroughArrays(ItemDeclaration, 1, 5, 5F, Entities.vanillaPassive);
			RegisterEntityLoot.loopThroughArrays(ItemDeclaration, 1, 5, 5F, Entities.vanillaNeutral);
			RegisterEntityLoot.loopThroughArrays(ItemDeclaration, 1, 5, 5.3F, Entities.vanillaHostile);
		}else if(itemName.toLowerCase()=="tier_2"){
			RegisterEntityLoot.loopThroughArrays(ItemDeclaration, 1, 5, 1F, Entities.vanillaNeutral);
			RegisterEntityLoot.loopThroughArrays(ItemDeclaration, 1, 5, 1F, Entities.vanillaHostile);
		}else if(itemName.toLowerCase()=="tier_3"){
			RegisterEntityLoot.loopThroughArrays(ItemDeclaration, 1, 5, 0.1F, Entities.vanillaHostile);
		}else if(itemName.toLowerCase()=="tier_5"){
			RegisterEntityLoot.loopThroughArrays(ItemDeclaration, Entities.vanillaBoss);
		}else if(itemName.toLowerCase()=="tier_6"){
			RegisterEntityLoot.loopThroughArrays(ItemDeclaration, 3, 9, 0.1F, Entities.vanillaBoss);
		}
		
		if(Mods.checkMod(modNameFull)==true){
			// RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + itemName));
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName.toLowerCase()), ItemDeclaration);
		}else if(modNameShort==Mods.BetterEnd && Mods.checkMod(Mods.BetterEnd)==false && Mods.checkDevEnv()==true){
			// RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + modNameShort + "/" + itemName));
			RegisterCropLoot.addToLootTable(ItemDeclaration, 1, 2, 1F, new Identifier(Strings.modId, "blocks/crop_" + Strings.modId + "/ultimate"));
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName.toLowerCase()), ItemDeclaration);
		}
		
		else if(modNameShort==Mods.Astromine && Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==true){
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName.toLowerCase()), ItemDeclaration);
		}else if(modNameShort==Mods.Astromine && Mods.checkMod(Mods.Astromine)==true && Mods.checkMod(Mods.AstromineCore)==false){
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName.toLowerCase()), ItemDeclaration);
		}else if(modNameShort==Mods.Astromine && Mods.checkMod(Mods.Astromine)==false && Mods.checkMod(Mods.AstromineCore)==true){
			return Registry.register(Registry.ITEM, new Identifier(Strings.modId, "essence_" + modNameShort + "/" + itemName.toLowerCase()), ItemDeclaration);
		}		
		return ItemDeclaration;
	}
}
