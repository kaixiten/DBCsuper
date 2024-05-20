package com.DBCsuper.dbcsuper.Item;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {

    public static final ItemArmor.ArmorMaterial MY_ARMOR_MATERIAL = EnumHelper
        .addArmorMaterial("MY_ARMOR_MATERIAL", 25000, new int[] { 3, 50, 50, 50 }, 10);
}
