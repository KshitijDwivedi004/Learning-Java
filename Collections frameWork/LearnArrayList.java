import java.util.*;
public class LearnArrayList {
    public static void main(String[] args) {
        
        List<Integer> List =new ArrayList<>();
        List.add(6);
        List.add(3);
        List.add(5); //O(n)
        List.add(6);
        System.out.println(List);
        List.add(34);
        //  add at index

        List.add(3, 50);// O(n)
        System.out.println(List);
        
        
        List<Integer> newList=new ArrayList<>();
        newList.add(44);
        newList.addAll(List);
        System.out.println(newList);
        
        // get the index
        System.out.println(List.get(1));
        
        List.remove(3);
        List.remove(Integer.valueOf(34));
        System.out.println(List);
        
        // clear the list
        List.clear();
        System.out.println(List);
        
        // to change the element
        newList.set(1, 85);  //O(1)
        System.out.println(newList);

        System.out.println(newList.contains(34));

        for(int i=0;i<newList.size();i++){
            System.out.println("the "+i+ " element is :"+newList.get(i));
        }


    }

}
