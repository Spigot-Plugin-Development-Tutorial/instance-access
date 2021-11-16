package me.kodysimpson.instanceaccess.listeners;

import me.kodysimpson.instanceaccess.InstanceAccess;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener2 implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){

        InstanceAccess.getPlugin().getConfig().get("Ewewre");

    }

}
