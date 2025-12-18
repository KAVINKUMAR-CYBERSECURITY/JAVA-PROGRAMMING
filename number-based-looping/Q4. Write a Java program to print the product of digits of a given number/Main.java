import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 1;
        int temp = number;
        if (temp == 0) {
            product = 0;
        } else {
            while (temp != 0) {
                product = product * (temp % 10);
                temp = temp / 10;
            }
        }

        System.out.println("Product of digits of " + number + " is: " + product);
    }
}
