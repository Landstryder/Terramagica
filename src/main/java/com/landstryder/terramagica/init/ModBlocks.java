package com.landstryder.terramagica.init;

import com.landstryder.terramagica.blocks.BlockRuneAltar;
import com.landstryder.terramagica.blocks.BlockTM;
import com.landstryder.terramagica.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTM RuneAltar = new BlockRuneAltar();
    public static void init()
    {
        GameRegistry.registerBlock(RuneAltar, "RuneAltar");
    }
}
