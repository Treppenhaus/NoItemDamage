package eu.treppi.lunarsky.noitemdamage;

import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoItemDamagePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onItemDamage(EntityDamageEvent e) {
        if(e.getEntity() instanceof Item) {
            e.setCancelled(true);
        }
    }
}
