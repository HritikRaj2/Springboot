import java.util.ArrayDeque;
public class arraydequeue {
    public static void main(String[] args){
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(67);
        ad.offer(56);
        ad.offer(61);
        ad.offer(14);
        ad.offerFirst(90);
        ad.offerLast(100);
        ad.peekLast();
        System.out.println(ad);
    }
}
