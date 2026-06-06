import java.util.*;

public class Rotate2{
    

    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp;
    int k =2;
    int[] arr = new int[n];
    for(int i = 0; i<n ; i++){
        arr[i]=sc.nextInt();
    }

    

    for(int i = 0; i<k; i++){
        temp = arr[n-1];
        for(int j = n-2 ; j>1; j--){
            arr[j+1]= arr[j];
        }
        arr[0]=temp;

    }
    for(int i = 0; i<n ; i++){
        System.out.print(arr[i]+" ");
    }
    
    }
}