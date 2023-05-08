// package MultiThreading;

public class MT1 {
    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println();
        System.out.println("Before changing :");

        String s1=Thread.currentThread().getName();

            System.out.println("The name of current thread is :"+s1);

        int p1=Thread.currentThread().getPriority();

            System.out.println("The name of current thread is :"+p1);
            System.out.println();
            System.out.println("******************************");
        
        Thread t= Thread.currentThread();
            t.setName("Horizon");
            t.setPriority(7);

        System.out.println("after changing :"); 
        String s2=Thread.currentThread().getName();
        System.out.println("The name of current thread is :"+s2);
        int p2=Thread.currentThread().getPriority();
        System.out.println("The name of current thread is :"+p2);
        


    }
}
