import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MyProgram {
    public static void main(String[] args) {
        int contra = 0;
        List<Room> roomList = new ArrayList<Room>();
        //1st floor
        while (contra < 53) {
            if ((contra+104) % 2 == 0) {
                //even
                if ((contra+104) >= 104 && (contra+104) <= 112) {
                    roomList.add(new Room((contra+104),'D',1,false));
                }
                else if ((contra+104) >= 114 && (contra+104) <= 120) {
                    roomList.add(new Room((contra+104),'G',1,false));
                }
                else if ((contra+104) >= 122 && (contra+104) <= 134) {
                    roomList.add(new Room((contra+104),'Z',1,false));
                }
                else if ((contra+104) >= 136 && (contra+104) <= 140) {
                    roomList.add(new Room((contra+104),'H',1,false));
                }
                else if ((contra+104) >= 144 && (contra+104) <= 154) {
                    roomList.add(new Room((contra+104),'J',1,false));
                }
            }
            else {
                //odd
                if ((contra+104) >= 107 && (contra+104) <= 113) {
                    roomList.add(new Room((contra+104), 'A', 1, true));
                }
                else if ((contra+104) >= 115 && (contra+104) <= 125) {
                    roomList.add(new Room((contra+104),'O',1,true));
                }
                else if ((contra+104) >= 127 && (contra+104) <= 149) {
                    roomList.add(new Room((contra+104),'Z',1,true));
                }
                else if ((contra+104) >= 141 && (contra+104) <= 145) {
                    roomList.add(new Room((contra+104),'O',1,true));
                }
                else if ((contra+104) >= 147 && (contra+104) <= 157) {
                    roomList.add(new Room((contra+104),'M',1,true));
                }
                else if (contra == 51) {
                    roomList.add(new Room(161,'M',1,true));
                }
                else if (contra == 52) {
                    roomList.add(new Room(199,'M',1,true));
                }
            }
            contra++;
        }
        contra = 0;
        //2nd floor
        while (contra < 49) {
            contra++;
        }
        contra = 0;
        //3rd floor
        while (contra < 58) {
            contra++;
        }
        contra = 0;
        //4th floor
        while (contra < 26) {
            if (contra == 0) {
                roomList.add(new Room(400,'C',4,false));
            }
            else if (contra == 1) {
                roomList.add(new Room(402,'C',4,false));
            }
            else if (contra == 2) {
                roomList.add(new Room(403,'B',4,true));
            }
            else {
                if ((contra+423) % 2 == 0) {
                    //even
                    if ((contra+423) >= 428 && (contra+423) <= 440) {
                        roomList.add(new Room((contra+426),'Z',4,false));
                    }
                    else if ((contra+423) == 442) {
                        roomList.add(new Room(442,'J',4,false));
                    }
                    else if ((contra+423) == 442) {
                        roomList.add(new Room(442,'J',4,false));
                    }
                }
                else {
                    //odd
                    if ((contra+423) >= 427 && (contra+423) <= 439) {
                        roomList.add(new Room((contra+426),'Z',4,true));
                    }
                    else if ((contra+423) >= 441 && (contra+423) <= 449) {
                        roomList.add(new Room((contra+426),'M',4,true));
                    }
                }
            }
            contra++;
        }
        int closestRoom;
        int destRoom;
        Room[] roomArray = new Room[roomList.size()];
        roomArray = roomList.toArray(roomArray);
        Scanner scn = new Scanner(System.in);
        System.out.println("Heya! What room are you closest to?");
        closestRoom = scn.nextInt();
        System.out.println("Thanks! Now, what room do you want to get to?");
        destRoom = scn.nextInt();
        scn.close();
        int gnarly = 0;
        int rn = 100;
        char str = 'Z';
        int flr = 1;
        boolean odd = false;
        String oddstr = "even";
        while (gnarly < roomArray.length) {
            if (roomArray[gnarly].getNumber() == closestRoom) {
                rn = roomArray[gnarly].getNumber();
                str = roomArray[gnarly].getStair();
                flr = roomArray[gnarly].getFloor();
                odd = roomArray[gnarly].getOOrE();
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
        while (gnarly < roomArray.length) {
            if (roomArray[gnarly].getNumber() == destRoom) {
                rn = roomArray[gnarly].getNumber();
                str = roomArray[gnarly].getStair();
                flr = roomArray[gnarly].getFloor();
                odd = roomArray[gnarly].getOOrE();
            }
            gnarly++;
        }
        System.out.println("The room you are trying to get to is Room " + rn + ". This room is closest to Stair " + str + ". You are on floor " + flr + ", and you are on the " + oddstr + " side of the school.");
    }
}
