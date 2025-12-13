import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        double basic=s.nextDouble();
        double hra=s.nextDouble();
        double allowance=s.nextDouble();
        System.out.println("Total Salary: "+(basic+hra+allowance));
    }
}
