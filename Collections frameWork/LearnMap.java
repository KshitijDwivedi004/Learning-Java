import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> number=new HashMap<>();
        number.put("two", 2);
        number.put("one", 1);
        number.put("three", 3);
        System.out.println(number);
        for(Map.Entry<String,Integer>e:number.entrySet()){
            System.out.println(e);
        }
        for(Map.Entry<String,Integer>e:number.entrySet()){
            System.out.println(e.getKey());
        }
        for(String value:number.keySet()){
            System.out.println(value);
        }
        System.out.println(number.containsKey("two"));
        System.out.println(number.containsValue(7));




    }
}
