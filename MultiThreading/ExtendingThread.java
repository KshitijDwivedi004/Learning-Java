import java.util.Scanner;

class MyThread extends Thread
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
class Message extends Thread{
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
        System.out.println("your LUcky no. is :"+f);
        sc.close();
    }
}
public class ExtendingThread {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        Message t2= new Message();
        t1.start();
        t2.start();
        
    }
}
