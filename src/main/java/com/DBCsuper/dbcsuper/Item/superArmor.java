package com.DBCsuper.dbcsuper.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

public class superArmor extends ItemArmor {

    public superArmor(ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
