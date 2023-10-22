package plugin.enemydown;

import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.enemydown.command.EnemyDownCommand;
import plugin.enemydown.command.EnemySpawnCommand;

public final class Main extends JavaPlugin  {
    @Override
    public void onEnable() {
        EnemyDownCommand enemyDownCommand = null;
        enemyDownCommand = new EnemyDownCommand(this);
        Bukkit.getPluginManager().registerEvents(enemyDownCommand, this);
        getCommand("enemyDown").setExecutor(enemyDownCommand);

        EnemySpawnCommand enemySpawnCommand = new EnemySpawnCommand();
        Bukkit.getPluginManager().registerEvents(enemySpawnCommand, this);
        getCommand("enemySpawn").setExecutor(enemySpawnCommand);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
