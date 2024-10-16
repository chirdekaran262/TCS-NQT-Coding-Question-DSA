import java.util.HashMap;

class Sysmmetic{
    public static void main(String[] args) {
        int a[][]={{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

        HashMap<Integer,Integer> map=new HashMap<>();
        int k=0;
        while(k<a.length){
            int first=a[k][0];
            int second=a[k][1];
            if(map.get(second)!=null && map.get(second)==first){
                System.out.println("("+first+","+second+")");
            }
            else{
                map.put(first, second);
            }
            k++;
        }
    }
}