package dcdae.dcdaetools.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public static final FoodComponent CHOCOLATE_BANANA = new FoodComponent.Builder().nutrition(7)
    .saturationModifier(2.5f).build();

    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder().nutrition(4)
            .saturationModifier(2.0f).build();

    public static final ConsumableComponent CHOCOLATE_BANANA_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200), 1.0f))
            .build();
}


