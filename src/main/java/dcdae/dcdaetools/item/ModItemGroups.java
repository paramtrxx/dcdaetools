package dcdae.dcdaetools.item;

import dcdae.dcdaetools.DcdaeTools;
import dcdae.dcdaetools.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DCDAE_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(DcdaeTools.MOD_ID, "dcdae_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.dcdaetools.dcdae_group"))
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .entries((context, entries) -> {
                        entries.add(ModBlocks.CHOCOLATE_BLOCK);
                        entries.add(ModItems.CHOCOLATE);
                        entries.add(ModItems.CHOCOLATE_BANANA);
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                    })
                    .build()
    );

    public static void registerItemGroups() {

    }
}