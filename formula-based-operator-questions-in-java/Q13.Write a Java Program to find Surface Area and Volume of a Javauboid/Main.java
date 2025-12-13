import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double surfaceArea = 2 * (length * width + width * height + height * length);
        double volume = length * width * height;
        System.out.println("Surface Area of the Cuboid = " + surfaceArea);
        System.out.println("Volume of the Cuboid = " + volume);
    }
}
