package net.bettercommands.commands;

import com.sun.java_cup.internal.runtime.Symbol;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.Console;

public class betterstop implements CommandExecutor{
    public boolean onCommand(CommandSender sender,Command cmd, String label, String[] args) {
        if (sender instanceof Player)
        {
            Player p = (Player) sender;
            if(args.length == 0){
        Command.broadcastCommandMessage(sender, "Server will be stopped in 1 minute");
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Command.broadcastCommandMessage(sender, "Stopping the server..");
        Bukkit.shutdown();
        }
            else
            {
                String argumentstring = args[0];
                int timebeforestop = Integer.parseInt(args[0]);
                String timebeforestopstring = Integer.toString(timebeforestop);
                if(timebeforestop < 10000)
                {
                 Bukkit.broadcastMessage("You cant use number smaller than 10000!");
                }
                else if(timebeforestop == 60000)
                {
                    Bukkit.broadcastMessage("1 minute is already set!");
                }
                else
                {
                    Command.broadcastCommandMessage(sender, "Server will be shutted down in" + timebeforestopstring + " ms!");
                    try {
                        Thread.sleep(timebeforestop);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Bukkit.shutdown();
                }
            }
    return true;}
return false;
    }
    }
