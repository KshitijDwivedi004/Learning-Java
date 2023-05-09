class Queue{
    int v;
    boolean flag=false;
    synchronized public void put(int val){

        try{
            if(flag==true){
                wait();
            }
            else{
                this.v=val;
                System.out.println("put value "+v);
                flag=true;
                
                notify();
            }
        }catch(Exception e){}


    }
    synchronized public void get(){

        try{
            if(flag==false){
                wait();
            }
            else{
                System.out.println("get value "+v);
                flag=false;
                notify();
            }
        }catch(Exception e){}


    }
}
//  using Implements Runnable
class producer implements Runnable
// class producer extends Thread implements Runnable
{
    Queue q;
    int i=0;
    producer(Queue q){
        this.q=q;
    }
    public void run(){
        
        while(true){
            q.put(i++);
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println("Some proble !"+e);}
        }
    }

}
//  using Extends thread
class Consumer extends Thread
// class Consumer extends Thread implements Runnable
{
    Queue q;
    Consumer(Queue q){
        this.q=q;
    }

    public void run(){
        
        while(true){
            q.get();
            try{
                sleep(2000);
            }catch(Exception e){System.out.println("Some proble !"+e);}
        }
    }
}


public class ProducerConsumer {
    public static void main(String[] args) {
        Queue q =new Queue();
        producer p=new producer(q);
        Consumer c=new Consumer(q);
        Thread t1 =new Thread(p);
        Thread t2 =new Thread(c);
        t1.start();
        t2.start();

        
    }

    
}
