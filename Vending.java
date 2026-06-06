
import java.util.*;
class Vending {

    public static void main(String[] args) {

        char s;
        int i;
        int bill =0;

        Scanner sc = new Scanner(System.in);
        While(True){
            System.out.println("Hello Welcome to Vending Corner");
            System.out.println("Select Tray Section");
            System.out.println("Enter Value \n 1. Snacks \n 2. Beverages \n 3. Choclates \n 0. Exit");
            i = sc.nextInt();

                    switch(i){
                        case 1:
                            System.out.println("Enter Item value \n Snacks Tray \n a. Lays 200 Rs. \n b. Chrunchex 100 Rs.\n c. Doritos 50 Rs.");
                            s = sc.nextChar();
                            switch (s){
                                case a:
                                    System.out.println("Brought Lays");
                                    

                            }
                    }   
        }
        
    }
}