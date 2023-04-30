class student{
    private int age;
    private String name;
    void setdata(String name,int age){
        this.age = 10;
        this.name= "kshitij";
    }
    void show(){
        System.out.println(name+" "+age);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        student k = new student();
        student p = new student();
        // k.setdata();
        // k.show();
        p.setdata("pranav",19);
        p.show();
    }
}