package cz.vmnetwork.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public class survival implements CommandExecutor{
        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] Args) {
            if(sender instanceof Player)
            {
                Player p = (Player) sender;
                World world = Bukkit.getServer().getWorld("survival");
                Location loc = new Location(world, 80, 69, -16);
                p.teleport(loc);
                sender.sendMessage(ChatColor.GREEN + "Byl jsi přenesen na survival");
                return true;
            }
            else
            {
                Bukkit.getLogger().log(Level.WARNING, ChatColor.RED + "Tento příkaz může použít pouze hráč!");
            }
            return false;
        }
    }
