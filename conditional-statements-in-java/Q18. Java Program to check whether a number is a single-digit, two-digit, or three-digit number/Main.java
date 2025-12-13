import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int absNumber = Math.abs(number);
        if (absNumber >= 0 && absNumber <= 9) {
            System.out.println(number + " is a single-digit number.");
        } else if (absNumber >= 10 && absNumber <= 99) {
            System.out.println(number + " is a two-digit number.");
        } else if (absNumber >= 100 && absNumber <= 999) {
            System.out.println(number + " is a three-digit number.");
        } else {
            System.out.println(number + " is more than three digits.");
        }
    }
}
