package dcdae.dcdaetools.item;

import dcdae.dcdaetools.DcdaeTools;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.function.Function;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", Item::new, new Item.Settings());

    public static final Item CHOCOLATE = registerItem("chocolate", Item::new, new Item.Settings()
            .food(ModFoodComponents.CHOCOLATE));

    public static final Item CHOCOLATE_BANANA = registerItem("chocolate_banana", Item::new,
            new Item.Settings()
                    .maxCount(64).food(ModFoodComponents.CHOCOLATE_BANANA, ModFoodComponents.CHOCOLATE_BANANA_EFFECT));

    public static final Item AETHER_ESSENCE = registerItem("aether_essence", Item::new, new Item.Settings().maxCount(1));
    public static final Item ANCIENT_KING_SCEPTER = registerItem("ancient_king_scepter", Item::new, new Item.Settings().maxCount(1));
    public static final Item BLACK_PEARL = registerItem("black_pearl", Item::new, new Item.Settings().maxCount(16));
    public static final Item CORRUPTED_GRAIL = registerItem("corrupted_grail", Item::new, new Item.Settings().maxCount(1));
    public static final Item CORRUPTION_ORB = registerItem("corruption_orb", Item::new, new Item.Settings().maxCount(16));
    public static final Item CRYSTAL_PETAL = registerItem("crystal_petal", Item::new, new Item.Settings());
    public static final Item CURSED_CROWN = registerItem("cursed_crown", Item::new, new Item.Settings().maxCount(1));
    public static final Item DEEP_SEE_CRYSTAL = registerItem("deep_see_crystal", Item::new, new Item.Settings());
    public static final Item DESERT_ROSE = registerItem("desert_rose", Item::new, new Item.Settings());
    public static final Item EVIL_CODEX = registerItem("evil_codex", Item::new, new Item.Settings().maxCount(1));
    public static final Item FROZEN_GRAIL = registerItem("frozen_grail", Item::new, new Item.Settings().maxCount(1));
    public static final Item FROZEN_SKULL = registerItem("frozen_skull", Item::new, new Item.Settings());
    public static final Item GOLDEN_LANTERN = registerItem("golden_lantern", Item::new, new Item.Settings().maxCount(1));
    public static final Item MAGNIFICENT_CLAM_SHELL = registerItem("magnificent_clam_shell", Item::new, new Item.Settings());
    public static final Item MOLTEN_TABLET = registerItem("molten_tablet", Item::new, new Item.Settings());
    public static final Item MOSSY_TABLET = registerItem("mossy_tablet", Item::new, new Item.Settings());
    public static final Item PHARAOHS_MASK = registerItem("pharaohs_mask", Item::new, new Item.Settings().maxCount(1));
    public static final Item RED_URN = registerItem("red_urn", Item::new, new Item.Settings().maxCount(1));
    public static final Item ROTTEN_HEART = registerItem("rotten_heart", Item::new, new Item.Settings());
    public static final Item SACK_OF_MAGIC_DUST = registerItem("sack_of_magic_dust", Item::new, new Item.Settings().maxCount(16));
    public static final Item SHACKLES = registerItem("shackles", Item::new, new Item.Settings().maxCount(1));
    public static final Item SILVER_FEATHER = registerItem("silver_feather", Item::new, new Item.Settings());
    public static final Item SKELETAL_HAND = registerItem("skeletal_hand", Item::new, new Item.Settings());
    public static final Item STEEL_HEART = registerItem("steel_heart", Item::new, new Item.Settings());
    public static final Item STONE_IDOL = registerItem("stone_idol", Item::new, new Item.Settings().maxCount(1));
    public static final Item SUPERCOOLED_CORE = registerItem("supercooled_core", Item::new, new Item.Settings());
    public static final Item TOXIC_VIAL = registerItem("toxic_vial", Item::new, new Item.Settings().maxCount(1));
    public static final Item TRIBAL_TOTEM = registerItem("tribal_totem", Item::new, new Item.Settings().maxCount(1));
    public static final Item UNDEAD_ESSENCE = registerItem("undead_essence", Item::new, new Item.Settings());
    public static final Item UNHOLY_CANDLE = registerItem("unholy_candle", Item::new, new Item.Settings());
    public static final Item WARDEN_EARS = registerItem("warden_ears", Item::new, new Item.Settings());
    public static final Item WICKED_TENTACLE = registerItem("wicked_tentacle", Item::new, new Item.Settings());
    public static final Item WILDFIRE_ESSENCE = registerItem("wildfire_essence", Item::new, new Item.Settings().maxCount(1));
    public static final Item WITHER_RIBCAGE = registerItem("wither_ribcage", Item::new, new Item.Settings());



    public static Item registerItem(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DcdaeTools.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }
    public static void registerItems() {
        DcdaeTools.LOGGER.debug("Registering Mod Items for " + DcdaeTools.MOD_ID);

    }
}
