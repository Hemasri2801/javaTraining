import java.util.LinkedList;
import java.util.Scanner;

class Emp{
private int id;
private String name;

public Emp(int id, String name) {
    this.id = id;
    this.name = name;
}

public int getId() {
    return id;
}

public String getName() {
    return name;
}

@Override
public String toString() {
    return id + "-" + name;
}
}

public class LinkedlistExample {
    public static void main(String[] args){
        LinkedList<Emp> emplist=new LinkedList<>();
        emplist.add(new Emp(1,"hema"));
        emplist.add(new Emp(2,"iniya"));
        emplist.add(new Emp(45,"ritu"));

        System.out.println("Employee list:"+emplist);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employe id to remove:");
        int empremove= sc.nextInt();
        emplist.removeIf(emp -> emp.getId()==empremove);
        System.out.println("After removel:"+emplist);
        System.out.println("enter employee id to add" );
        int empid= sc.nextInt();
        System.out.println("enter employee name to add");
        String empname= sc.next();
        emplist.add(new Emp(empid,empname));
        System.out.println("After adding:"+emplist);


    }
}



