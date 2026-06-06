
public class Array2{
    public static void main(String[]args){

        int[] arr = new int []{33,2,56,8,23,75};
        int max = arr[0], smax = arr[0];
        int tmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax){
                smax = arr[i];
            }

            if(arr[i]<min){
                tmin = smin;
                smin = min;
                min = arr[i];
            }
            else if(arr[i]< smin){
                tmin = smin;
                smin = arr[i];
            }
            else if (arr[i]< tmin){
                tmin = arr[i];
            }


        }

        System.out.println(smax);
        System.out.println(tmin);

    }
}