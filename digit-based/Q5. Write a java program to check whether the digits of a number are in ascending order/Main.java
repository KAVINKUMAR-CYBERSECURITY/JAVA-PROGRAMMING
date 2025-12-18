import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());
        sc.close();
        int prev = 10;
        boolean ascending = true;
        while (num > 0) {
            int digit = num % 10;
            if (digit > prev) { ascending = false; break; }
            prev = digit;
            num /= 10;
        }

        System.out.println(ascending ? "Digits are ascending" : "Digits are NOT ascending");
    }
}
