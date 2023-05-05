// package ExceptuionHandling;
class ExceptionFirst{
    public static void main(String[] args) {
        int num1=6;
        int num2=0;
        int value[]={3,5,2,3};
        int result=0;
        // String name="";
        try
        {
            //  result=num1/name.length();
             result = num1/num2;
        }
        catch(ArithmeticException ae){
            System.out.println("The Size of Name is Invalid !"+ae);
        }
        catch(ArrayIndexOutOfBoundsException are){
            System.out.println("Give the index under the limits !");
        }
        catch(Exception e){
            System.out.println("---something went wrong !---" + e);
        }

        System.out.println(result);
        System.out.println("Done");


    }
}