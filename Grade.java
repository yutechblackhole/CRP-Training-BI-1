
import java.util.*;
class Grade {

    public static void main(String[] args) {
        int sub;
        int marks;
        double weight;
        double wtavg = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Subjects");
        sub = sc.nextInt();

        for(int i=1; i<=sub; i++){
        System.out.println("Enter Marks of subject " + i);
        marks = sc.nextInt();

        System.out.println("Enter Weight of subject (0 to 1) " + i);
        weight = sc.nextDouble();

        wtavg += marks*weight;
        
        }
        if(wtavg>90){
            System.out.println("Grade A");
        }
        else if(wtavg>80){
            System.out.println("Grade B");
        }
        else if(wtavg>70){
            System.out.println("Grade C");
        }
        else if(wtavg>60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }

        System.out.println("Weighted Average: " + wtavg );
    }
}