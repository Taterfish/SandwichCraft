package net.diahera.sandwichcraft.datagen.loot;

import net.diahera.sandwichcraft.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    //this is responsible for the lootTable of the blocks we choose what drops here
    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CRUST_BLOCK.get());
        this.dropSelf(ModBlocks.SANDWICH_STATION.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
