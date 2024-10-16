package PYQ;

public class LSB {
    public static void main(String[] args) {
        int d=10;
        String bin=Integer.toBinaryString(d);
        String bin2="";
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='0'){
                bin2=bin2+"1";
            }
            else{
                bin2=bin2+"0";
            }
        }
        d=Integer.parseInt(bin2,2);
        System.out.println("After right shiffting :"+d);
    }
}
