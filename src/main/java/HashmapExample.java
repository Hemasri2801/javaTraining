import java.util.*;

public class HashmapExample {
    HashMap<Integer,String> student=new HashMap<>();
    public static void main(String[] args){
        HashmapExample obj=new HashmapExample();
        obj.data();
    }
    public void data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int totstudent=sc.nextInt();
        for(int i=1;i<=totstudent;i++){
        System.out.println("Enter roll no:");
        int rollno=sc.nextInt();
        System.out.println("Enter name:");
        String name= sc.next();
        student.put(rollno,name);}
        System.out.println(student);

        System.out.println("enter student roll number to be removed:");
        int removeroll= sc.nextInt();
        student.remove(removeroll);
        System.out.println("after remove of student"+student);

        System.out.println("Enter student rollno to check:");
        int studentcheck= sc.nextInt();
        if(student.containsKey(studentcheck)){
            System.out.println("Student is there and is");
        }
        else {
            System.out.println("student not there");
        }

        System.out.println("Enter roll no to be added:");
        int addroll=sc.nextInt();
        System.out.println("Enter name to be added:");
        String addname=sc.next();

        student.put(addroll,addname);
        System.out.println("Added student:"+student);

        System.out.println("Student rool no:"+student.keySet());
        System.out.println("Student name:"+student.values());

        TreeMap<Integer,String> studentsort=new TreeMap<>(student);
        System.out.println("After sorting by roll no:"+studentsort);



    }
}
