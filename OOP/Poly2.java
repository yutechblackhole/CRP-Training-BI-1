    class a{
    void display(){ // Method Overriding
        System.out.println("Display from a");
    }
    }

    class b extends a{
    void display(){ // Method Overriding
        super.display();
        System.out.println("Display from b");
    }
    }


public class Poly2{
    
    public static void main(String[]args){
        b bb = new b();
        bb.display();
    }
}