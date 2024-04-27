package net.diahera.sandwichcraft.datagen;

import net.diahera.sandwichcraft.SandwichCraft;
import net.diahera.sandwichcraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {


    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SandwichCraft.MOD_ID, existingFileHelper);
    }

    @Override
    //LOOK HERE TO ADD ITEMS REQUIRED TO BREAK CERTAIN BLOCKS AND OTHER TAGS

    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.CRUST_BLOCK.get());
    }
}
