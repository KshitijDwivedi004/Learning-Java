import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals =new Stack<>();
        animals.push("dog");
        animals.push("tiger");
        animals.push("Rhino");
        animals.push("zebra");

        System.out.println("stack : "+animals);
        animals.pop();
        System.out.println("stack : "+animals);
    }
    
}
