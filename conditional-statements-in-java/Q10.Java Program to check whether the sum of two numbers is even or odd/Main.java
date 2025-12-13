import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        number = Math.abs(number);
        int smallestDigit = 9; 
        if (number == 0) {
            smallestDigit = 0; 
        } else {
            while (number > 0) {
                int digit = number % 10; 
                if (digit < smallestDigit) {
                    smallestDigit = digit; 
                }
                number /= 10; 
            }
        }
        
        System.out.println("The smallest digit is: " + smallestDigit);
    }
}
