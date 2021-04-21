package com.mememan.resourcecrops.item;

import java.util.List;

import net.minecraft.item.AliasedBlockItem;
// import net.minecraft.item.Item;

import com.mememan.resourcecrops.block.BlockCrop;
import com.mememan.resourcecrops.util.text.Humanify;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class ItemSeeds extends AliasedBlockItem {
	public String TOOLTIP_TIER = "Meow";
	public String TOOLTIP_MOD = "Meow";
	public String SEEDNAME = "Meow";
	public Boolean GLINTSTATE;

	public ItemSeeds(Block block, Settings settings, String tier, String mod, String name) {
		super(block, settings);
		BlockCrop.setSeedsItem(this);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		SEEDNAME = name;
		GLINTSTATE = false;
		hasGlint(new ItemStack(this));
	}

	public ItemSeeds(Block block, Settings settings, String tier, String mod, String name, Boolean enableGlint) {
		super(block, settings);
		BlockCrop.setSeedsItem(this);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		SEEDNAME = name;
		if(enableGlint){
			GLINTSTATE = true;
			hasGlint(new ItemStack(this));
		}else {
			GLINTSTATE = false;
			hasGlint(new ItemStack(this));
		}
	}
	@Override
	public boolean hasGlint(ItemStack stack) {
		return GLINTSTATE;
	}

	@Override
	public String getTranslationKey(){
		return Humanify.convert(SEEDNAME) + " Seeds";
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
