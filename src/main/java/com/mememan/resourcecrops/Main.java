package com.mememan.resourcecrops;

import java.util.ArrayList;

import com.mememan.resourcecrops.block.RegisterBlock;
import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.item.RegisterItem;
import com.mememan.resourcecrops.itemgroup.CreativeTab;
import com.mememan.resourcecrops.lib.Crops;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.loot.RegisterEntityLoot;
import com.mememan.resourcecrops.registry.RegisterLootTables;
import com.mememan.resourcecrops.registry.RegisterRecipe;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

	public static ArrayList<Block> crops = new ArrayList<>();
	public static final RuntimeResourcePack assets = RuntimeResourcePack.create(Strings.modId + ":arrp");

	public static ItemGroup GROUP;
	public static final ItemGroup GROUP_MAIN = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "all"), () -> new ItemStack(Crops.ESSENCE_ESSENCE_TIER_CREATIVE));
	public static final ItemGroup GROUP_SEEDS = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "seeds"), () -> new ItemStack(Crops.ESSENCE_TIER_1));
	public static final ItemGroup GROUP_ESSENCE = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "essence"), () -> new ItemStack(Crops.ESSENCE_ESSENCE_TIER_1));
	public static final ItemGroup GROUP_EXPERIMENTAL = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "experimental"), () -> new ItemStack(RegisterBlock.MACHINE_FRAME_IRON));

	@Override
	public void onInitialize() {
		if(Mods.checkDevEnv()){
			GROUP = new CreativeTab(new Identifier(Strings.modId, Strings.modId));
		}
		RegisterItem.initialize();
		RegisterBlock.initialize();
		RegisterCrop.initialize();
		RegisterRecipe.initialize();
		RegisterLootTables.initialize();
		RegisterEntityLoot.initialize();
		// test = Blocks.register("test", new CropBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
		RRPCallback.EVENT.register(a -> a.add(assets));
		System.out.println("Resource Crops(Server-Side) has been initialized!");
	}
	
}
