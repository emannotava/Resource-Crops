package com.mememan.resourcecrops.item;

import java.util.List;

import com.mememan.resourcecrops.lib.Mods;
import com.mememan.resourcecrops.util.text.Humanify;

import net.devtech.arrp.json.models.JModel;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static com.mememan.resourcecrops.Main.ASSETS;

public class ItemInfusionGemstone extends Item {

	public String TOOLTIP_TIER = "Meow";
	public String GEMSTONE_NAME = "Meow";

	public ItemInfusionGemstone(Settings settings, String tier) {
		super(settings);
		TOOLTIP_TIER = tier;
		GEMSTONE_NAME = tier;
		ASSETS.addModel(JModel.modelKeepElements("minecraft:item/generated").textures(
			JModel.textures()
			.var("layer0", Mods.ResourceCrops + ":item/infusion_gemstone/tier_" + GEMSTONE_NAME)
		),
		new Identifier(Mods.ResourceCrops, "item/infusion_gemstone/tier_" + GEMSTONE_NAME));
	}

	@Override
	public String getTranslationKey(){
		return Humanify.convert(GEMSTONE_NAME) + " Infusion Gemstone";
	}

	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
		if(TOOLTIP_TIER!="Meow"){
			tooltip.add(new TranslatableText("tooltip.tier_" + TOOLTIP_TIER));
		}
	}
	
}
