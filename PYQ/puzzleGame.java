package PYQ;

import java.util.Scanner;

public class puzzleGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int r=n%8;
        if(r==0){
            System.out.println(2);
        }
        else if(r<5){
            System.out.println(r);
        }
        else{
            System.out.println(10-r);
        }
    }
}
