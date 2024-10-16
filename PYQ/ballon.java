package PYQ;

public class ballon {
    public static void main(String[] args) {
        // String B[]={"a","b","b","b","c","c","c","a","f","c",};
        // HashMap<String,Integer> map=new HashMap<>();
        // for(int i=0;i<B.length;i++){
        //     map.put(B[i],map.getOrDefault(B[i],0)+1);
        // }
        // for(Entry<String, Integer> k:map.entrySet()){
        //     if(k.getValue()%2!=0 && k.getValue()>1){
        //         System.out.println("Odd Ballon sale "+k.getKey());
        //         return;
        //     }
        // }
        // for (Entry<String, Integer> en : map.entrySet()) {
           
        //     if( en.getValue()==1){
        //         System.out.println("Ballon "+en.getKey());
        //         return;
        //     }
            
        // }

        char[] c={'a','b','c','c','c'};
        int upper[]=new int[26];
        int lower[]=new int[26];
        for (int i = 0; i < c.length; i++) {
            if(c[i]>='A' && c[i]<='Z'){
                upper[c[i]-'A']++;
            }
            else if(c[i]>='a'&& c[i]<='z'){
                lower[c[i]-'a']++;
            }
        }
        boolean flag=false;
        char ch='\0';
        for (int i = 0; i < c.length; i++) {
            if(c[i]>='A'&& c[i]<='Z'){
                if(upper[c[i]-'a']%2!=0){
                ch=(char)(c[i]);
                flag=true;
                break;
            }
            }
            else if(c[i]>='a'&&c[i]<='z'){
                if(lower[c[i]-'a']%2!=0){
                ch=(char)(c[i]);
                flag=true;
                break;
                }
            }
        }
        if(flag==true){
            System.out.println("Odd is "+ch);
        }
        else{
            System.out.println("All Even");
        }
    }
}
