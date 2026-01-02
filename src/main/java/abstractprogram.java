package src.main.java;

public class abstractprogram {
        public static void main(String[] args) {
            car c=new car();
            c.start();
            bike b=new bike();
            b.start();

        }
    }
    abstract class vehicle{
        abstract void start();
    }
    class car extends vehicle{
        void start(){
            System.out.println("Car is started using pressing accelerating");
        }
    }
    class bike extends vehicle{
        void start(){
            System.out.println("Bike is started using kick");
        }
    }

