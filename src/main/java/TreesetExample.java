import java.util.Collections;
import java.util.TreeSet;

public class TreesetExample {
    public static void main(String[] args){
        TreeSet<Integer> score=new TreeSet<>();
        score.add(450);
        score.add(600);
        score.add(870);
        score.add(460);
        score.add(340);
        System.out.println("score of student from last to first:"+score );
        System.out.println("score higher than 700:"+score.higher(700));
        System.out.println("Lowest score:"+score.first());
        System.out.println("highest score:"+score.last());
        if(score.higher(900) != null)
            System.out.println(score.higher(900));
        else
            System.out.println("No score is greater than 900");

        TreeSet<String> name=new TreeSet<>();
        name.add("hema");
        name.add("iniya");
        name.add("rithu");
        System.out.println("Ascending order:"+name);
        System.out.println("Decending order:"+name.descendingSet());


    }
}
