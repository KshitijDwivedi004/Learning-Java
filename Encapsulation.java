class student{
    private int age;
    private String name;
    void setdata(){
        age = 10;
        name= "kshitij";
    }
    void show(){
        System.out.println(name+" "+age);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        student k = new student();
        k.setdata();
        k.show();
    }
}
