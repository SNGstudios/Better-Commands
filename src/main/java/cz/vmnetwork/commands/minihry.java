package cz.vmnetwork.commands;

import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public class minihry implements CommandExecutor {
    public boolean onCommand(@NotNull CommandSender sender, Command cmd, String label, String Args[])
    {
        if(sender instanceof Player)
        {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.RED + "Minihry jsou stále ve vývoji!");
            return true;
        }
        else
        {
            Bukkit.getLogger().log(Level.INFO, ChatColor.RED + "Tento příkaz může použít pouze hráč!");
        }
        return true;
    }
}
