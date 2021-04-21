package com.mememan.resourcecrops.itemgroup;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import party.lemons.sub_tabs.item.FakeItem;
import party.lemons.sub_tabs.itemgroup.ItemTab;
import party.lemons.sub_tabs.itemgroup.TabbedItemGroup;

import java.util.List;

import com.mememan.resourcecrops.block.RegisterBlock;
import com.mememan.resourcecrops.lib.Mods;

public class CreativeTab extends TabbedItemGroup
{
	public CreativeTab(Identifier id)
	{
		super(id);
	}

	public static final Item ICON_ITEM = new FakeItem();
	public static final Tag<Item> RESOURCECROPS = TagRegistry.item(new Identifier(Mods.ResourceCrops, "resourcecrops"));
	public static final Tag<Item> VANILLA = TagRegistry.item(new Identifier(Mods.ResourceCrops, "vanilla"));
	public static final Tag<Item> AE2 = TagRegistry.item(new Identifier(Mods.ResourceCrops, "ae2"));
	public static final Tag<Item> TECHREBORN = TagRegistry.item(new Identifier(Mods.ResourceCrops, "techreborn"));
	public static final Tag<Item> INDUSTRIALREVOLUTION = TagRegistry.item(new Identifier(Mods.ResourceCrops, "industrialrevolution"));
	public static final Tag<Item> MYTHICMETALS = TagRegistry.item(new Identifier(Mods.ResourceCrops, "mythicmetals"));
	public static final Tag<Item> ASTROMINE = TagRegistry.item(new Identifier(Mods.ResourceCrops, "astromine"));
	public static final Tag<Item> BYG = TagRegistry.item(new Identifier(Mods.ResourceCrops, "byg"));
	public static final Tag<Item> BOTANIA = TagRegistry.item(new Identifier(Mods.ResourceCrops, "botania"));
	public static final Tag<Item> BLOCKUS = TagRegistry.item(new Identifier(Mods.ResourceCrops, "blockus"));
	public static final Tag<Item> BIOMEMAKEOVER = TagRegistry.item(new Identifier(Mods.ResourceCrops, "biomemakeover"));
	public static final Tag<Item> BEWITCHMENT = TagRegistry.item(new Identifier(Mods.ResourceCrops, "bewitchment"));
	public static final Tag<Item> BETTEREND = TagRegistry.item(new Identifier(Mods.ResourceCrops, "betterend"));
	public static final Tag<Item> C = TagRegistry.item(new Identifier(Mods.ResourceCrops, "c"));
	public static final Tag<Item> CONJURING = TagRegistry.item(new Identifier(Mods.ResourceCrops, "conjuring"));
	public static final Tag<Item> DML_REFABRICATED = TagRegistry.item(new Identifier(Mods.ResourceCrops, "dml-refabricated"));
	public static final Tag<Item> AETHER = TagRegistry.item(new Identifier(Mods.ResourceCrops, "aether"));

	@Override
	public void initTabs(List<ItemTab> tabs)
	{
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "resourcecrops", RESOURCECROPS));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "vanilla", VANILLA));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "ae2", AE2));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "techreborn", TECHREBORN));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "industrialrevolution", INDUSTRIALREVOLUTION));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "mythicmetals", MYTHICMETALS));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "astromine", ASTROMINE));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "byg", BYG));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "botania", BOTANIA));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "blockus", BLOCKUS));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "biomemakeover", BIOMEMAKEOVER));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "bewitchment", BEWITCHMENT));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "betterend", BETTEREND));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "c", C));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "conjuring", CONJURING));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "dml-refabricated", DML_REFABRICATED));
		tabs.add(new ItemTab(new ItemStack(RegisterBlock.DEBUGBLOCK), "aether", AETHER));
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ICON_ITEM);
	}
}