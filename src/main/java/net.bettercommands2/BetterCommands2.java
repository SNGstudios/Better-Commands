package net.bettercommands;

import net.bettercommands.commands.betterstop;
import net.bettercommands.commands.helpforthis;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class BetterCommands2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        super.onEnable();
        getCommand("BChelp").setExecutor(new helpforthis());
        getCommand("betterstop").setExecutor(new betterstop());
        this.getLogger().log(Level.INFO, "Plugin Enabled :)");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
        this.getLogger().log(Level.INFO, "Plugin Disabled :(");
    }
}
