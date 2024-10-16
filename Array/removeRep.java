package Array;
import java.util.Arrays;
import java.util.Scanner;

public class removeRep {
    public static void main(String[] args) {
        // WHEN ARRAY IS NOT SORT THEN WE USE TO HASHMAP
        // ELSE WE CAN USE THIS APPROCH
        Scanner sc=new Scanner(System.in);
        int a[]={3,1,6,5,7,7,2,1,3};
        Arrays.sort(a);
        int k=0;
        for(int j=1;j<a.length;j++){
            if(a[k]!=a[j]){
                k++;
                a[k]=a[j];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
