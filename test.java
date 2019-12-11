import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {




        ArrayList<Integer> ticketnumber = new ArrayList<Integer>();

        int i = 100;
        int threehours = 0;
        int maxfee = 0;
        int fee = 0;
        int ticetlost = 0;
        int losttotal = ticetlost * 25;
        int specail = 25;

        int checkin = 0;

        Vehicle v = new Vehicle();
       /*
       Vehicle.ticket ve = new Vehicle.ticket();
*/
        CheckIn check =  new CheckIn();

        String user2;


        String user;
        CheckIn t = new CheckIn();
        t.setStarttime(getrand(7,12));
        int ti = t.getStarttime();

        CheckOut e = new CheckOut();
        e.setEndtime(randend(13,23));
        int tim = e.getEndtime();

        int hours = tim - ti;
        int hourdiff = hours - 3;
        int amountdiff = hourdiff;
        int amounttot = amountdiff + 5;
        int overall = losttotal + amounttot;


        int checktotals = (threehours * 5) + (amounttot) + (maxfee * 15);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");

        System.out.println("1 - Check/In");
        System.out.println("2 - Check/Out");
        System.out.println("3 - Close Garage");


        System.out.println("=>");
        user = keyboard.nextLine();


        switch (user) {
            case "1":
                System.out.println(i);
                ticketnumber.add(i);
                i++;
                System.out.println(i);
                System.out.println(" ");
                System.out.println("Best Value Parking Garage");
                System.out.println("=========================");
                System.out.println("Your ticket number is " + i);
                System.out.println("1 - Check/Out");
                System.out.println("2 - Lost Ticket");
                System.out.println("=>");
                user2 = keyboard.nextLine();
                switch (user2) {
                    case "1":
                        System.out.println("checking out");
                        System.out.println("Receipt for a vehicle id " + i );
                        System.out.println(hours + " hours parked " + ti + "am" + " - " + tim + "pm");
                        if (hours <= 3){
                            System.out.println("$5.00");
                            threehours++;
                            checkin++;
                        }
                        else if (hours >= 4 && hours < 14){
                            System.out.println("$" + amounttot + ".00");
                            fee++;
                            checkin++;
                        }
                        else {
                            System.out.println("$15.00");
                            maxfee++;
                            checkin++;
                        }

                        break;
                    case "2":
                        System.out.println("Lost Ticket");
                        System.out.println("25.00");
                        ticetlost++;
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            case "2":
                System.out.println("Error");
                break;
            case "3":
                System.out.println("Best Value Parking Garage");
                System.out.println("=========================");
                System.out.println("$" + checktotals + " was collected from " + checkin + " Check Ins");
                System.out.println("$" + losttotal + " was collected from " + ticetlost + " Lost Tickets");
                System.out.println("$" + overall + " was collected overall");
                System.exit(0);
                break;
            default:
                System.out.println("Error");
        }



    }

    public static int getrand(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static int randend(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

    }

}