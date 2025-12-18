public class Main {
    public static void main(String[] args) {
        int n = 45678;
        n = Math.abs(n); 
        while (n >= 10) {
            n = n / 10;
        }
        System.out.println("First digit: " + n);
    }
}
