import java.util.*;

public class Array1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [5];
        int max = 0;
        int largest = 0;


        for(int i =0; i <=4; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }

        for(int i =0; i <=4; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
        }

        System.out.println(max);

    }
}