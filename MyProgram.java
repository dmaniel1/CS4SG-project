import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.http.HttpRequest;
import java.net.URI;
//import java.net.http.HttpRequest.BodyPublishers;
//import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import java.io.IOException;
import java.lang.InterruptedException;
public class MyProgram {
    public static void main(String[] args) throws IOException, InterruptedException{
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
        while (contra < 57) {
            if (contra == 0) {
                roomList.add(new Room(202,'C',2,false));
            }
            if ((contra+204) % 2 == 0) {
                //even
                if ((contra+204) >= 206 && (contra+204) <= 212) {
                    roomList.add(new Room((contra+204),'D',2,false));
                }
                else if ((contra+204) >= 214 && (contra+204) <= 222) {
                    roomList.add(new Room((contra+204),'H',2,false));
                }
                else if ((contra+204) >= 224 && (contra+204) <= 234) {
                    roomList.add(new Room((contra+204),'Z',2,false));
                }
                else if ((contra+204) >= 236 && (contra+204) <= 240) {
                    roomList.add(new Room((contra+204),'H',2,false));
                }
                else if ((contra+204) >= 242 && (contra+204) <= 260) {
                    roomList.add(new Room((contra+204),'J',2,false));
                }
            }
            else {
                //odd
                if ((contra+204) >= 205 && (contra+204) <= 213) {
                    roomList.add(new Room((contra+204),'A',2,true));
                }
                else if ((contra+204) >= 215 && (contra+204) <= 225) {
                    roomList.add(new Room((contra+204),'O',2,true));
                }
                else if ((contra+204) >= 229 && (contra+204) <= 239) {
                    roomList.add(new Room((contra+204),'Z',2,true));
                }
                else if ((contra+204) >= 241 && (contra+204) <= 245) {
                    roomList.add(new Room((contra+204),'O',2,true));
                }
                else if ((contra+204) >= 247 && (contra+204) <= 253) {
                    roomList.add(new Room((contra+204),'M',2,true));
                }
                else if ((contra+204) >= 255 && (contra+204) <= 261) {
                    roomList.add(new Room((contra+204),'N',2,true));
                }
            }
            contra++;
        }
        contra = 0;
        //3rd floor
        while (contra < 59) {
            if ((contra+302) % 2 == 0) {
                //even
                if ((contra+302) >= 302 && (contra+302) <= 306) {
                    roomList.add(new Room((contra+302),'C',3,false));
                }
                else if ((contra+302) >= 308 && (contra+302) <= 312) {
                    roomList.add(new Room((contra+302),'D',3,false));
                }
                else if ((contra+302) >= 314 && (contra+302) <= 320) {
                    roomList.add(new Room((contra+302),'G',3,false));
                }
                else if ((contra+302) == 322) {
                    roomList.add(new Room(322,'H',3,false));
                }
                else if ((contra+302) >= 324 && (contra+302) <= 332) {
                    roomList.add(new Room((contra+302),'Z',3,false));
                }
                else if ((contra+302) >= 334 && (contra+302) <= 338) {
                    roomList.add(new Room((contra+302),'H',3,false));
                }
                else if ((contra+302) >= 340 && (contra+302) <= 360) {
                    roomList.add(new Room((contra+302),'J',3,false));
                }
            }
            else {
                //odd
                if ((contra+302) >= 303 && (contra+302) <= 307) {
                    roomList.add(new Room((contra+302),'B',3,true));
                }
                else if ((contra+302) >= 309 && (contra+302) <= 313) {
                    roomList.add(new Room((contra+302),'A',3,true));
                }
                else if ((contra+302) >= 315 && (contra+302) <= 327) {
                    roomList.add(new Room((contra+302),'O',3,true));
                }
                else if ((contra+302) >= 329 && (contra+302) <= 337) {
                    roomList.add(new Room((contra+302),'Z',3,true));
                }
                else if ((contra+302) >= 339 && (contra+302) <= 343) {
                    roomList.add(new Room((contra+302),'O',3,true));
                }
                else if ((contra+302) >= 345 && (contra+302) <= 353) {
                    roomList.add(new Room((contra+302),'M',3,true));
                }
                else if (contra == 58) {
                    roomList.add(new Room(361,'M',3,true));
                }
            }
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
        Scanner scorn = new Scanner(System.in);
        System.out.println("What's today's date? (YYYY-MM-DD)");
        String date = scorn.next();
        System.out.print("sdfs");
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://dateclock.p.rapidapi.com/time/day-of-week?date=" + date + "locale=en"))
		.header("x-rapidapi-key", "d990272e03msh12774ad406b455ap1297fajsn8c10e9208fe3")
		.header("x-rapidapi-host", "dateclock.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        Room[] roomArray = new Room[roomList.size()];
        roomArray = roomList.toArray(roomArray);
        System.out.println("Heya! What room are you closest to?");
        closestRoom = scorn.nextInt();
        System.out.println("Thanks! Now, what room do you want to get to?");
        destRoom = scorn.nextInt();
        scorn.close();
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
            else {
                System.out.println("Sorry, but the room you entered, " + closestRoom + ", is not on the map. This room will return incorrect information.");
                break;
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
            else {
                System.out.println("Sorry, but the room you entered, " + destRoom + ", is not on the map. This room will return incorrect information.");
                break;
            }
            gnarly++;
        }
        System.out.println("The room you are trying to get to is Room " + rn + ". This room is closest to Stair " + str + ". You are on floor " + flr + ", and you are on the " + oddstr + " side of the school.");
    }
}
