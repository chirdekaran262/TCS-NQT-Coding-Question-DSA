package PYQ;

public class sentanceMax {
    public static void main(String[] args) {
        String sent="Knowledge is the greatest gift";
        int max=Integer.MIN_VALUE;
        String[] a=sent.split(" ");
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i].length());
        }
        // int temp=0;
        // String res="";
        // String r="";
        // for(int i=0;i<sent.length();i++){
        //     if(sent.charAt(i)!=' '){
        //         temp++;
        //         res=res+sent.charAt(i);
        //     }
        //     else{
        //         if(temp>max){
        //             max=temp;
        //             temp=0;
        //             r=res;
        //             res="";
        //         }
        //     }
        // }
        System.out.println("Longest word length "+max);
    }
}
