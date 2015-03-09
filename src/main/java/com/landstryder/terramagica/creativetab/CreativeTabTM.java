package com.landstryder.terramagica.creativetab;

import com.landstryder.terramagica.init.ModItems;
import com.landstryder.terramagica.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM
{
    public static final CreativeTabs TM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.runestone;
        }
    };
}
