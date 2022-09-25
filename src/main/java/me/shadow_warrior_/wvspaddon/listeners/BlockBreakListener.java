package me.shadow_warrior_.wvspaddon.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        int random = (int)(Math.random()* 2);
        Player player = e.getPlayer();
        if(player == null) return;
        if (e.getBlock().getType().equals(Material.ENCHANTMENT_TABLE)){
            if(random == 1) e.setCancelled(true);
        }
    }
}
