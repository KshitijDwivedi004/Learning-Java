class A{
    public void aa()
    throws Exception{
        bb();
    }
    
    public void bb()throws Exception
    {
        int a=10;
        int b=0;
        int result =a/b;
        System.out.println(result);
    }

}

public class ThrowsException {
    public static void main(String[] args) {
        A a= new A();
        try{

            a.bb();
        }
        catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}