import java.util.Scanner;

class TravelComputationInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, fromCity, viaCity, toCity;

        System.out.print("Enter name: ");
        name = input.nextLine();

        System.out.print("Enter from city: ");
        fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        viaCity = input.nextLine();

        System.out.print("Enter destination city: ");
        toCity = input.nextLine();

        double distance1, distance2;

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + ": ");
        distance1 = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + ": ");
        distance2 = input.nextDouble();

        int time1, time2;

        System.out.print("Enter time (minutes) from " + fromCity + " to " + viaCity + ": ");
        time1 = input.nextInt();

        System.out.print("Enter time (minutes) from " + viaCity + " to " + toCity + ": ");
        time2 = input.nextInt();

        double totalDistance = distance1 + distance2;
        int totalTime = time1 + time2;

        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");

        input.close();
    }
}