// learning Synchronisation keyword
class Car implements Runnable{

// {   StringBuilder name= new StringBuilder();
    public void run(){
        try{

            System.out.println(Thread.currentThread().getName()+" arrived into the parking lot");
            Thread.sleep(1000);
            synchronized(this){
            System.out.println(Thread.currentThread().getName()+" Has got the into ");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" Has started driving the car ");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" Has got back to the parking lot  and parked the car! ");
            Thread.sleep(1000);
        }

        }catch(Exception e){}

    }
}
public class Synchronization  {
    public static void main(String[] args) {
        Car c1=new Car();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c1);
        t1.setName("Tangiro");
        t2.setName("Zenitsu");
        t3.setName("Insouke");
        t1.start();
        t2.start();
        t3.start();

        
    }
}
