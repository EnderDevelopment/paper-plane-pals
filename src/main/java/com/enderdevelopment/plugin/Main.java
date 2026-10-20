package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled");
        getCommand("start").setExecutor(new StartCommand());
        getCommand("throw").setExecutor(new ThrowCommand());
        getCommand("hatch").setExecutor(new HatchCommand());
        getCommand("pet").setExecutor(new PetCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled");
    }
}