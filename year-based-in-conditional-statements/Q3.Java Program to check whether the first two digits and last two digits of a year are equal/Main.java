import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int firstTwoDigits = year / 100;   // Extract first two digits
        int lastTwoDigits = year % 100;    // Extract last two digits

        if (firstTwoDigits == lastTwoDigits) {
            System.out.println("The first two digits and last two digits are equal.");
        } else {
            System.out.println("The first two digits and last two digits are not equal.");
        }

        sc.close();
    }
}
