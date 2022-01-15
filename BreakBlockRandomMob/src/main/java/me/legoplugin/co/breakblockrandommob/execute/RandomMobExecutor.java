package me.legoplugin.co.breakblockrandommob.execute;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.Objects;

public class RandomMobExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            World w = p.getWorld();

            w.spawnEntity(p.getLocation(), Objects.requireNonNull(EntityType.fromId((int) (Math.random() * 128))));

            p.sendMessage("Entity was spawned");
            return true;
        }else{
            System.out.println("\nyou are not player >:(\n");
            return false;
        }
    }
}
