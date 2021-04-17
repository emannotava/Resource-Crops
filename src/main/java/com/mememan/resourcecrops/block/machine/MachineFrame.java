package com.mememan.resourcecrops.block.machine;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;

public class MachineFrame extends Block{

	public MachineFrame(Settings settings) {
		super(settings);
	}
	
	@Override
	public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
		for(int i = 0; i < 7; i++){
			tooltip.add(new TranslatableText("warning.resourcecrops.experimental." + i));
		}
	}
	
}
