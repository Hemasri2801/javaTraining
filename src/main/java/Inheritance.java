package src.main.java;

import java.lang.String;

public class Inheritance {
        int legs = 4;
        public void eat() {
            System.out.println("animal can eat");
        }
        public void walk() {
            System.out.println("animal can walk");
        }}

    class dog extends Inheritance {
        void bark() {
            System.out.println("dog can bark and also walk");
        }
    }
    class call {
        public static void main(String[] args) {
            dog obj=new dog();
            System.out.println(obj.legs);
            obj.bark();
            obj.eat();
            obj.walk();}
    }


