class Student{

    private int rollno;              // Data members 
    private String name;            // Data members 
    private int age;            // Data members 
    private String course;          // Data members 


    int getRollno(){        //Getter
        return this.rollno;
    }

    void setRollno(int r){      //Setter
        this.rollno = r;
    }

    

    void setName(String n){         //Setter
        this.name = n;
    }
    String getName(){       //Getter
        return this.name;
    }

    int getAge(){       //Getter
        return this.age;
    }

    void setAge(int a){         //Setter
        this.age = a;
    }

    String getCourse(){         //Getter
        return this.course;
    }

    void setCourse(String s){       //Setter
        this.course = s;
    }
    void eat(){
        System.out.println("Eating");
    }

    void study(){
        System.out.println("Studying");
    }
    
}
public class Encaps{

    public static void main(String[]args){
        Student s1 = new Student();

        s1.setName = "Yash";

        System.out.println(s1.getName());
        

    }
}