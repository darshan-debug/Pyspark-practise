class vehicle{
    vehicle(){}
    void drive(){System.out.println("\nvehice: Drive");}
    void repair(){System.out.println("\nvehice: repair");}
}
//inheritance
class car extends vehicle{
    car(){}
    void drive(){System.out.println("\ncar: Drive");}
}
class encapsulate{
    private int a;
    private int b;
    encapsulate(){a=5;b=10;}
    void add(){System.out.println(a+b);}
    // polymorphism-method overloading
    void add(int x,int y){
        System.out.println(x+y);
    }
    void add(int x,int y,int z){
        System.out.println(x+y+z);
    }    
}

// class parent1{
//     parent1(){}
//     void call(){}
// }
// class parent2{
//     parent2(){}
//     void call(){}
// }
// class child extends parent1,parent2{
//     child(){}    
// }
public class test{
    public static void main(String args[]){
        System.out.println("\nhi world!");

        encapsulate obj=new encapsulate();
        obj.add();
        //int c=obj.a+obj.b; a,b are not accessible, due to accessibility settings after Encapsulation
        obj.add(1,2); // compile time  polymorphism-method overloading  - static binding
        obj.add(1,2,3); // polymorphism-method overloading

        //method over -riding  - runtime polymorphism -dynamic binding
        vehicle v1=new car();
        v1.drive(); // car::drive is called

        //inheritance:
        car c1=new car();
        c1.repair(); //obj of child class is isong method of super class

        //multiple inheritance not allowed in java
        // child childObj=new child();
        // childObj.call();

    }
}