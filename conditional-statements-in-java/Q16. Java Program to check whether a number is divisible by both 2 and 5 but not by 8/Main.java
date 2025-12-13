import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0 && number % 5 == 0 && number % 8 != 0) {
            System.out.println(number + " is divisible by both 2 and 5 but not by 8.");
        } else {
            System.out.println(number + " does NOT satisfy the condition.");
        }
    }
}
