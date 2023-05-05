import java.util.Scanner;

public class ExceptionSecond {
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        try{
             num=sc.nextInt();
             
        }
        // try with resources
        // try(Scanner scan = new Scanner(System.in)){
        // }
        catch(Exception e){
            System.out.println("enter Valid Number :");
        }finally{
            sc.close();
        }
        
        System.out.println(num);
    }
}
