import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        int contra = 0;
        while (contra < 54) {
            contra++;
        }
        contra = 0;
        while (contra < 49) {
            contra++;
        }
        contra = 0;
        while (contra < 58) {
            contra++;
        }
        contra = 0;
        while (contra < 26) {
            int additive;
            if (contra == 0) {
                Room 400R = new Room(400,'C',4,false);
            }
            else if (contra == 1) {
                Room 402R = new Room(402,'C',4,false);
            }
            else if (contra == 2) {
                Room 403R = new Room(403,'B',4,true);
            }
            else {
                
            }
            contra++;
        }
        //while loop to set room values here
        String closestRoom;
        String destRoom;
        Room[] roomList;
        Scanner scn = new Scanner(System.in);
        System.out.println("Heya! What room are you closest to?");
        closestRoom = scn.nextInt();
        System.out.println("Thanks! Now, what room do you want to get to?");
        destRoom = scn.nextInt() + "R";
        int gnarly = 0;
        int rn;
        char str;
        int flr;
        boolean odd;
        String oddstr;
        while (gnarly < roomList.length) {
            if (Room[gnarly].getNumber() == closestRoom) {
                rn = Room[gnarly].getNumber();
                str = Room[gnarly].getStair();
                flr = room[gnarly].getFloor();
                odd = room[gnarly].getOOrE();
            }
            gnarly++;
        }
        if (odd) {
            oddstr = "odd";
        }
        else {
            oddstr = "even";
        }
        System.out.println("The room you are closest to is Room " + rn + ". This room is closest to Stair " + str + ". You are on floor " + flr + ", and you are on the " + oddstr + " side of the school.");
        gnarly = 0;
        while (gnarly < roomList.length) {
            if (Room[gnarly].getNumber() == destRoom) {
                rn = Room[gnarly].getNumber();
                str = Room[gnarly].getStair();
                flr = room[gnarly].getFloor();
                odd = room[gnarly].getOOrE();
            }
            gnarly++;
        }
        System.out.println("The room you are trying to get to is Room " + rn + ". This room is closest to Stair " + str + ". You are on floor " + flr + ", and you are on the " + oddstr + " side of the school.");
    }
}
