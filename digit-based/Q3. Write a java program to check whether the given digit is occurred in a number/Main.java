public class Main {
    public static void main(String[] args) {
        int num = 45678;
        int digit = 6;
        boolean found = false;
        num = Math.abs(num); 
        while (num > 0) {
            int lastDigit = num % 10;

            if (lastDigit == digit) {
                found = true;
                break;
            }
            num = num / 10;
        }

        if (found) {
            System.out.println("Digit is present in the number");
        } else {
            System.out.println("Digit is NOT present in the number");
        }
    }
}
