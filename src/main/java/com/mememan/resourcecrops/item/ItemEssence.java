package com.mememan.resourcecrops.item;

import java.util.List;

import com.mememan.resourcecrops.util.text.Humanify;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class ItemEssence extends Item {

	public String TOOLTIP_TIER = "Meow";
	public String TOOLTIP_MOD = "Meow";
	public String essenceName = "Meow";
	public Boolean glintState;

	public ItemEssence(Settings settings, String tier, String mod, String name) {
		super(settings);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		essenceName = name;
		glintState = false;
		hasGlint(new ItemStack(this));
	}

	public ItemEssence(Settings settings, String tier, String mod, String name, Boolean enableGlint) {
		super(settings);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		essenceName = name;
		if(enableGlint){
			glintState = true;
			hasGlint(new ItemStack(this));
		}else {
			glintState = false;
			hasGlint(new ItemStack(this));
		}
	}

	@Override
	public boolean hasGlint(ItemStack stack) {
		return glintState;
	}

	@Override
	public String getTranslationKey(){
		return Humanify.convert(essenceName) + " Essence";
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
