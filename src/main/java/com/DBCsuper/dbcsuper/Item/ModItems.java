package com.DBCsuper.dbcsuper.Item;

import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item myChestplate;
    public static Item myLeggings;
    public static Item myBoots;

    public static void init() {
        myChestplate = new superArmor(ModMaterials.MY_ARMOR_MATERIAL, 0, 1).setUnlocalizedName("superChestplate");
        myLeggings = new superArmor(ModMaterials.MY_ARMOR_MATERIAL, 0, 2).setUnlocalizedName("superLeggings");
        myBoots = new superArmor(ModMaterials.MY_ARMOR_MATERIAL, 0, 3).setUnlocalizedName("superBoots");

        GameRegistry.registerItem(myChestplate, "superChestplate");
        GameRegistry.registerItem(myLeggings, "superLeggings");
        GameRegistry.registerItem(myBoots, "superBoots");
    }
}
