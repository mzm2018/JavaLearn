package composition;

public class Room {
    private String name;
    private int length;
    private int width;
    private int height;
    private int doors;
    private int windows;

    public int getWindows() {
        return windows;
    }

    public Room(String name, int length, int width, int height, int windows , int doors) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.windows=windows;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public int getDoors() {
        return doors;
    }
}
