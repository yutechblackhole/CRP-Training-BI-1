import java.util.*;

public class PrefixSum{
    public static void main(String[] args){
        int[] arr = new int[]{3,-2,5,-1,2,-3,6,-2,4};
        int k = 7;
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i <arr.length; ++){
            sum = arr[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,getOrDefault(sum,0)+1);
            

        }
    }
}