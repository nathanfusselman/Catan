package fusselface.catan;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.plugin.java.JavaPlugin;

enum TILETYPE {
    Fields, Forest, Pasture, Mountains, Hills, Desert;
}

public final class Catan extends JavaPlugin {

    GameSession gameSession;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Catan Plugin Loaded");
        if (!getServer().getWorlds().toString().contains("catan")) {
            WorldCreator wc = new WorldCreator("catan");

            wc.environment(World.Environment.NORMAL);
            wc.type(WorldType.FLAT);

            wc.createWorld();
        }
        gameSession = new GameSession(0, new Location(getServer().getWorld("catan"), 0, 72, 0));
        System.out.println("Created Catan Game");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Catan Plugin Un-Loaded");
    }
}
