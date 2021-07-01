package me.lbuddyboy.menu.manager;

import lombok.Getter;
import me.lbuddyboy.menu.MenuAPI;
import me.lbuddyboy.menu.listener.MenuListener;
import me.lbuddyboy.menu.object.Menu;
import me.lbuddyboy.menu.util.ClassUtils;
import org.bukkit.Bukkit;

import java.util.HashSet;
import java.util.Set;


public class MenuManager {

	@Getter public Set<Menu> menus;

	public MenuManager() {
		Bukkit.getPluginManager().registerEvents(new MenuListener(), MenuAPI.getInstance());
		menus = new HashSet<>();
//		menus.add(new PartyInfoMenu());

		ClassUtils.getClassesInPackage(MenuAPI.getInstance(), "me.lbuddyboy.menu").forEach(clazz -> {
			if (Menu.class.isAssignableFrom(clazz)) {
				try {
					Menu menu = (Menu) clazz.newInstance();

					menus.add(menu);
				} catch (InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		});

	}

	public Menu byName(String name) {
		for (Menu m : menus) {
			if (m.name().equalsIgnoreCase(name)) {
				return m;
			}
		}
		return null;
	}

}
