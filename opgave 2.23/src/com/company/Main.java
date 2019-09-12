package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// læsning til opgave 2.23
        Scanner input = new Scanner(System.in);

        System.out.println("enter driving distance");
        double dd = input.nextDouble();

        System.out.println("enter miles pr gallon");
        double mpg = input.nextDouble();

        System.out.println("enter price pr gallon");
        double ppg = input.nextDouble();

        double cod = (dd / mpg * ppg);
        System.out.println("The cost of driving is" + cod);
        

    }
}
