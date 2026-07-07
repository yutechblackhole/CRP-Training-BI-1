package Sorting;

public class Sort{
    public static void bubblesort(int[] arr){
        for(int turn=0; turn < arr.length-1;turn++){
            int swaps = 0;
            
            for(int j =0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    swaps ++;
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }

            }
            if(swaps==0){
                break;
            }
        }
    }
    public static void printArr(int[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String []args){
    int[] arr = {5,4,1,3,2};
    bubblesort(arr);
    printArr(arr);
    
}
}
