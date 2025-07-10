package dcdae.dcdaetools.item;

import dcdae.dcdaetools.DcdaeTools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item.Settings()
            .maxCount(64)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DcdaeTools.MOD_ID,"ruby"))));

    public static final Item CHOCOLATE = registerItem("chocolate", new Item.Settings()
            .maxCount(64)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DcdaeTools.MOD_ID,"chocolate")))
            .food(new FoodComponent.Builder()
                    .nutrition(4)
                    .saturationModifier(2.0f)
                    .build()));


    private static Item registerItem(String name, Item.Settings itemSettings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DcdaeTools.MOD_ID, name));
        Item item = new Item(itemSettings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void register() {
        DcdaeTools.LOGGER.debug("Registering Mod Items for " + DcdaeTools.MOD_ID);

    }
}
