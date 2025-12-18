public class Main {
    public static void main(String[] args) {
        int n = 75342;
        n = Math.abs(n); 
        while (n >= 10) {
            n = n / 10;
        }
        if (n % 2 == 0) {
            System.out.println("First digit is Even");
        } else {
            System.out.println("First digit is Odd");
        }
    }
}
