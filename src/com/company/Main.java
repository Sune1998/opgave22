package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// løsning til opgave 2.2
        Scanner input = new Scanner(System.in);

        double area;
        double height;
        double side;

        System.out.println("enter the length");
        side = input.nextDouble();

        System.out.println("Enter the height");
        height = input.nextDouble();

        area = ((Math.sqrt(3) / 4) * (Math.pow(side, 2)));
        System.out.println("area is" + area);
        System.out.println("Volume of the triangle is" + area + height);
    }
}
