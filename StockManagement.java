
import java.util.*;
class StockManagement {

    public static void main(String[] args) {
        int n;
        int stock;
        int min;
        int q = 0;
        int c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Products");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
        System.out.println("Enter current Stock of Product " + i);
        stock = sc.nextInt();

        System.out.println("Enter Minimum Stock");
        min = sc.nextInt();

        if(stock < min){
            
            q = min - stock;
            
            System.out.println("Restock Needed for product id: " + i + " add " + q + " units");
            c++;
        }
        else{
            System.out.println("No Restock Needed for product id: " + i);
        }
            
        
        }
        System.out.println("Totalt Products needed to Restock " + c );
    }
}