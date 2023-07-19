package cz.vmnetwork.commands;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class oneblock implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
         if(sender instanceof Player)
         {
             Player p = (Player) sender;
             p.sendMessage(ChatColor.RED + "Oneblock je stále ve vývoji!");
             return true;
         }
    return false;
    }
}
