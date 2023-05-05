interface Car{
    void drive(int speed);
}
interface Car2{
    int Speed(int speed);
}
public class Lambda {
    public static void main(String[] args) {
        // every time new class is created for new obj for anomanous inner class
                Car obj= new Car() {
                    public void drive(int speed){
                        System.out.println("driving vrooom1 vrooom! with speed "+speed);
                    }

                };
                obj.drive(120);
        

        //  returning
        Car2 obj2=(i)->i;
        System.out.println(obj2.Speed(96));

    }
}
