// class student{
//     private String name;
//     private int age;
    // public student(){
    //     System.out.println("Default Constructor called");
    //     name="Kshitij"
    //     age=20;
    // }
    class calculator{
        int add(int a,int b){
            return a+b;
        }
        float add(int a, float b){
            return a+b;
        }
    }

public class MethodOverloading2 {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.add(12,123));
        
    }
}
