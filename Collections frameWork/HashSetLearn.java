import java.util.HashSet;
import java.util.LinkedHashSet;
// import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
public class HashSetLearn {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(43);
        set.add(38);
        set.add(12);
        // print in random order and unique  element
        System.out.println(set);

        //contain(digit)
        //isEmpty()
        //size()


        Set<Integer> set1=new LinkedHashSet<>();
        //it maintains order
        set1.add(34);
        set1.add(53);
        set1.add(35);
        set1.add(2);
        System.out.println(set1);

        //Binary set maintains sorted order
        Set<Integer> set2=new TreeSet<>();
        //it maintains  sorted order
        set2.add(34); //  O(1)
        set2.add(53);
        set2.add(35);
        set2.add(2);
        System.out.println(set2);



    }
}
