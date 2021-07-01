package me.lbuddyboy.menu;

import lombok.Getter;
import me.lbuddyboy.menu.listener.ExampleListener;
import me.lbuddyboy.menu.manager.MenuManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author LBuddyBoy (lbuddyboy.me)
 * 30/06/2021 / 7:05 PM
 * MenuAPI / me.lbuddyboy.menu
 */
public class MenuAPI extends JavaPlugin {

	@Getter public static MenuAPI instance;
	@Getter public MenuManager menuManager;

	@Override
	public void onEnable() {
		instance = this;
		menuManager = new MenuManager();


		getServer().getPluginManager().registerEvents(new ExampleListener(), this);
	}
}
