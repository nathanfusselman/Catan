package fusselface.catan;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.util.Vector;

public class GameSession {
    private long seed;
    private Location centerPoint;
    private Vector<Player> players = new Vector<>();
    private BoardLayout boardLayout;


    public GameSession(long seed, Location centerPoint) {
        this.seed = seed;
        this.centerPoint = centerPoint;
        this.boardLayout = new BoardLayout(this);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public Location getCenterPoint() {
        return centerPoint;
    }
}
