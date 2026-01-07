import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class QueueExample {
    public static void main(String[] args){
        Queue<String> data=new PriorityQueue<>();
        data.add("Hema");
        data.add("Iniya");
        data.add("Rithu");
        data.add("Gomathy");
        System.out.println("First element:"+data.element());
        System.out.println("peek returns head:"+data.peek());
        data.poll();
        System.out.println("after removing first element:"+data);
        System.out.println("Data contains Hema in it:"+data.contains("Hema"));
        data.offer("Kavi");
        System.out.println("After adding new data:"+data);

        TreeSet<String> sort=new TreeSet<>(data);
        System.out.println("Sorting data:"+sort);
        System.out.println("First element after soring:"+data.peek());



    }
}
