import java.util.*;
public class Distinct{

    public static void main(String[]args){
        // Max k distinct charectors substring length

        String s = "aabcbabad";
        int k = 2;
        int l = 0;
        int max = 0;
        HashMap<Charecter,Integer> map = new HasMap<>();
    
        //insert update count delte the elements

        for(int r=0; r<s.length(); r++){
            char curr = s.charAt(r);
            map.put(curr,map.getOrdDefault(curr,0)+1);

            while(map.size()>k){
                if(map.get(s.charAt(l))==1){
                    map.remove(s.charAt(l));
                }
                else{
                    map.put(s.chartAt(l),map.get(s.charAt(l))-1);
                }
                l++;
            }
            if(map.size()<=k){
                max = max  \< (r-l+1) ? r-l+1:max;
            }
        }
        if(map.size()<=k){
                max = max < (r-l+1) ? r-l+1:max;
            }
        System.out.println(max);

        


    }
}