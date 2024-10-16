package Array;
import java.util.Scanner;

public class secLS {
    public  static  int SecLar(int a[]){
        int Lar=Integer.MIN_VALUE;
        int sec_lar=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>Lar){
                sec_lar=Lar;
                Lar=a[i];
            }
            else if(a[i]>sec_lar&&a[i]!=Lar){
                sec_lar=a[i];
            }
        }
        return sec_lar;
    }
    public  static int sec_sma(int a[]){
        int small=Integer.MAX_VALUE;
        int sec_small=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<small){
                sec_small=small;
                small=a[i];
            }
            else if(a[i]<sec_small&&a[i]!=small){
                sec_small=a[i];
            }
        }
        return sec_small;
    }
    public static void main(String[] args) {
        // WHEN ARRAY IS NOT SORT THEN WE USE TO HASHMAP
        // ELSE WE CAN USE THIS APPROCH
        Scanner sc=new Scanner(System.in);
        int a[]={3,1,6,5,7,7,2,1,3};
        int secL=SecLar(a);
        System.out.println("Second Largest Number is: "+secL);
        int secS=sec_sma(a);
        System.out.println("Second Smallest Number is: "+secS);
    }
}
