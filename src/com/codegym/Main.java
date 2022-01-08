package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the width:");
        double width = input.nextDouble();
        System.out.println("Input the height:");
        double height = input.nextDouble();
        Rectangle recTangle = new Rectangle(width, height);
        System.out.println("Your rectangle:" + recTangle.disPlay());
        System.out.println("Rectangle's area is:" + recTangle.getArea());
        System.out.println("Rectangle's perimeter:" + recTangle.getPerimeter());
    }
}
