package me.lbuddyboy.menu.listener;

import me.lbuddyboy.menu.example.MenuExample;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 * @author LBuddyBoy (lbuddyboy.me)
 * 30/06/2021 / 8:48 PM
 * MenuAPI / me.lbuddyboy.menu.listener
 */
public class ExampleListener implements Listener {

	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
		if (event.getMessage().contains("menuexample")) {
			new MenuExample().openMenu(event.getPlayer());
		}
	}

}
