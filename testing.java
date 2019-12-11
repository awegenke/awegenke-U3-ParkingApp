import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class testing {

    public static void main(String args[]) {

        int user;
        int user3;
        ArrayList<Integer> ticketnumber = new ArrayList<Integer>();

        int specail = 20;
        int user2;
        int threehours = 0;
        int maxfee = 0;
        int fee = 0;
        int ticetlost = 0;
        int losttotal = ticetlost * 25;

        int checkin = 0;
        int user4;

        Vehicle tickets = new Vehicle();
        tickets.setTicketid(100);
        int i = tickets.getTicketid();

        CheckIn check = new CheckIn();




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

        int ticketfinalnumber = i - 1;
        int checktotals = (threehours * 5) + (amounttot) + (maxfee * 15);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");

        System.out.println("1 - Check/In");
        System.out.println("2 - Check/Out");
        System.out.println("3 - Close Garage");


        System.out.println("=>");
        user = keyboard.nextInt();

    while (user == 1) {
        System.out.println(" ");
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("1 - Check/In");
        System.out.println("2 - Check/Out");
        System.out.println("3 - Close Garage");
        System.out.println("=>");
        user = keyboard.nextInt();
        if (user == 1) {
            System.out.println("1 - ticket");
            System.out.println("2 - specail event");
            System.out.println("=>");
            user4 = keyboard.nextInt();
            if (user4 == 1) {
                System.out.println("Your ticket number is " + i);
            } else if (user4 == 2) {
                System.out.println("Specail Event");
                System.out.println("$" + specail + ".00");
            } else {
                System.out.println("error");
            }

        } else if (user == 2) {
            System.out.println("1 - Ticket");
            System.out.println("2 - Lost Ticket");
            System.out.println("=>");
            user3 = keyboard.nextInt();
            if (user3 == 1) {
                System.out.println("ticket number");
                System.out.println("=>");
                user2 = keyboard.nextInt() + 1;
                if (user2 == i) {
                    System.out.println("Checking Out");
                    System.out.println("Receipt for a vehicle id " + ticketfinalnumber);
                    System.out.println(hours + " hours parked " + ti + "am" + " - " + tim + "pm");
                    if (hours <= 3) {
                        System.out.println("$5.00");
                        threehours++;
                        checkin++;
                    } else if (hours >= 4 && hours < 14) {
                        System.out.println("$" + amounttot + ".00");
                        fee++;
                        checkin++;
                    } else {
                        System.out.println("$15.00");
                        maxfee++;
                        checkin++;
                    }
                }
            } else if (user3 == 2) {
                System.out.println("Lost Ticket");
                System.out.println("25.00");
                ticetlost++;
            } else if (user == 3) {
                System.out.println("Best Value Parking Garage");
                System.out.println("=========================");
                System.out.println("$" + checktotals + " was collected from " + checkin + " Check Ins");
                System.out.println("$" + losttotal + " was collected from " + ticetlost + " Lost Tickets");
                System.out.println("$" + overall + " was collected overall");
                System.exit(0);


            } else {
                System.out.println("error");
            }


        } else {
            System.out.println("error");
        }
        ticketnumber.add(i);
        i++;
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

