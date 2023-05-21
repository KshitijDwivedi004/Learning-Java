import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorInterface{
    public static void main(String[] args) {
        Comparator<Integer> comp=new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10) return 1;
                else return -1;
            }
        };
        List<Integer> l=new ArrayList<>() ;
            l.add(45);
            l.add(62);
            l.add(78);
            l.add(86);
            Collections.sort(l,comp);
            System.out.println(l);
            

        
    }
}