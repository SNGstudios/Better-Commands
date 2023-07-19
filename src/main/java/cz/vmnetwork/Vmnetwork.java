package cz.vmnetwork;

import cz.vmnetwork.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public final class Vmnetwork extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().log(Level.INFO, ChatColor.YELLOW + "Načítám plugin...");
        String ver = Bukkit.getBukkitVersion();
        this.getLogger().log(Level.INFO, ChatColor.WHITE + "Verze serveru: " + ver);
        getCommand("cleanchat").setExecutor(new cleanchat());
        getCommand("survival").setExecutor(new survival());
        getCommand("lobby").setExecutor(new lobby());
        getCommand("oneblock").setExecutor(new oneblock());
        getCommand("getip").setExecutor(new getip());
        getCommand("minihry").setExecutor(new minihry());
        getCommand("shutdownserver").setExecutor(new timedrestart());
        this.getLogger().log(Level.INFO, ChatColor.GREEN + "Plugin spuštěn!");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.getLogger().log(Level.INFO, ChatColor.RED + "Plugin vypnut!");
        // Plugin shutdown logic
    }
}
