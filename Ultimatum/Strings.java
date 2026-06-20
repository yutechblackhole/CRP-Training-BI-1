import java.util.*;
public class Strings{
    // public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // String[] s = new String[size];

        // for(int i =0; i< size; i++){
        //     s[i]= sc.next();
        // }
        // for(int i =0; i< size; i++){
        //     System.out.print(s[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // String result ="";
        // String s =sc.next();
        // for(int i = 0; i<s.length(); i++){
        //     if(s.charAt(i) == 'e'){
        //         result +='i';
        //     }else{
        //         result += s.charAt(i);
        //     }
        // }
        // System.out.print(result);
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String name = "";

        for(int i = 0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                name += email.charAt(i);
            }
        }
            System.out.print(name);
    }
}