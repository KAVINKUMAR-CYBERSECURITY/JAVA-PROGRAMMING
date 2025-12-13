import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double surfaceArea = 6 * a * a;
        double volume = a * a * a;
        double perimeter = 12 * a;
        System.out.println("Surface Area of Cube = " + surfaceArea);
        System.out.println("Volume of Cube = " + volume);
        System.out.println("Perimeter of Cube = " + perimeter);
        sc.close();
    }
}
