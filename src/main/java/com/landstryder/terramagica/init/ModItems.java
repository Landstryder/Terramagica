package com.landstryder.terramagica.init;

import com.landstryder.terramagica.items.ItemRuneStone;
import com.landstryder.terramagica.items.itemTM;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final itemTM runestone = new ItemRuneStone();

    public static void init()
    {
        GameRegistry.registerItem(runestone, "RuneStone");
    }
}
