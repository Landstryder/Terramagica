package com.landstryder.terramagica.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.runestone), " s ", "sss", "ss ", 's', new ItemStack(Blocks.stone));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RuneAltar), ModItems.runestone, Blocks.stone);
    }
}
