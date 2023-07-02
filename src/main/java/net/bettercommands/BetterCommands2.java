package net.bettercommands;

import jdk.tools.jimage.Main;
import net.bettercommands.commands.*;
import net.luckperms.api.node.types.PermissionNode;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import sun.security.krb5.Config;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.util.List;
import java.util.logging.Level;

public final class BetterCommands2 extends JavaPlugin {
    private String path;
    private String folderpath;
    private File file;

    @Override
    public void onEnable() {
        // Plugin startup logic
        super.onEnable();
        getCommand("BChelp").setExecutor(new helpforthis());
        FileConfiguration config = this.getConfig();
        saveDefaultConfig();
        config.addDefault("Spawnx" , "0");
        config.addDefault("Spawny" , "150");
        config.addDefault("Spawnz" , "0");
        String betenabled = config.getString("betenabled");

        getCommand("betterstop").setExecutor(new betterstop());
        getCommand("heal").setExecutor(new heal());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gma").setExecutor(new gma());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("fly").setExecutor(new fly());
        getCommand("diceroll").setExecutor(new diceroll());
        if(betenabled == "true"){
        getCommand("bet").setExecutor(new bet());}
        else {
            this.getLogger().log(Level.INFO, "Bet function disabled!");
        }
        this.getLogger().log(Level.INFO, "Plugin Enabled :)");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
        this.getLogger().log(Level.INFO, "Plugin Disabled :(");
    }
}
