import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        String result = isPositive ? "positive" : (isNegative ? "negative" : "zero");
        System.out.println(number + " is " + result + ".");
    }
}
