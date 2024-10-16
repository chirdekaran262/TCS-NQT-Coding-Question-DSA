

public class binTOoct {
    public static void main(String[] args) {
        String b="1100110";
        String oct="";
        int n=b.length();
        if(n%3==1){
            b="00"+b;
        }
        else if(n%3==1){
            b="0"+b;
        }
        for(int i=0;i<n;i+=3){
            int a=(b.charAt(i)-'0')*4+(b.charAt(i+1)-'0')*2+(b.charAt(i+2)-'0')*1;
            oct+=Integer.toString(a);
        }
        System.out.println("Octal Number: "+oct);
    }
}
