package net.diahera.sandwichcraft.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;

    public class ModFoods {
        public static final FoodProperties FRIED_EGG = new FoodProperties.Builder().nutrition(3)
                .saturationMod(0.4f).build();
        public static final FoodProperties CHICKEN_SANDWICH = new FoodProperties.Builder().nutrition(5)
                .saturationMod(0.5f).build();
    }


