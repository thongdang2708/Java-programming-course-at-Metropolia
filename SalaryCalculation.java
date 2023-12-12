import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in the amount of work hours: ");
        double workHours = scanner.nextDouble();
        System.out.print("Type in the salary per hour: ");
        double salaryPerHour = scanner.nextDouble();
        System.out.print("Type in the tax percent: ");
        double tax = scanner.nextDouble();

        double salaryBeforeTaxes = (workHours * salaryPerHour);
        double taxTotal = (salaryBeforeTaxes * tax / 100);
        System.out.println("Salary before taxes: " + salaryBeforeTaxes);
        System.out.println("Amount of tax: " + taxTotal);
        System.out.println("Salary after taxes: " + (salaryBeforeTaxes - taxTotal));
    }
}
