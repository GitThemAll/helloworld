package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //changed
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
    }
}
