package src.main.java;

import java.lang.String;

public class NaturalNumber {
    public static void main(String[] args) {
        natnumber(10);
    }
    public static void natnumber(int n)
    {
        if(n==1) {
            System.out.println(n);
        }
        else{
            System.out.println(n);
            natnumber(n-1);
        }
    }
}
