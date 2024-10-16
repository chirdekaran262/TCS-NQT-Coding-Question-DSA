import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number to check is armstrong or not: ");
        int num=sc.nextInt();
        int n=num;
        int k=String.valueOf(n).length();
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=Math.pow(temp, k);
            n=n/10;
        }
        if(num==sum)
            System.out.print(num+" is armstrong number");
        
        else
            System.out.print(num+" is not armstrong number");
    }
}
