import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum != 0 && num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is not a Harshad Number.");
        }
    }
}
