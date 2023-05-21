import javax.lang.model.element.Name;

class variable{
    int a;
    String name="default";
    public static void main(String[] args) {
        // instance varialbe
        int number=64;
        variable obj1 =new variable();
        variable obj2 =new variable();
        obj1.a=12;
        obj1.name="kshitij";
        System.out.println(obj1.name);
        System.out.println(obj1.a);
        obj2.a=12;
        obj2.name="naman";
        System.out.println(obj2.name);
        System.out.println(obj2.a);
    }
}