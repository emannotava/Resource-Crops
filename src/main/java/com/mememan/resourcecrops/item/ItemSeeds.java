package com.mememan.resourcecrops.item;

import java.util.List;

import com.mememan.resourcecrops.block.BlockCrop;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class ItemSeeds extends AliasedBlockItem {

	public String tooltipContent = "Meow";
	public String tooltipContent2 = "Meow";
	public String seedName = "Meow";

	public ItemSeeds(Block block, Settings settings, String tier, String mod, String name) {
		super(block, settings);
		BlockCrop.setSeedsItem(this);
		tooltipContent = tier;
		tooltipContent2 = mod;
		seedName = name;
	}

	@Override
	public Text getName() {
	  return new TranslatableText("resourcecrops.seeds", seedName);
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
