import javax.xml.transform.Result;
class MyException extends Exception{

    public MyException(){};
    public MyException(String msg){
        super(msg);
     }

}
public class CustomExcp {
    public static void main(String[] args) {
        int a=10;
        int b=-5;
        int result=0;
        try{
            if(b<0){
                Exception me = new MyException("Entered a negative Number !");
                throw me;
            }
            else{
                result=a/b;
                
            }
        }
        catch(Exception e){
            System.out.println("Please enter Valid No. "+e);
        }
        System.out.println(result);
    }
}