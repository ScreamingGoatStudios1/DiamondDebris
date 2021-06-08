package com.jake.diamondsdebris;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiamondsDebris extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new BreakListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
