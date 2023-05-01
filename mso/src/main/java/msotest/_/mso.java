package msotest._;

import org.bukkit.plugin.java.JavaPlugin;

public final class mso extends JavaPlugin {






    @Override
    public void onEnable() {
        getCommand("rabbits").setExecutor(new rabbits1());



        // Plugin startup logic

    }

    @Override
    public void onDisable(){
        // Plugin shutdown logic
    }
}