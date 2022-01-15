package me.legoplugin.co.breakblockrandommob;

import me.legoplugin.co.breakblockrandommob.execute.RandomMobExecutor;
import me.legoplugin.co.breakblockrandommob.listen.BlockBreakingListener;
import me.legoplugin.co.breakblockrandommob.listen.PlayerMoveListener;
import me.legoplugin.co.breakblockrandommob.listen.ServerStopListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BreakBlockRandomMob extends JavaPlugin {

    @Override
    public void onEnable() {
        //stop server when player leaves

        getServer().getPluginManager().registerEvents(new ServerStopListener(),this);


        //Random Mob in break block

        //getServer().getPluginManager().registerEvents(new BlockBreakingListener(), this);
        getServer().getPluginCommand("spawn-random-mob").setExecutor(new RandomMobExecutor());


        //set line of sight blocks

        //getServer().getPluginManager().registerEvents(new PlayerMoveListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
