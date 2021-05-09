package com.mememan.resourcecrops.item;

import static com.mememan.resourcecrops.item.RegisterItem.addItem;

import com.mememan.resourcecrops.Main;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RegisterFood {
	public static void initialize(){
		addItem("rainbow_feather", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
		addItem("raw_rainbow_chicken", new Item(new Item.Settings().group(Main.GROUP_MAIN).group(ItemGroup.FOOD).food(createFoodSettigns(5, 1.2, 3, StatusEffects.ABSORPTION, 600, 1))));
		addItem("bbq_rainbow_chicken", new Item(new Item.Settings().group(Main.GROUP_MAIN).group(ItemGroup.FOOD).food(createFoodSettigns(6, 2.4, 3, StatusEffects.REGENERATION, 1200, 1))));
		addItem("golden_rainbow_feather", new Item(new Item.Settings().group(Main.GROUP_MAIN)));
		addItem("raw_golden_rainbow_chicken", new Item(new Item.Settings().group(Main.GROUP_MAIN).group(ItemGroup.FOOD).food(createFoodSettigns(6, 4.8, 3, StatusEffects.STRENGTH, 2400, 1))));
		addItem("bbq_golden_rainbow_chicken", new Item(new Item.Settings().group(Main.GROUP_MAIN).group(ItemGroup.FOOD).food(createFoodSettigns(7, 9.6, 3, StatusEffects.HEALTH_BOOST, 4800, 1))));
	}

	public static FoodComponent createFoodSettigns(int hungerToRestore, double saturation, double chanceForEffect, StatusEffect statusEffect, int duration, int amplifier){
		return (new FoodComponent.Builder())
		.hunger(hungerToRestore * 2)
		.saturationModifier((float) saturation)
		.statusEffect(
			new StatusEffectInstance(statusEffect, duration, amplifier),
			(float) chanceForEffect / 10
		).meat().build();
	}
	public static FoodComponent createFoodSettigns(int hungerToRestore, double saturation){
		return (new FoodComponent.Builder())
		.hunger(hungerToRestore * 2)
		.saturationModifier((float) saturation)
		.meat().build();
	}
}
