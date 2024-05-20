package com.DBCsuper.dbcsuper;

import com.DBCsuper.dbcsuper.Item.ModItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
    }

    public void init(FMLInitializationEvent event) {
        // 其他初始化逻辑
    }

    public void postInit(FMLPostInitializationEvent event) {
        // 其他初始化逻辑
    }

    public void serverStarting(FMLServerStartingEvent event) {
        // 服务器启动逻辑
    }
}
