class calc{
    int a;
    int b;
    public int add(int a,int b){
        int result=a+b;
        return result;
    };
    public float add(float a,float b){
        float result=a+b;
        return result;
    }
    public int add(int a,int b,int c){
        int result=a+b+c;
        return result;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        
        calc obj1 = new calc();
        int result= obj1.add(12,20);
        System.out.println(result);

        calc obj2 = new calc();
        int result2=obj2.add(12,34,65);
        System.out.println(result2);

        calc obj3 = new calc();
        float result3=obj3.add(1.2f,2.2f);
        System.out.println(result3);

    }


}
