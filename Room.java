public class Room {
    private int number;
    private char nearestStairwell;
    private int floor;
    private boolean odd;
    public Room(int num, char stair, int curFloor, boolean o) {
        number = num;
        nearestStairwell = stair;
        floor = curFloor;
        odd = o;
    }
    public Room() {
        number = 0;
        nearestStairwell = 'n';
        floor = 0;
        odd = false;
    }
    public int getNumber() {
        return number;
    }
    public char getStair() {
        return nearestStairwell;
    }
    public int getFloor() {
        return floor;
    }
    public boolean getOOrE() {
        return odd;
    }
    public void updateFloor(int newFloor) {
        floor = newFloor;
    }
    public void updateStairs(char stairwa) {
        nearestStairwell = stairwa;
    }
}