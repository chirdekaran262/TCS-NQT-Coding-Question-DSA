public class Factor {
    public static void fact(int d){
        for(int i=1;i<Math.sqrt(d);i++){
            if(d%i==0){
                if(d/i==i){
                    System.out.print(" "+i);
                }
                else{
                    System.out.println(" "+i+" "+d/i);
                }
            }
        }
    }
    public static void main(String[] args) {
        int d=12;
        System.out.print("Factor of "+d+" is ");
        fact(d);
    }
}
