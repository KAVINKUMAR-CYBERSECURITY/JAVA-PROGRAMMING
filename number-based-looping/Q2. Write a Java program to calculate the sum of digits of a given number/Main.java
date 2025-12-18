import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
