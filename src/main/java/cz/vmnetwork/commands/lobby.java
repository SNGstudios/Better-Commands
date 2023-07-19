package cz.vmnetwork.commands;

import net.kyori.adventure.text.BlockNBTComponent;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.jetbrains.annotations.NotNull;

public class lobby implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] Args) {
        if(sender instanceof Player)
        {
            Player p = (Player) sender;
            World world = Bukkit.getServer().getWorld("lobby");
            Location loc = new Location(world, 0, 100, 1);
            p.teleport(loc);
            sender.sendMessage(ChatColor.GREEN + "Byl jsi přenesen na lobby");
            return true;
        }
        else
        {
            Player p =(Player) sender;
            p.sendMessage(ChatColor.RED + "Tento příkaz může použít pouze hráč!");
        }
        return false;
    }
}
