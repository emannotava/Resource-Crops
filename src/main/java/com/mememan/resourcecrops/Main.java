package com.mememan.resourcecrops;

import java.util.ArrayList;

import com.mememan.resourcecrops.block.RegisterBlock;
import com.mememan.resourcecrops.block.RegisterCrop;
import com.mememan.resourcecrops.item.RegisterItem;
import com.mememan.resourcecrops.lib.Crops;
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

	public static final ItemGroup GROUPMAIN = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "all"), () -> new ItemStack(Crops.ESSENCE_ESSENCE_TIER_CREATIVE));
	public static final ItemGroup GROUPSEEDS = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "seeds"), () -> new ItemStack(Crops.ESSENCE_TIER_1));
	public static final ItemGroup GROUPESSENCE = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "essence"), () -> new ItemStack(Crops.ESSENCE_ESSENCE_TIER_1));
	public static final ItemGroup GROUPEXPERIMENTAL = FabricItemGroupBuilder.build(new Identifier(Strings.modId, "experimental"), () -> new ItemStack(RegisterBlock.MACHINE_FRAME_IRON));

	// public static final Item TEST_SEEDS;
	// public static final Item TEST;
	// public static final Block TEST_BLOCK;
	
	// public static Item register(Identifier id, Item item) {
	// 	if (item instanceof BlockItem) {
	// 	   ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
	// 	}
	// 	return (Item)Registry.register(Registry.ITEM, (Identifier)id, item);
	//  }
	//  public static Block register(Identifier id, Block block) {
	// 	return (Block)Registry.register(Registry.BLOCK, id, block);
	//  }

	@Override
	public void onInitialize() {
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

	// static{
	// 	TEST_BLOCK = register(new Identifier(Strings.modId, "test"), new NewCropBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
	// 	TEST_SEEDS = register(new Identifier(Strings.modId, "test_seeds"), (Item)(new AliasedBlockItem(TEST_BLOCK, (new Item.Settings()).group(ItemGroup.MATERIALS))));
	// 	TEST = register(new Identifier(Strings.modId, "test"), new Item((new Item.Settings()).group(ItemGroup.MATERIALS)));
	// }
	
}
