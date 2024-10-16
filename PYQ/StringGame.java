package PYQ;

import java.util.Scanner;

public class StringGame {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Main String: ");
    String c=sc.nextLine();
    System.out.print("Enter the target string: ");
    String a=sc.nextLine();
    String res="";

   
    for(int i=0;i<c.length();i++){
        for(int j=0;j<a.length();j++){
            if(c.charAt(i)==a.charAt(j)){
                c=c.replace(c.charAt(i)+"","");
                }
            }
            
        }
    System.out.println("Result String: "+c);
    }
}