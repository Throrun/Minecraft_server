package myfirstplugin.myfirstplugin;

import myfirstplugin.myfirstplugin.magmacube_login_system.LoginSystem;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("My first plugin WORK");
        String global_password = "test";
        getCommand("login").setExecutor(new Login());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("My first plugin get shut down");
    }
}
