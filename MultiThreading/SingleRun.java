import java.util.Scanner;

class MyThread extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        if(n=="calc"){
            calc();
        }
        else
            Message();
    }
    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter First no. :");
        int n1=sc.nextInt();
        System.out.println("please Enter Second no. :");
        int n2=sc.nextInt();
        System.out.println("the result is "+n1*n2);

    }
    public void Message(){
        System.out.println("Todays Imp Message is :");
        System.out.println("parents is avatar of God !");
    }
}
public class SingleRun {
    public static void main(String[] args) {
        System.out.println("In the Main Thread :");
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.setName("calc");
        t2.setName("message");

        t2.start();
        t1.start();
    }

   
}
