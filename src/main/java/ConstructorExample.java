public class ConstructorExample {
    String name;
    int age;
    public ConstructorExample(String n, int a) {
        name = n;
        age = a;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        ConstructorExample s1 = new ConstructorExample("Hema", 25);
        ConstructorExample s2 = new ConstructorExample("Iniya", 26);
        s1.display();
        s2.display();
    }
}

