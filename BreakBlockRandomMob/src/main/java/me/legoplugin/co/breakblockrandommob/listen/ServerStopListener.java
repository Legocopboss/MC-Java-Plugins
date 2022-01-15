package me.legoplugin.co.breakblockrandommob.listen;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;


import static org.bukkit.Bukkit.getServer;

public class ServerStopListener implements Listener {
    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event){
        getServer().dispatchCommand(getServer().getConsoleSender(), "stop");
    }
}
