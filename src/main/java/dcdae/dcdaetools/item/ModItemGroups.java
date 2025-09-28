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
                    .icon(() -> new ItemStack(ModItems.CHOCOLATE))
                    .entries((context, entries) -> {
                        entries.add(ModBlocks.CHOCOLATE_BLOCK);
                        entries.add(ModItems.CHOCOLATE);
                        entries.add(ModItems.CHOCOLATE_BANANA);
                        entries.add(ModBlocks.RUBY_BLOCK);
                    })
                    .build()
    );


    public static final ItemGroup QUEST_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(DcdaeTools.MOD_ID, "quest_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.dcdaetools.quest_group"))
                    .icon(() -> new ItemStack(ModItems.DEEP_SEE_CRYSTAL))
                    .entries((context, entries) -> {
                        entries.add(ModItems.AETHER_ESSENCE);
                        entries.add(ModItems.ANCIENT_KING_SCEPTER);
                        entries.add(ModItems.BLACK_PEARL);
                        entries.add(ModItems.CORRUPTED_GRAIL);
                        entries.add(ModItems.CORRUPTION_ORB);
                        entries.add(ModItems.CRYSTAL_PETAL);
                        entries.add(ModItems.CURSED_CROWN);
                        entries.add(ModItems.DEEP_SEE_CRYSTAL);
                        entries.add(ModItems.DESERT_ROSE);
                        entries.add(ModItems.EVIL_CODEX);
                        entries.add(ModItems.FROZEN_GRAIL);
                        entries.add(ModItems.FROZEN_SKULL);
                        entries.add(ModItems.GOLDEN_LANTERN);
                        entries.add(ModItems.MAGNIFICENT_CLAM_SHELL);
                        entries.add(ModItems.MOLTEN_TABLET);
                        entries.add(ModItems.MOSSY_TABLET);
                        entries.add(ModItems.PHARAOHS_MASK);
                        entries.add(ModItems.RED_URN);
                        entries.add(ModItems.ROTTEN_HEART);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SACK_OF_MAGIC_DUST);
                        entries.add(ModItems.SHACKLES);
                        entries.add(ModItems.SILVER_FEATHER);
                        entries.add(ModItems.SKELETAL_HAND);
                        entries.add(ModItems.STEEL_HEART);
                        entries.add(ModItems.STONE_IDOL);
                        entries.add(ModItems.SUPERCOOLED_CORE);
                        entries.add(ModItems.TOXIC_VIAL);
                        entries.add(ModItems.TRIBAL_TOTEM);
                        entries.add(ModItems.UNDEAD_ESSENCE);
                        entries.add(ModItems.UNHOLY_CANDLE);
                        entries.add(ModItems.WARDEN_EARS);
                        entries.add(ModItems.WICKED_TENTACLE);
                        entries.add(ModItems.WILDFIRE_ESSENCE);
                        entries.add(ModItems.WITHER_RIBCAGE);
                    })
                    .build()
    );

    public static void registerItemGroups() {

    }
}