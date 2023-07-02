package net.bettercommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class diceroll implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            if(args.length == 0)
            {
                sender.sendMessage(ChatColor.AQUA +"Rolling six-sided dice!");
                    Random rnd = new Random();
                int random = rnd.nextInt(6);
                sender.sendMessage(ChatColor.GREEN + "You rolled six-sided dice!");
                sender.sendMessage(ChatColor.GREEN + "You rolled " + random);
            } else if (args.length == 1)
            {
                int numberofsides = Integer.parseInt(args[0]);
                sender.sendMessage(ChatColor.AQUA + "Rolling " + numberofsides + "-sided dice!");
                Random rnd = new Random();
                int random = rnd.nextInt(numberofsides);
                sender.sendMessage(ChatColor.GREEN + "You rolled " + numberofsides + "-sided dice!");
                sender.sendMessage(ChatColor.GREEN + "You rolled " + random);
            }
        }
        else
        {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "This command is player only!");
            return false;
        }
    return false; //Pouze aby to nemělo error :D
    }
}
