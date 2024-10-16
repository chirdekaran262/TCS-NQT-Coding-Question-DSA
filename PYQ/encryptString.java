package PYQ;

public class encryptString {
    public static void main(String[] args) {
        String massage="word";
        String encrypt="";
        for(char c:massage.toCharArray()){
            if(c<'v'){
                char d=(char)(c+5);
                encrypt=encrypt+d;
            }
            else{
                char d=(char)(c-'v'+'a');
                encrypt=encrypt+d;
            }
        }
        System.out.println("Encrypt String is: "+encrypt);
    }
}
