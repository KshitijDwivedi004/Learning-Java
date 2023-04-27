import java.util.Scanner;

 class farmer {
    int pa;
    float TimeDuration;
    float ri;
    float si;
    void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the required amount : ");
        pa = sc.nextInt();
        System.out.println("please enter the Time Duration : ");
        TimeDuration=sc.nextFloat();
        ri=7.7f;
    }
    void compute(){
        si=(pa*ri*TimeDuration)/100f;
    }
    void display(){
        System.out.println("YOur loan amount is : "+ si);
    }
}
public class FarmerLoan {
    public static void main(String[] args) {
        farmer f1 =new farmer();
        f1.input();
        f1.compute();
        f1.display();

    }
}