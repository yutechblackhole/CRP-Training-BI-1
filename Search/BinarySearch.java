public class BinarySearch{

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int key = 2;

        int l = 0, r = arr.length-1;

        while(l<=r){
            int mid = l+(r-1)/2;
            if(key==arr[mid]){
                System.out.println("Found");
                return;
            }
            else if(arr[mid]<key){
                l=mid+1;
                mid= l+(r-1)/2;
            }
            else if(arr[mid]>key){
                r=mid-1;
            }
        }
        System.out.println("Not Found");
    }
}