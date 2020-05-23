package composition;

public class Main {
    public static void main(String[] args) {

        BedRoom bedRoom = new BedRoom(4,4,5,1,1,2,1,0);
        LivingRoom livingRoom = new LivingRoom(5,5,6,1,1,true,true,1);
        House house = new House("semiDetach", livingRoom,bedRoom);

        house.getBedRoom().sleepPeople();

    }
}
