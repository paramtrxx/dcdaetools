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

    public static final Item RUBY = registerItem("ruby", Item::new, new Item.Settings()
            .maxCount(64));

    public static final Item CHOCOLATE = registerItem("chocolate", Item::new, new Item.Settings()
            .maxCount(64)
            .food(ModFoodComponents.CHOCOLATE));

    public static final Item CHOCOLATE_BANANA = registerItem("chocolate_banana", Item::new,
            new Item.Settings()
                    .maxCount(64).food(ModFoodComponents.CHOCOLATE_BANANA, ModFoodComponents.CHOCOLATE_BANANA_EFFECT));


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
