package me.legoplugin.co.breakblockrandommob.listen;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;


import java.util.List;
import java.util.Random;

public class PlayerMoveListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Random random = new Random();
        Player p = event.getPlayer();
        Material ranBlock = null;
        List<Block> los = p.getLineOfSight(null, 75);
        for(int i=0; i<los.size(); i++) {
            if(los.get(i).getType() != Material.AIR){
                ranBlock = ranBlock.values()[random.nextInt(ranBlock.values().length)];
                if (ranBlock.isBlock()) {
                    los.get(i).setType(ranBlock);
                }

            }
        }
    }
}
