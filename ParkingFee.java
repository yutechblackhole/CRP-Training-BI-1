
import java.util.*;
class ParkingFee {

    public static void main(String[] args) {
        double hours;
        Scanner sc = new Scanner(System.in);
        double bill;
        hours = sc.nextDouble();
        if(hours<=2){
            bill = hours * 100;
        }
        else if(hours<=5){
            bill = 200 + (hours-2)*50;
        }
        else{
            bill = 200+150+(hours-5)*10;
        }
        System.out.println(bill);
    }
}