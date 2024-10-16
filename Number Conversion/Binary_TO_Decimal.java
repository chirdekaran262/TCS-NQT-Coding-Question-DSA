
import java.util.Scanner;

public class Binary_TO_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary to convert into Decimal: ");
        String b=sc.next();
        int p=0;
        int d=0;
        // WE CAN USE ALSO JAVA METHOD 
        // d=Integer.parseInt(b, 2)
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                d+=Math.pow(2, p);
            }
            p++;
        }
        System.out.println("Number in Decimal: "+d);
    }
}
