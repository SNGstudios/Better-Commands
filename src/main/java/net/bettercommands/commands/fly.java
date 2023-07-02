package net.bettercommands.commands;
import jdk.javadoc.internal.tool.Start;
import net.luckperms.api.node.Node;
import net.luckperms.api.node.types.PermissionNode;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

import java.util.UUID;

public class fly implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            Player player = (Player) sender;
            boolean enabledfly = player.getAllowFlight();
            if(player.hasPermission("bcmd.fly") || player.hasPermission("bcmd.*")){
            if(args.length == 0)
            {
                if(enabledfly == false)
                {
        player.setAllowFlight(true);
        player.sendMessage("Fly have been enabled!");
        Bukkit.getConsoleSender().sendMessage("Player" + player.toString() + "have enabled fly!");
       return true;
                }
                else
                {
                    player.setAllowFlight(false);
                    player.sendMessage("Fly have been disabled!");
                    Bukkit.getConsoleSender().sendMessage("Player " + player.toString() + "have disabled fly!");
                }
            }
        }
        }
        else
        {
            Bukkit.getConsoleSender().sendMessage("This command is user-only!");
        }
    return false;
    }
}