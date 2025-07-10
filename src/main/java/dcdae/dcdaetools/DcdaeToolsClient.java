package dcdae.dcdaetools;

import dcdae.dcdaetools.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.text.Text;

public class DcdaeToolsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ItemTooltipCallback.EVENT.register((itemStack, context, type, tooltip) -> {
			if (itemStack.isOf(ModItems.CHOCOLATE_BANANA)) {
				tooltip.add(1, Text.translatable("item.dcdaetools.chocolate_banana.tooltip"));
			}
		});
	}
}
