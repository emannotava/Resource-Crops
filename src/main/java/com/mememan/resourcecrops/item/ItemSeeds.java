package com.mememan.resourcecrops.item;

import java.util.List;

import net.minecraft.item.AliasedBlockItem;
import com.mememan.resourcecrops.block.BlockCrop;
import com.mememan.resourcecrops.util.color.Color;
import com.mememan.resourcecrops.util.text.Humanify;

// import net.fabricmc.api.EnvType;
// import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
// import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class ItemSeeds extends AliasedBlockItem {
	public String TOOLTIP_TIER = "Meow";
	public String TOOLTIP_MOD = "Meow";
	public String SEED_NAME = "Meow";
	public Boolean GLINTSTATE;

	public ItemSeeds(BlockCrop block, Settings settings, String tier, String mod, String name) {
		super(block, settings);
		// BlockCrop.setSeedsItem(this);
		block.setSeedsItem(this);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		SEED_NAME = name;
		GLINTSTATE = false;
		hasGlint(new ItemStack(this));
	}
	
	public ItemSeeds(BlockCrop block, Settings settings, String tier, String mod, String name, Boolean enableGlint) {
		super(block, settings);
		// BlockCrop.setSeedsItem(this);
		block.setSeedsItem(this);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		SEED_NAME = name;
		if(enableGlint){
			GLINTSTATE = true;
			hasGlint(new ItemStack(this));
		}else {
			GLINTSTATE = false;
			hasGlint(new ItemStack(this));
		}
	}

	public ItemSeeds(BlockCrop block, Settings settings, String tier, String mod, String name, int hex) {
		super(block, settings);
		// BlockCrop.setSeedsItem(this);
		block.setSeedsItem(this);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		SEED_NAME = name;
		Color.setItemColor(hex, this);
		GLINTSTATE = false;
		hasGlint(new ItemStack(this));
	}
	
	public ItemSeeds(BlockCrop block, Settings settings, String tier, String mod, String name, Boolean enableGlint, int hex) {
		super(block, settings);
		// BlockCrop.setSeedsItem(this);
		block.setSeedsItem(this);
		TOOLTIP_TIER = tier;
		TOOLTIP_MOD = mod;
		SEED_NAME = name;
		Color.setItemColor(hex, this);
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
		return Humanify.convert(SEED_NAME) + " Seeds";
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
