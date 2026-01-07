import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
    public static void main(String[] args) {
        HashSet<String> course=new HashSet<>();
        course.add("Java");
        course.add("python");
        course.add("c++");
        course.add("java");
        course.add("Java");
        System.out.println("Courses:"+course);

        course.remove("c++");
        System.out.println("After removal:"+course);
        System.out.println("Contains c++?"+course.contains("c++"));
        System.out.println("Is it empty:"+course.isEmpty());
        System.out.println("Total number of course:"+course.size());

        Iterator<String> itr= course.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }
    }
}
