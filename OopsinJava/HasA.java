class car{
    private engine eng;
    public void rrr(engine eng){
        this.eng=eng;
    }
    public void start(){
        eng.engineStart();
    }

}
// dependency Enjection
class engine{
    public void engineStart(){
        System.out.println("Car has Started brooom! broooom!");
    }

}
public class HasA {
    public static void main(String[] args) {
        engine eg = new engine();
        car wv= new car();
        wv.rrr(eg);
        wv.start();

    }
    
}
