// import java.lang.reflect.Array;
import java.util.Arrays;

public class learnArrayClass {
    public static void main(String[] args) {
        int num[]={12,5,2,74,12,12,9,8,76,45,23,76};
        // int index=Arrays.binarySearch(num, 3);
        // System.out.println(index);
        Arrays.sort(num);

        for(Integer x:num){
            System.out.print(x+" ");
        }
        Arrays.fill(num, 10);
        System.out.println();
        for(Integer x:num){
            System.out.print(x+" ");
        }
    }
}
