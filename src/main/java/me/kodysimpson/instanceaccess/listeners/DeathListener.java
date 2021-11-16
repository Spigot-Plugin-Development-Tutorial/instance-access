package me.kodysimpson.instanceaccess.listeners;

import me.kodysimpson.instanceaccess.InstanceAccess;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

//1. static getter method to access plugin instance
//2. constructor injection(using a constructor)

public class DeathListener implements Listener {gi

    private final InstanceAccess instanceAccess;

    public DeathListener(InstanceAccess instanceAccess){
        this.instanceAccess = instanceAccess;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){



    }

}
