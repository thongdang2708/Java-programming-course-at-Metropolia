import java.util.Scanner;

public class Interfaces {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the name of the soda: ");
        String name = reader.nextLine();

        System.out.print("Type in the volume of the bottle: ");
        double size = reader.nextDouble();

        SodaBottle soda = new SodaBottle(size, name);
        System.out.println(soda);
        soda.recycle();
    }
}

interface Recyclable {
    void recycle();
}

class Bottle {

    private double volumn;

    Bottle(double volumn) {
        this.volumn = volumn;
    }

    double returnVolumn() {
        return this.volumn;
    }
}

class SodaBottle extends Bottle implements Recyclable {

    private String name;

    SodaBottle(double volumn, String name) {
        super(volumn);
        this.name = name;
    }

    public void recycle() {
        System.out.println("Bottle returned for recycling.");
    }

    public String toString() {
        return this.name + ", " + super.returnVolumn() + " litres";
    }

}