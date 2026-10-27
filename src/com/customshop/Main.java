package com.customshop;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("MeraShop plugin enable ho gaya hai!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MeraShop plugin disable ho gaya.");
    }
}
