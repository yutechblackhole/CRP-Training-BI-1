
import java.util.*;
class Unit {

    public static void main(String[] args) {
        double units;
        double bill=50;//Fix charge 
        Scanner sc = new Scanner(System.in);
        units = sc.nextDouble();

        if(units<=100){
            bill += units * 1.5;
        }

        else if(units<=200){

            bill += 150 + (units-100)*2.5;
        }
        else{
            bill += 400 + (units-200)*5;
        }
        if(bill>2000){
            bill += bill*1.1;
        }
        System.out.println(bill);
        }
    }
