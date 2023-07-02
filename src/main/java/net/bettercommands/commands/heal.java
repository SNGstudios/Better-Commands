package net.bettercommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

import java.util.UUID;

public class heal implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player)
        {
            if(args.length == 0)
                {
                    Player player = (Player) sender;
                    player.setHealth(20);
                    sender.sendMessage("Player was healed!");
        return  true;
                }
            }
            else
            {
                Player player = Bukkit.getPlayer(args[0]);
                UUID uuid = player.getUniqueId();
                player.setHealth(20);
                sender.sendMessage(uuid, "You have been healed!");
            }
        return  true;}
    }

