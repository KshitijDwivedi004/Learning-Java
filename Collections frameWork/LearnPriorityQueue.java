import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());

        //print in minimum priority
        pq.offer(53);
        pq.offer(11);
        pq.offer(52);
        pq.offer(34);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
