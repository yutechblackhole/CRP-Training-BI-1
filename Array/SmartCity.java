
public class SmartCity{


    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);
        // // Find max sum of k consecutive elements in the array
        // System.out.println("Enter Array Lenght n");


        int[] arr = {4,8,15,3,10,12,5,9};
        int k = 3;
        int max = 0;
        int curr=0;
        for(int i=0; i<k; i++){
            curr += arr[i];
        }
        max = curr>max ? curr:max;
        for(int i = k; i<arr.length;i++){

            curr -= arr[i-k];
            curr += arr[i];        
            max = curr>max ? curr:max;
        }
        System.out.println(max);



        int[] arr = {4,5,7,3,6,1,2,8,9};
        int k = 2;
        int max = 0;
        int curr = 0;

        for(int i = 0; i<k; i++){
            
        }

    }
}