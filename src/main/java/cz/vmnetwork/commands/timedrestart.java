package cz.vmnetwork.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class timedrestart implements CommandExecutor {
    public boolean onCommand(@NotNull CommandSender sender, Command cmd, String label, String Args[])
    {
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 30 minut!");
        try {
            wait(900000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 15 minut!");
        try {
            wait(300000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 10 minut!");
        try {
            wait(300000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 5 minut!");
        try {
            wait(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 4 minuty!");
        try {
            wait(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 3 minuty!");
        try {
            wait(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 2 minuty!");
        try {
            wait(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 1 minutu!");
        try {
            wait(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 30 sekund!");
        try {
            wait(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 15 sekund!");
        try {
            wait(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 10 sekund!");
        try {
            wait(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 5 sekund!");
        try {
            wait(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 4 sekundy!"); try {
        wait(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 3 sekundy!");
        try {
            wait(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 2 sekundy!");
        try {
            wait(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Bukkit.broadcastMessage(ChatColor.GOLD + "Server bude vypnut za 1 sekundu!");
        Bukkit.shutdown();
        return true;
    }
}
