package PYQ;

public class A {
    public static void main(String[] args) {
        String str="abbbaabbb";
        int n=5;
        int max=0,count=0;
        for(int i=0;i<str.length();i++){
            if(i%5==0){
                max=Math.max(max, count);
                count=0;
            }
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        max=Math.max(max, count);
        System.out.println("Maximum is: "+max);
    }
}
