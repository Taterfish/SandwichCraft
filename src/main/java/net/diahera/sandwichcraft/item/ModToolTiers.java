package net.diahera.sandwichcraft.item;

import net.diahera.sandwichcraft.SandwichCraft;
import net.diahera.sandwichcraft.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier CRUST = TierSortingRegistry.registerTier(
            new ForgeTier(5,1000,6f,1f,40,
                    ModTags.Blocks.NEEDS_CRUST_TOOL,() -> Ingredient.of(ModItems.TOAST.get())),
            new ResourceLocation(SandwichCraft.MOD_ID, "crust"), List.of(Tiers.IRON),List.of());
}
