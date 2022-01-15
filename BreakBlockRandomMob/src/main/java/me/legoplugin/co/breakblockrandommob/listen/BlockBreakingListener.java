package me.legoplugin.co.breakblockrandommob.listen;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Objects;

public class BlockBreakingListener implements Listener {

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        Player p = event.getPlayer();
        Block b = event.getBlock();

        World w = p.getWorld();

        int r = (int) (Math.random() * 128);

        while(EntityType.fromId(r) == null) {
            r = (int) (Math.random() * 128);
        }

        w.spawnEntity(b.getLocation(), EntityType.fromId(r));
        p.sendMessage("Entity Spawned on block break");
    }

}
