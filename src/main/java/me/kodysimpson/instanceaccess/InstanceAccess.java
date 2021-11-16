package me.kodysimpson.instanceaccess;

import me.kodysimpson.instanceaccess.listeners.DeathListener;
import me.kodysimpson.instanceaccess.listeners.DeathListener2;
import org.bukkit.plugin.java.JavaPlugin;

public final class InstanceAccess extends JavaPlugin {

    private static InstanceAccess plugin;

    @Override
    public void onEnable() {

        plugin = this;

        getServer().getPluginManager().registerEvents(new DeathListener2(), this);
        getServer().getPluginManager().registerEvents(new DeathListener(this), this);

    }

    public static InstanceAccess getPlugin() {
        return plugin;
    }
}
