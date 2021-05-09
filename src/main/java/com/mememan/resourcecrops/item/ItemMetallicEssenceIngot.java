package com.mememan.resourcecrops.item;
import com.mememan.resourcecrops.Main;
import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.lib.Sounds;
import com.mememan.resourcecrops.lib.Strings;

import com.mememan.resourcecrops.lib.tex.VanillaTex;
import com.mememan.resourcecrops.util.text.Humanify;

import net.devtech.arrp.json.models.JModel;
// import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import static com.mememan.resourcecrops.Main.ASSETS;

import java.util.List;

public class ItemMetallicEssenceIngot extends Item {

	public String NAME = "Meow";
	public String TIER = "Meow";
	public static FabricItemSettings ITEM_SETTINGS(){
		return new FabricItemSettings().group(Main.GROUP_MAIN);
	}

	public ItemMetallicEssenceIngot(String name, String tier, int hex) {
		super(ITEM_SETTINGS());
		NAME = name;
		TIER = tier;
		addItem(name + "_" + tier, this);
		ASSETS.addModel(JModel.modelKeepElements("minecraft:item/generated").textures(JModel.textures().var("layer0", VanillaTex.IRON_INGOT)), new Identifier(Mods.ResourceCrops, "item/" + name + "_" + tier));
		// ColorProviderRegistry.ITEM.register((stack, tintIndex) -> hex, this);
	}

	@Override
	public String getTranslationKey(){
		return "Tier " + TIER + " " + Humanify.convert(NAME);
	}
	
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand){
		player.playSound(Sounds.THURSTON, 1.0F, 1.0F);
		return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, player.getStackInHand(hand));
	}
	
	public static Item addItem(String itemName, Item ItemDeclaration){
		return Registry.register(Registry.ITEM, new Identifier(Strings.modId, itemName), ItemDeclaration);
	}
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
		tooltip.add(new TranslatableText("warning.resourcecrops.unobtainable.0"));
		tooltip.add(new TranslatableText("warning.resourcecrops.unobtainable.1"));
	}
}