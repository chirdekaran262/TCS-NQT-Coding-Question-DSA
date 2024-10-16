
import java.util.Scanner;

public class octal_TO_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter octal Number: ");
        String o=sc.next();
        // USING JAVA METHOD 
        int d=Integer.parseInt(o,8);
        System.out.println("Decimal: "+d);

        System.out.print("Enter Decimal Number: ");
        int d1=sc.nextInt();
        // USING JAVA METHOD 
        String o1=Integer.toOctalString(d1);
        System.out.println("Decimal: "+o1);
    }
}
