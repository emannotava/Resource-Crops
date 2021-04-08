package com.mememan.resourcecrops.item;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class ItemEssence extends Item {

	public String tooltipContent = "Meow";
	public String tooltipContent2 = "Meow";

	public ItemEssence(Settings settings) {
		super(settings);
	}

	public ItemEssence(Settings settings, String tier) {
		super(settings);
		tooltipContent = tier;
	}
	public ItemEssence(Settings settings, String tier, String mod) {
		super(settings);
		tooltipContent = tier;
		tooltipContent2 = mod;
	}

	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
		if(tooltipContent!="Meow"){
			tooltip.add(new TranslatableText("tooltip.resourcecrops.tier_" + tooltipContent));
		}
		if(tooltipContent2!="Meow"){
			tooltip.add(new TranslatableText("tooltip.resourcecrops.mod." + tooltipContent2));
		}
	}
	
}
