import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args){
        Queue<Integer> n1=new LinkedList<>();
        for(int i=0; i<6; i++){
            n1.offer(i);
        }
        n1.poll();
        System.out.println(n1);
        for(Integer k:n1){
            System.out.println(k);
        }
        System.out.println("Next element to be removed"+n1.peek());


    }
}
