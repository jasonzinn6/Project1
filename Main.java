package com.company;
import java.util.Scanner;
public class Main {
    Scanner scan = new Scanner(System.in);

    static int c_to_f(int n) {
        return n * 9/5 + 32;
    }

    public static void main(String[] args) {
        //Main
        System.out.println("100 degrees Celcius is " + c_to_f(100) + "Fahrenheit");

    }

}