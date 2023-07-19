package cz.vmnetwork.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public class getip implements CommandExecutor
{

public boolean onCommand(@NotNull CommandSender sender, Command cmd, String label, String Args[])
    {
        if(sender.hasPermission("vmn.getip"))
        {
            if(sender instanceof Player)
            {
                String targ = Args[0];
                try
                {Player target = Bukkit.getServer().getPlayer(targ);
                    String IP = target.getServer().getIp();
                    String nick = target.getName();
                    sender.sendMessage(ChatColor.WHITE + "IP adresa hráče " + ChatColor.GOLD + targ + ChatColor.WHITE + " je: " + ChatColor.GOLD + IP);}
                catch (Exception e)
                {
                    throw e;
                }
                return true;
            }
            else
            {
                Bukkit.getLogger().log(Level.INFO, ChatColor.RED + "Tento příkaz může spustit pouze hráč");
                return false;
            }
        }
        else
        {
            if(sender instanceof Player)
            {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.RED + "Nemáš oprávnění tohle udělat!");
                return false;
    }
}
    return false;}}
