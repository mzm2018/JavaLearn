package composition;

public class LivingRoom extends Room {

    private boolean hasTV;
    private boolean hasFurniture;
    private int rug;

    public LivingRoom( int length, int width, int height, int windows, int doors, boolean hasTV, boolean hasFurniture, int rug) {
        super("LivingRoom", length, width, height, windows, doors);
        this.hasTV = hasTV;
        this.hasFurniture = hasFurniture;
        this.rug = rug;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    public int getRug() {
        return rug;
    }
}
