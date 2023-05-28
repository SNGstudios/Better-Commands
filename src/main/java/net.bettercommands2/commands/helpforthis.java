package net.bettercommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class helpforthis implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        sender.sendMessage("Current commands from BetterCMD2:");
        sender.sendMessage("/betterstop: Stop with announcement and 1 minute delay ");
        sender.sendMessage("/BChelp that command that you used right now");
        return  true;
    }}
