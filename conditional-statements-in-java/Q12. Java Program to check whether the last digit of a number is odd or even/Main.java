import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int lastDigit = Math.abs(number % 10); 
        if (lastDigit % 2 == 0) {
            System.out.println("The last digit " + lastDigit + " is even.");
        } else {
            System.out.println("The last digit " + lastDigit + " is odd.");
        }
    }
}
