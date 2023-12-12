import java.util.Scanner;

public class SalaryCountingWithMethods {

    public static void main(String[] args) {
        double hours, salaryPerHour, taxPercent, taxlessSalary, taxPart;

        hours = askHours();
        salaryPerHour = askSalaryPerHour();
        taxPercent = askTaxPercent();

        taxlessSalary = countTaxlessSalary(hours, salaryPerHour);

        taxPart = taxlessSalary * taxPercent / 100;

        System.out.println("\nSalary before taxes: " + taxlessSalary);
        System.out.println("Tax part of the salary: " + taxPart);
        System.out.println("Salary after taxes: " + (taxlessSalary - taxPart));
    }

    public static double askHours() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in the number of work hours: ");
        double hours = scanner.nextDouble();

        return hours;
    }

    public static double askSalaryPerHour() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in salary per hour: ");
        double salaryPerHour = scanner.nextDouble();

        return salaryPerHour;
    }

    public static double askTaxPercent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in tax percent: ");
        double taxPercent = scanner.nextDouble();

        return taxPercent;
    }

    public static double countTaxlessSalary(double hours, double salaryPerHour) {

        double taxlessSalary = (double) hours * salaryPerHour;

        return taxlessSalary;
    }

}