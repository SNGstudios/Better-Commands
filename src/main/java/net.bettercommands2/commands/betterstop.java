package net.bettercommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import java.io.Console;

public class betterstop implements CommandExecutor{
    public boolean onCommand(CommandSender sender,Command cmd, String label, String[] args) {
        Command.broadcastCommandMessage(sender, "Server will be stopped in 1 minute");
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Command.broadcastCommandMessage(sender, "Stopping the server..");
        Bukkit.shutdown();
        return true;
    }
}