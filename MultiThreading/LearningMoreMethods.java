import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class totalEarning extends Thread{
    public int total=0;
    public  void run(){
      for(int i=0;i<10;i++){
          total+=8;
      }
    }
    }
public class LearningMoreMethods {

    public static void main(String[] args) { 
      totalEarning t1= new totalEarning();
      t1.start();
    //   try{

    //       t1.join();
    //     }catch(Exception e){System.out.println();}
    
      System.out.println("the total amount is "+t1.total);
        
    }
}
