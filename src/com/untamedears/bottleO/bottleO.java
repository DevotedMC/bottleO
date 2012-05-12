package com.untamedears.bottleO;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class bottleO extends JavaPlugin {
    public static Logger log;
    public EventListener listener;
    
	public void onEnable() {
		log = this.getLogger();
		
		listener = new EventListener();
		Bukkit.getPluginManager().registerEvents(listener, this);
		log.info("bottleO enabled!");
	}
	
	public void onDisable() {
		log.info("bottleO disabled!");
	}
}
