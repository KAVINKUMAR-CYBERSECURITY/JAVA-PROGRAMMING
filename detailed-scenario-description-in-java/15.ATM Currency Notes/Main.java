import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int amt=s.nextInt();
        int n2000 = amt / 2000;
        amt %= 2000;
        int n500 = amt / 500;
        amt %= 500;
        int n100 = amt / 100;
        System.out.println("₹2000 Notes: "+n2000);
        System.out.println("₹500 Notes: "+n500);
        System.out.println("₹100 Notes: "+n100);
    }
}
