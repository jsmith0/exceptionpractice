package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        IOException e = new IOException();

        System.out.println("Enter a number");
        Scanner kb = new Scanner(System.in);

        try{
            int i = kb.nextInt();
            System.out.println("Your number is: " + i);
        }
        catch (InputMismatchException w){
            InputMismatchException q = new InputMismatchException("I said numbers!");
            throw q;
        }
    }
}
