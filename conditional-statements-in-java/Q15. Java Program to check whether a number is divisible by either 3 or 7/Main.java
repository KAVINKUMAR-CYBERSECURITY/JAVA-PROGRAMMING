import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 3 == 0 || number % 7 == 0) {
            System.out.println(number + " is divisible by either 3 or 7.");
        } else {
            System.out.println(number + " is NOT divisible by 3 or 7.");
        }
    }
}
