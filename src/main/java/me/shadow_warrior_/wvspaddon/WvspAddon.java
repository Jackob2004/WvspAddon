package me.shadow_warrior_.wvspaddon;

import me.shadow_warrior_.wvspaddon.listeners.BlockBreakListener;
import me.shadow_warrior_.wvspaddon.listeners.BlockClickListener;
import me.shadow_warrior_.wvspaddon.listeners.PlayerDeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class WvspAddon extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(),this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(),this);
        getServer().getPluginManager().registerEvents(new BlockClickListener(),this);

    }


}
