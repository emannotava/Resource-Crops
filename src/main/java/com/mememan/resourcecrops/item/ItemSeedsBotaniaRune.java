package com.mememan.resourcecrops.item;

import java.util.List;

import com.mememan.resourcecrops.block.BlockCropBotaniaRune;

import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
// import net.minecraft.item.BlockItem;
// import net.minecraft.item.Item.Settings;
import com.mememan.resourcecrops.util.text.Humanify;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class ItemSeedsBotaniaRune extends AliasedBlockItem {

	public String tooltipContent = "Meow";
	public String tooltipContent2 = "Meow";
	public String seedName = "Meow";

	public ItemSeedsBotaniaRune(Block block, Settings settings, String tier, String mod, String name) {
		super(block, settings);
		((BlockCropBotaniaRune) block).setSeedsItem(this);
		tooltipContent = tier;
		tooltipContent2 = mod;
		seedName = name;
	}

	@Override
	public String getTranslationKey(){
		return Humanify.convert(seedName) + " Seeds";
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
