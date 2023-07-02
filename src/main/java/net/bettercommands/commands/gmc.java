package net.bettercommands.commands;
import jdk.javadoc.internal.tool.Start;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

import java.util.UUID;

public class gmc implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("bcmd.gmc")|| player.hasPermission("bcmd.*")){
            if(args.length == 0)
            {
                player = (Player) sender;
                UUID uuid = player.getUniqueId();
                Player targetplayer = Bukkit.getPlayer(uuid);
                targetplayer.setGameMode(GameMode.CREATIVE);
                sender.sendMessage("Your gamemode was set to creative!");
            }
            else
            {
                player = Bukkit.getPlayer(args[0]);
                UUID uuid = player.getUniqueId();
                Player targetplayer = Bukkit.getPlayer(uuid);
                targetplayer.setGameMode(GameMode.CREATIVE);
                sender.sendMessage(uuid, "Your gamemode was set to creative!");
            }
            return true;
        }}
        return true;
    }
}