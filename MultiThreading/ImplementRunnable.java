import java.util.Scanner;

class MyThread implements Runnable
{
    public void run(){
        System.out.println("MyThread is running :");
        System.out.println("Mythread is impoortant | ");
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt();
        System.out.println("It's Important like "+f);
        sc.close();
    }
    
}
class Message implements Runnable
{
    public void run(){
        System.out.println("Displaying imp message :");
        System.out.println("Prevension is better than cure !");
        //  Handling possible Exception 
        try{

            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println("something went wrong !!");
        }
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt();
        System.out.println("your Lucky no. is :"+f);
        sc.close();
    }
}
public class ImplementRunnable {
    public static void main(String[] args) {
        MyThread c1= new MyThread();
        Message c2= new Message();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
        
    }
}
