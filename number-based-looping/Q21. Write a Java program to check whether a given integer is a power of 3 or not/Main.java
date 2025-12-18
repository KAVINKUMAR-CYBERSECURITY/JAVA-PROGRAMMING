import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println(num + " is not a power of 3.");
        } else {
            while (num % 3 == 0) {
                num /= 3;
            }
            if (num == 1) {
                System.out.println("It is a power of 3.");
            } else {
                System.out.println("It is not a power of 3.");
            }
        }
    }
}
