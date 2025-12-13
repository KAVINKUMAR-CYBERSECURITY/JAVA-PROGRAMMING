import java.util.*;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        double p=s.nextDouble(),d=s.nextDouble();
        double da=p*d/100, fp=p-da;
        System.out.println("Discount Amount: "+da);
        System.out.println("Final Price: "+fp);
    }
}
