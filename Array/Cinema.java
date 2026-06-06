public class Cinema{

    public static void main(String[] args){

        //Longest consecutive 0 in a seats row of 1 amd 0


        // int[] arr = {1,0,0,0,1,0,0};
        // int c = 0;
        // int max = 0;
        // for(int i =0; i<arr.length; i++){
        //     if(arr[i]==0){
        //         c += 1;
                
        //     }
        //     else{
        //         max = c>max ? c:max;
        //         c= 0;
        //     }
        // }
        // max = c>max ? c:max;
        // System.out.println(max);





        int[] arr = {1,0,0,0,1,0,0,1,0,0};
        int max = 0;
        int c = 0;

        for(int i = 0; i< arr.length;i++);{

            if(arr[i] == 0){
                 c ++;
                    }
        else{
            if(i>0 && arr[i-1] != 0){
                continue;
            }
            max = c>max ? c:max ;
            c = 0;
        }
        }
        max = c>max ? c:max ;
        System.out.println(max);

    }
    
}