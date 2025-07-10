package dcdae.dcdaetools.block;

import dcdae.dcdaetools.DcdaeTools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            AbstractBlock.Settings.create().strength(5.0f, 6.0f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)
                    .mapColor(MapColor.BRIGHT_RED));

    public static final Block CHOCOLATE_BLOCK = registerBlock("chocolate_block",
            AbstractBlock.Settings.create().strength(0.3f, 0.3f)
                    .sounds(BlockSoundGroup.TUFF)
                    .mapColor(MapColor.TERRACOTTA_BROWN));





    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DcdaeTools.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }


    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DcdaeTools.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }



    public static void register() {
        DcdaeTools.LOGGER.debug("Registering Mod Blocks for " + DcdaeTools.MOD_ID);

    }

}





