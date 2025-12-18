public class Main {
    public static void main(String[] args) {
        int num = 505050;
        int digit = 5;
        int count = 0;
        String s = Integer.toString(Math.abs(num));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == digit) {
                count++;
            }
        }
        System.out.println("Occurrence: " + count);
    }
}
