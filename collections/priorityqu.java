import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqu{
    public static void main(String[] args){
        Queue<String> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer("hello");
        pq.offer("How");
        pq.offer("You");
        pq.offer("Doing");
        pq.offer("Today");
        System.out.println(pq);

    }
}