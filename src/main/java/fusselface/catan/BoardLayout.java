package fusselface.catan;

import org.bukkit.Location;

import java.util.Vector;

public class BoardLayout {
    private Vector<TileObject> tiles = new Vector<>();

    public BoardLayout(GameSession gameSession) {
        for (int i = 0; i < 19; i++)
            tiles.add(new TileObject(gameSession, i));
    }

}
