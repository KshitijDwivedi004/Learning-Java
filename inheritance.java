// package OopsinJava;
class Areoplane{
    public void takeoff(){
        System.out.println("Areoplane is taking off");

    }public void fly(){
        System.out.println("Areoplane if flying");
        
    }
}
class f5_AirCraft extends Areoplane{
    public void takeoff(){
        System.out.println("f5_AirCraft is taking off");

    }public void fly(){
        System.out.println("f5_AirCraft if flying");
        
    }
    }
class PassengerPlane extends Areoplane{
    public void takeoff(){
        System.out.println("PassengerPlane is taking off");

    }public void fly(){
        System.out.println("PassengerPlane if flying");
        
    }
}
class FighterPlane extends Areoplane{
    public void takeoff(){
        System.out.println("FighterPlane is taking off");

    }public void fly(){
        System.out.println("FighterPlane if flying");
        
    }
}
class AirPort{
    public void PrintAll(Areoplane add){
        add.takeoff();
        add.fly();
        System.out.println("------------------------->");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        f5_AirCraft ar = new f5_AirCraft();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        // System.out.println("------------------------------");
        // ar.takeoff();
        // ar.fly();
        
        // System.out.println("------------------------------");
        // pp.takeoff();
        // pp.fly();
        
        // System.out.println("------------------------------");
        // fp.takeoff();
        // fp.fly();
        System.out.println("------------------------------");
        AirPort ap =new AirPort();
        ap.PrintAll(ar);
        ap.PrintAll(pp);
        ap.PrintAll(fp);

    }
}
