package PYQ;
import java.util.Scanner;

class chocolate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of packates: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the chocolate no in packates: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[j]=a[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            a[j]=0;
        }
        System.out.println("After zero to last: ");
        for (int i =0; i < n; i++) {
            System.out.print(" "+a[i]);
        }
    }
}