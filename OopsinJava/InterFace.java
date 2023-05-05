interface student{
    void play();
    void study();
}
class tenTH implements student{
    String name;
    tenTH(String name){
        this.name=name;
    }
    public void play(){
        System.out.println(name+" is playing in the ground");

    }
    public void study(){
        System.out.println(name+" is studying in the class ");
    }
}
public class InterFace {
    public static void main(String[] args) {
        tenTH ryuk = new tenTH("ryuk");
        ryuk.play();
        ryuk.study();

    }
}
