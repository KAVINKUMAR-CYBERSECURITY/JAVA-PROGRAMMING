import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 100 || number > 999) {
            return;
        }
        int firstDigit = number / 100;
        if (firstDigit % 2 == 0) {
            System.out.println("The first digit " + firstDigit + " is even.");
        } else {
            System.out.println("The first digit " + firstDigit + " is odd.");
        }
    }
}
/*
sample input:888
o/p:first digit is even
*/