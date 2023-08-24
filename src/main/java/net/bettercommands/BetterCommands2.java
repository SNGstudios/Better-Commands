package net.bettercommands;

import net.bettercommands.commands.*;
import net.luckperms.api.node.types.PermissionNode;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class BetterCommands2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        super.onEnable();
        getCommand("BChelp").setExecutor(new helpforthis());
        getCommand("betterstop").setExecutor(new betterstop());
        getCommand("heal").setExecutor(new heal());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gma").setExecutor(new gma());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("fly").setExecutor(new fly());
        this.getLogger().log(Level.INFO, "Plugin Enabled :)");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
        this.getLogger().log(Level.INFO, "Plugin Disabled :(");
    }
}
