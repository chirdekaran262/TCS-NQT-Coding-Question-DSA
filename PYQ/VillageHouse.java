package PYQ;

public class VillageHouse {
    public static void main(String[] args) {
        int N=5;
        int voltage=15;
        int count=0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(voltage==i*j){
                    count++;
                }
            }
        }
        if(count>1){
            System.out.println("Voltage matches by house is: "+count);
        }
        else{
            System.out.println("NO POWER");
        }
    }
}
