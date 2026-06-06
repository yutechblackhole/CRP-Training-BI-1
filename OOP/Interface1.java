interface a{
    void pay();
    default void display(){         //Non abstract
        System.out.println("Display from a");
    }
}

interface b{
    void pay();
    default void display(){         //Non abstract
        System.out.println("Display from b");
    }
}

class Upi implements a,b{
  public void display(){
    System.out.println("Display from UPI");
    a.super.display();
    b.super.display();
  }

  

  public void pay(){
        System.out.println("Payment done by upi");
  }  
}

public class Interface1{
    public static void main(String[]args){

        b user = new Upi();
        user.display();
    }
}