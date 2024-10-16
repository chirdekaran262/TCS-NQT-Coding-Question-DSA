
import java.util.Scanner;

public class sumAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Term Differnce and N term: ");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int s=(n/2)*((2*a)+((n+1)*d));
        System.out.println("Sum of AP is: "+s);
    }
}
