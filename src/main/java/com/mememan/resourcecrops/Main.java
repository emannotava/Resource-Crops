package com.mememan.resourcecrops;

import java.util.ArrayList;

import com.mememan.resourcecrops.block.RegisterBlock;
import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.item.RegisterItem;
// import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.loot.RegisterEntityLoot;
import com.mememan.resourcecrops.registry.RegisterRecipe;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

	public static ArrayList<Block> crops = new ArrayList<>();
	public static final RuntimeResourcePack assets = RuntimeResourcePack.create(Strings.modId + ":arrp");

	public static final ItemGroup resourcecrops_groupMain = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "all"), () -> new ItemStack(Items.GOLDEN_APPLE/*RegisterItem.essence_tier_infinity*/));
	public static final ItemGroup resourcecrops_groupSeeds = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "seeds"), () -> new ItemStack(Items.WHEAT/*Crops.essence_tier_1*/));
	public static final ItemGroup resourcecrops_groupEssence = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "essence"), () -> new ItemStack(Items.WHEAT_SEEDS/*Crops.essence_essence_tier_1*/));

	@Override
	public void onInitialize() {
		RegisterItem.initialize();
		RegisterBlock.initialize();
		RegisterRecipe.initialize();
		RegisterCrop.initialize();
		RegisterEntityLoot.initialize();
		RRPCallback.EVENT.register(a -> a.add(assets));
		System.out.println("Resource Crops(Server-Side) has been initialized!");
	}
	
}
