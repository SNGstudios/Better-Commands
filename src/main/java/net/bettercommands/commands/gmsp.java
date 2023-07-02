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

public class gmsp implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("bcmd.gmsp")|| player.hasPermission("bcmd.*")){
            if(args.length == 0)
            {
                UUID uuid = player.getUniqueId();
                Player targetplayer = Bukkit.getPlayer(uuid);
                targetplayer.setGameMode(GameMode.SPECTATOR);
                sender.sendMessage("Your gamemode was set to spectator!");
            }
            else
            {
                player = Bukkit.getPlayer(args[0]);
                UUID uuid = player.getUniqueId();
                Player targetplayer = Bukkit.getPlayer(uuid);
                targetplayer.setGameMode(GameMode.SPECTATOR);
                sender.sendMessage(uuid, "Your gamemode was set to spectator!");
            }
            return true;
        }}
        return true;
    }
}