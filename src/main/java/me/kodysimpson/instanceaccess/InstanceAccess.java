package me.kodysimpson.instanceaccess;

import me.kodysimpson.instanceaccess.listeners.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class InstanceAccess extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new DeathListener(this), this);

    }

    @Override
    public void onDisable() {

    }
}
