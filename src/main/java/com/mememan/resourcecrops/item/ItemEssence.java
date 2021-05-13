package com.mememan.resourcecrops.item;

import java.util.List;

import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.registry.RegisterRecipe;
import com.mememan.resourcecrops.util.color.Color;
import com.mememan.resourcecrops.util.text.Humanify;

import net.devtech.arrp.json.recipe.JIngredient;
import net.devtech.arrp.json.recipe.JKeys;
import net.devtech.arrp.json.recipe.JRecipe;
// import net.fabricmc.api.EnvType;
// import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
// import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static com.mememan.resourcecrops.Main.ASSETS;

public class ItemEssence extends Item {

	public String TOOLTIP_TIER = "Meow";
	public String TOOLTIP_MOD = "Meow";
	public String ESSENCE_NAME = "Meow";
	public Boolean GLINT_STATE;

	public ItemEssence(Settings settings, String tier, String mod, String name, int hex, String[] pattern, String outputItem, int outputAmount) {
		super(settings);
		doStuff(mod, tier, name, pattern, outputItem, outputAmount, false, hex);
	}
	
	public ItemEssence(Settings settings, String tier, String mod, String name, Boolean enableGlint, int hex, String[] pattern, String outputItem, int outputAmount) {
		super(settings);
		doStuff(mod, tier, name, pattern, outputItem, outputAmount, enableGlint, hex);
	}
	
	public ItemEssence(Settings settings, String tier, String modNameToCheck, String modNameToLabel, String name, String[] pattern, String outputItem, int outputAmount) {
		super(settings);
		doStuff(modNameToCheck, modNameToLabel, tier, name, pattern, outputItem, outputAmount, false);
	}
	public ItemEssence(Settings settings, String tier, String modNameToCheck, String modNameToLabel, String name, Boolean enableGlint, String[] pattern, String outputItem, int outputAmount) {
		super(settings);
		doStuff(modNameToCheck, modNameToLabel, tier, name, pattern, outputItem, outputAmount, enableGlint);
	}
	

	public void doStuff(String modNameToCheck, String modNameToLabel, String tier, String name, String[] pattern, String outputItem, int outputAmount, Boolean enableGlint){
		setVariables(tier, modNameToLabel, name, enableGlint);
		// if(Mods.checkMod(modNameToCheck)){
		// 	addRecipe(modNameToLabel, tier, name, pattern, outputItem, outputAmount);
		// }
	}
	public void doStuff(String mod, String tier, String name, String[] pattern, String outputItem, int outputAmount, Boolean enableGlint, int hex){
		doStuff(mod, mod, tier, name, pattern, outputItem, outputAmount, enableGlint);
		Color.setItemColor(hex, this);
	}
	
	public static void addRecipe(String mod, String tier, String name, String[] pattern, String outputItem, int outputAmount){
		ASSETS.addRecipe(
			new Identifier("arrp", "essence_" + mod + "/tier_" + tier + "/" + name.toLowerCase() + "_0"),
			JRecipe.shaped(RegisterRecipe.pattern(pattern),
			JKeys.keys().key("X", JIngredient.ingredient().item(Mods.ResourceCrops + ":essence_" + mod + "/" + name.toLowerCase())), RegisterRecipe.output(outputItem, outputAmount))
		);
	}
	public void setVariables(String tier, String mod, String name, Boolean enableGlint){
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		ESSENCE_NAME = name;
		if(enableGlint){
			GLINT_STATE = true;
			hasGlint(new ItemStack(this));
		}else{
			GLINT_STATE = false;
			hasGlint(new ItemStack(this));
		}
	}

	@Override
	public boolean hasGlint(ItemStack stack) {
		return GLINT_STATE;
	}

	@Override
	public String getTranslationKey(){
		return Humanify.convert(ESSENCE_NAME) + " Essence";
	}

	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
		if(TOOLTIP_TIER!="Meow"){
			tooltip.add(new TranslatableText("tooltip.tier_" + TOOLTIP_TIER));
		}
		if(TOOLTIP_MOD!="Meow"){
			tooltip.add(new TranslatableText("tooltip.mod." + TOOLTIP_MOD));
		}
	}
	
}
