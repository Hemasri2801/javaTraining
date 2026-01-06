import java.util.ArrayList;
import java.util.Scanner;

public class CollectionPractice {
    ArrayList<Integer> mark = new ArrayList<>();

    public static void main(String[] args) {
        CollectionPractice cs = new CollectionPractice();
        cs.getmark();
        cs.displaymark();
        cs.totalmark();
    }

    public void getmark() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of subject:");
        int subject = sc.nextInt();
        System.out.println("Enter Marks:");
        for (int i = 1; i <= subject; i++) {
            System.out.println("Enter mark of Subject" + i + ":");
            int mar = sc.nextInt();
            mark.add(mar);
        }
    }
    public void displaymark() {
        System.out.println("Displaying marks:");
        for (int m : mark) {
            System.out.println(m);
        }
    }
    public void totalmark() {
        int total = 0;
        for (int m : mark) {
            total += m;
            }
        System.out.println("Total mark:"+total);
    }}

    //            int total=0;
    //            for(int m:mark){
    // //               System.out.println(m);
    //                total+=m;
    //            }
    ////            int total=0;
    ////            for(int m:mark){
    ////                total+=m;
    ////            }
    //            System.out.println("Total mark:"+total);



