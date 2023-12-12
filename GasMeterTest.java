import java.util.Scanner;

public class GasMeterTest {
    public static void main(String args[]) {
        int answer = 1;
        boolean valueCorrect = true;
        GasMeter meter = new GasMeter();

        while (valueCorrect) {
            Scanner reader = new Scanner(System.in);

            System.out.print("What do you want: 1=95, 2=98, 3=Diesel " +
                    "(type any other number to quit): ");
            answer = reader.nextInt();

            if (answer >= 1 && answer <= 3) {
                System.out.print("How much do you want to refuel: ");
                double amount = reader.nextDouble();
                meter.refuel(answer, amount);
            } else {
                valueCorrect = false;
            }
        }

        GasMeter.totalUsed();
        GasMeter.totalUsed95();
        GasMeter.totalUsed98();
        GasMeter.totalUsedDi();
    }
}

class GasMeter {
    private double octane95;
    private double octane98;
    private double diesel;
    private static double getOctane95;
    private static double getOctane98;
    private static double getDiesel;
    private static double total;

    void refuel(int answer, double amount) {

        if (answer == 1) {
            octane95 += amount;
            getOctane95 += amount;
        } else if (answer == 2) {
            octane98 += amount;
            getOctane98 += amount;
        } else if (answer == 3) {
            diesel += amount;
            getDiesel += amount;
        }
    }

    static void totalUsed() {

        total += getOctane95 + getOctane98 + getDiesel;
        System.out.println("Total used fuel: " + total);
    }

    static void totalUsed95() {
        System.out.println("Total used 95 octane fuel: " + getOctane95);
    }

    static void totalUsed98() {
        System.out.println("Total used 98 octane fuel: " + getOctane98);
    }

    static void totalUsedDi() {
        System.out.println("Total used diesel fuel: " + getDiesel);
    }

}