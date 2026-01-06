import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArraylistExample {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> employee=new ArrayList<>();
        employee.add("Miduna");
        employee.add("Hema");
        employee.add("Iniya");
        employee.add("Rithu");
        // if want to get value for employee with id- can use hashmap
        list.add(24);
        list.add(10);
        list.add(24);
        list.add(2);
        System.out.println("Before removing duplicate:"+list);
        Set<Integer> dup=new LinkedHashSet<>(list);
        list.clear();
        list.addAll(dup);
        System.out.println("After removing duplicate:"+list);

        list.remove(2);
        System.out.println("After Remove:"+list);

        list.set(1,77);
        System.out.println("Set:"+list);


        Collections.sort(list);
        System.out.println("Sorting:"+list);
        Collections.reverse(employee);
        System.out.println("reverse:"+employee);
        Collections.sort(employee);
        System.out.println("String sort"+employee);

        int maxi=Collections.max(list);
        System.out.println("Maximum:"+maxi);

//here we cant reverse only one employee name using index.
// we have to use get method and reverse the string and update the value using set

    }
}
