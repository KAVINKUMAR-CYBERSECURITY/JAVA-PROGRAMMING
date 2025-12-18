import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int temp = number;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);
    }
}
