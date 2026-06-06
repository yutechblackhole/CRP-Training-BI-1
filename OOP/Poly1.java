
public class Poly1{
    static int add(int a, int b){ // Method Overloading
        return a+b;
    }
    
    static double add(double a, double b){
        return a+b;
    }

    public static void main(String[]args){
        System.out.println(add(2,3));
        System.out.println(add(3.2,2.3));
    }
}