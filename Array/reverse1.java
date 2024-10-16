package Array;
public class reverse1 {
    public static void main(String[] args) {

        String str="i.like.this.program.very.much";
        String[] str2=str.split("\\.");
        String result="";
        for(int i=0;i<str2.length;i++){
            if(i==str2.length-1){
                result=str2[i]+result;
                break;
            }
            result="."+str2[i]+result;
        }
        System.out.println(result);
    }
}
