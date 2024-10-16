import java.util.Scanner;

public class Rotate {
    public static void RotatLeft(int a[],int k){
        int temp[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            temp[(i+(a.length-k))%a.length]=a[i];
        }
        System.arraycopy(temp, 0, a, 0, a.length);

    }
    public static void RotatRight(int b[],int k){
        int temp[]=new int[b.length];
        for(int i=0;i<b.length;i++){
            temp[(i+k)%b.length]=b[i];
        }
        System.arraycopy(temp, 0, b, 0, b.length);
    }
    public static void printArray(int c[]){
        for(int i=0;i<c.length;i++){
            System.out.print(" "+c[i]);
        }
    }
    public static void main(String[] args) {
        // WHEN ARRAY IS NOT SORT THEN WE USE TO HASHMAP
        // ELSE WE CAN USE THIS APPROCH
        Scanner sc=new Scanner(System.in);
        int a[]={3,1,6,5,7,7,2,1,3};
        int b[]={3,1,6,5,7,7,2,1,3};
        
        System.out.print("Enter the positon to rotate :");
        int k=sc.nextInt();
        System.out.println("Rotate Element in Left "+k+"position");
        printArray(a);
        System.out.println("\n");
        RotatLeft(a,k);
        printArray(a);
        System.out.println("\nRotate Element in Right "+k+"position");
        printArray(b);
        System.out.println("\n");
        RotatRight(b,k);
        printArray(b);

    }
}
