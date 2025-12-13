import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        double speed=s.nextDouble();
        double time=s.nextDouble();
        System.out.println("Distance: "+(speed*time)+" km");
    }
}
