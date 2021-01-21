package fusselface.catan;

import org.bukkit.Location;

public class TileObject {
    private Location centerPoint;
    private int value;
    private TILETYPE type;

    public TileObject(GameSession gameSession, int num) {
        value = 0;
        type = TILETYPE.Desert;
        switch ()
        centerPoint = gameSession.getCenterPoint().add()
        buildTile();
    }

    private void buildTile() {
        switch (type) {
            case Fields:
                break;
            case Forest:
                break;
            case Pasture:
                break;
            case Mountains:
                break;
            case Hills:
                break;
            case Desert:
                break;
        }
    }
}
