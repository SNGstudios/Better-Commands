package net.bettercommands.commands;

import net.bettercommands.BetterCommands2;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class bet implements CommandExecutor {
    String commandenabled = "true";
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            if(sender.hasPermission("bcmd.bet") || sender.hasPermission("bcmd.*"))
            {
            if(args.length == 1)
            {
                int numberofitems = Integer.parseInt(args[0]);
                Player p = (Player) sender;
                boolean hasplayeritem = false;
                Random rnd = new Random();
                if (p.getInventory().contains(new ItemStack(Material.DIAMOND, numberofitems)))
                {
                    hasplayeritem = true;
                }
                if(hasplayeritem == true)
                    {
                        if(numberofitems >= 2)
                            {
                                if(numberofitems <= 32)
                                {
                                    p.getInventory().removeItem(new ItemStack(Material.DIAMOND, numberofitems));
                                    p.sendMessage(ChatColor.WHITE + "You have bet" + numberofitems + ChatColor.AQUA + " Diamonds!");
                                    p.sendMessage("Rolling...");
                                    int win = numberofitems * 2;
                                    int sum = rnd.nextInt(2);
                                    if(sum == 1)
                                    {
                                        p.sendMessage(ChatColor.GREEN + "You won");
                                        p.getInventory().addItem(new ItemStack(Material.DIAMOND, win));
                                        p.sendMessage(ChatColor.GREEN + "You got " + win + ChatColor.AQUA + "Diamonds!");
                                    }
                                    return true;
                                }
                                else
                                {
                                    p.sendMessage(ChatColor.RED + "Maximum amount to bet is 32!");
                                }
                            }
                        else
                            {
                                p.getInventory().removeItem(new ItemStack(Material.DIAMOND, 1));
                                p.sendMessage(ChatColor.WHITE + "You have bet 1" + ChatColor.AQUA + "Diamond!");
                                int sum = rnd.nextInt(2);
                                if(sum == 1)
                                {
                                    p.sendMessage(ChatColor.GREEN + "You won");
                                    p.getInventory().addItem(new ItemStack(Material.DIAMOND, 2));
                                    p.sendMessage(ChatColor.GREEN + "You got 2 " +  ChatColor.AQUA + "Diamond!");
                                }
                                return true;
                            }
                    }
                else
                {
                   p.sendMessage(ChatColor.RED + "You don't have enought items to bet!");
                   return false;
                }
            }
            else
            {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.RED + "This command must be supplied with number of bet items!");
                return false;
            }
        }
        else
        {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "This command is player only!");
            return false;
        }
        }
        else
        {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.RED + "You don't have permission to use this!");
        }
    return false; //Toto je pouze aby tu nebyl error
    }
}
