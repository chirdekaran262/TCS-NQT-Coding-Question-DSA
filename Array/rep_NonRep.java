package Array;
import java.util.Arrays;
import java.util.Scanner;

public class rep_NonRep {
    public static void main(String[] args) {
        // WHEN ARRAY IS NOT SORT THEN WE USE TO HASHMAP
        // ELSE WE CAN USE THIS APPROCH
        Scanner sc=new Scanner(System.in);
        int a[]={3,1,6,5,7,7,2,1,3};
        Arrays.sort(a);
        int max=a[a.length-1];
        int frq[]=new int[max+1];
        for(int i=0;i<a.length;i++){
            frq[a[i]]++;
        }
        System.out.print("Non Repeating Elemnet is: ");
        for(int i=0;i<frq.length;i++){
            if(frq[i]==1){
                System.out.println(i+" ");
            }
        }
        System.out.print("Repeating Elemnet is: ");
        for(int i=0;i<frq.length;i++){
            if(frq[i]>1){
                System.out.println(i+" ");
            }
        }
    }
}
