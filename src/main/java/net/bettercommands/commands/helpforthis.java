package net.bettercommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class helpforthis implements CommandExecutor {
    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player p = (Player) sender;
        if(p.hasPermission("bcmd.help") || p.hasPermission("bcmd.*")){
        sender.sendMessage("Current commands from BetterCMD2:");
        sender.sendMessage("/betterstop: Stop with announcement and 1 minute delay or if argument supplied in that time");
        sender.sendMessage("/BChelp that command that you used right now");
        sender.sendMessage("/gms: Sets your gamemode or another player's to survival");
        sender.sendMessage("/gmc: Sets your gamemode or another player's to creative");
        sender.sendMessage("/gma: Sets your gamemode or another player's to adventure");
        sender.sendMessage("/gmsp: Sets your gamemode or another player's to spectator");
        return  true;
    }return true;}}
