class Human{
    int age;
    private String Name;
    Human(){
        System.out.println("Human constructor called !");
    }
    void eat(){
        age=10;
        System.out.println("human eats thrice a day! ");
        System.out.println(age);
    }
}
class Students extends Human{
    int age;
    Students(){
        // super()  -> because of this Human() constructor is called :
        System.out.println("Student constructor called !!");
    }
    void eat(){
        age=20;

        System.out.println("Student eat thrice a day !");
        // System.out.println("your name is ;"+Name);
        System.out.println(age);
    }
}
public class inheritance {

    public static void main(String[] args) {
    Students raj =new Students();
    raj.eat();
    
    }
}
