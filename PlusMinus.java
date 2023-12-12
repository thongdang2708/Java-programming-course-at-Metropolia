import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cs;
        int no = sc.nextInt();
        cs = (no < 0) ? "nah" : "yeah";
        System.out.println(cs);
    }
}
