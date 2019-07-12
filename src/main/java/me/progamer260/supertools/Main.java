package me.progamer260.supertools;

import me.progamer260.supertools.commands.GuiCommand;
import me.progamer260.supertools.events.InventoryEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable () {
        getCommand("supertools").setExecutor(new GuiCommand());
        getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
    }

    @Override
    public void onDisable () {
        // Plugin shutdown logic
    }
}