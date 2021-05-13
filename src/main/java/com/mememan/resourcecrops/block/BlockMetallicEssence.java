package com.mememan.resourcecrops.block;

import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Strings;
import com.mememan.resourcecrops.lib.tex.VanillaTex;
import com.mememan.resourcecrops.registry.RegisterBlockStates;
import com.mememan.resourcecrops.util.color.Color;
import com.mememan.resourcecrops.util.text.Humanify;

import net.devtech.arrp.json.blockstate.JState;
import net.devtech.arrp.json.models.JModel;
// import net.fabricmc.api.EnvType;
// import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
// import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import static com.mememan.resourcecrops.Main.ASSETS;

import java.util.List;

public class BlockMetallicEssence extends Block{

	public String NAME = "Meow";
	public String TIER = "Meow";
	public static FabricItemSettings ITEM_SETTINGS(){
		return new FabricItemSettings().group(Main.GROUP_MAIN);
	}
	public static FabricBlockSettings BLOCK_SETTINGS(float strength){
		return FabricBlockSettings.of(Material.METAL).requiresTool().sounds(BlockSoundGroup.METAL).strength(strength);
	}

	public BlockMetallicEssence(String name, String tier, int hex, float strength) {
		super(BLOCK_SETTINGS(strength));
		NAME = name;
		TIER = tier;
		addBlock(name + "_" + tier, this, Main.GROUP_MAIN);
		JState blockstate = JState.state(RegisterBlockStates.defaulVariant(JState.model("resourcecrops:block/" + name + "_" + tier)));
		ASSETS.addBlockState(blockstate, new Identifier(Strings.modId, name + "_" + tier));
		ASSETS.addModel(JModel.modelKeepElements(Strings.modId + ":block/templates/tinted_block").textures(JModel.textures().var("all", VanillaTex.IRON_BLOCK)), new Identifier(Mods.ResourceCrops, "block/" + name + "_" + tier));
		ASSETS.addModel(JModel.modelKeepElements(Mods.ResourceCrops + ":block/" + name + "_" + tier), new Identifier(Mods.ResourceCrops + ":item/" + name + "_" + tier));
		Color.setBlockColor(hex, this);
		Color.setItemColor(hex, this);
	}

	@Override
	public String getTranslationKey(){
		return "Tier " + TIER + " " + Humanify.convert(NAME);
	}

	public static void addBlock(String blockName, Block blockDeclaration, ItemGroup creativeTab){
		Registry.register(Registry.BLOCK, new Identifier(Strings.modId, blockName), blockDeclaration);
		Registry.register(Registry.ITEM, new Identifier(Strings.modId, blockName), new BlockItem(blockDeclaration, new FabricItemSettings().group(creativeTab)));
	}

	@Override
	public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
		tooltip.add(new TranslatableText("warning.resourcecrops.unobtainable.0"));
		tooltip.add(new TranslatableText("warning.resourcecrops.unobtainable.1"));
	}
	
}
