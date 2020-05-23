package composition;

public class House {
    private String type;
    private LivingRoom livingRoom;
    private BedRoom bedRoom;

    public House(String type, LivingRoom livingRoom, BedRoom bedRoom) {
        this.type = type;
        this.livingRoom = livingRoom;
        this.bedRoom = bedRoom;
    }

    public String getType() {
        return type;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }
}
