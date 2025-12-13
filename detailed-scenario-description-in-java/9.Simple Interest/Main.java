import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        double P=s.nextDouble();
        double R=s.nextDouble();
        double T=s.nextDouble();
        double SI = (P*R*T)/100;
        System.out.println("Simple Interest: "+SI);
    }
}
