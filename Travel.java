import java.util.Locale;
import java.util.Scanner;

public class Travel {
    public static void main(String args[]) {
        double speed, distance, time;

        distance = askDistance();
        speed = askSpeed();
        time = countTime(distance, speed);

        System.out.println("Time needed to complete the trip is " + time + " hours.");
    }

    public static double askDistance() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.FRENCH);

        System.out.print("Type in the length of the trip (km): ");
        double distance = scanner.nextDouble();

        return distance;
    }

    public static double askSpeed() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.FRENCH);

        System.out.print("Type in the length of the trip (km): ");
        double speed = scanner.nextDouble();

        return speed;
    }

    public static double countTime(double distance, double speed) {

        double time = (double) distance / speed;

        return time;
    }

}
