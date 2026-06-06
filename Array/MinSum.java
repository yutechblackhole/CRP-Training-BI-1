public class MinSum{

    public static void main(String[]args){

        int[] arr ={1,2,1,0,1,1,0,3};
        int k = 4;
        int max = 0;
        int l = 0,sum = 0;

        for(int r= 0; r< arr.legnth; r++){

            sum += arr[r];

            while(sum>k){
                sum -= arr[l];
                l++;
            }

            if(sum<=k){
                 max = max < (r-l+1) ? r-l+1:max;
            }
                
            
        }
        System.out.println(max);

    }
}