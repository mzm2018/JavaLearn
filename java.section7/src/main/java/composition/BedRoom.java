package composition;

public class BedRoom extends Room{
    private int beds;

    private int wardrobes;
    private int chairs;

    public BedRoom(int length, int width, int height, int windows, int doors, int beds, int wardrobes, int chairs) {
        super("BedRoom", length, width, height, windows, doors);
        this.beds = beds;
        this.wardrobes = wardrobes;
        this.chairs = chairs;
    }

    private int getBeds() {
        return beds;
    }

    public void sleepPeople() {
        System.out.println("BedRoom.sleepPeople= " + getBeds());
    }


    public int getWardrobes() {
        return wardrobes;
    }

    public int getChairs() {
        return chairs;
    }
}
