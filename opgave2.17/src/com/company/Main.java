package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// løsning til opgave 2.17
       Scanner input = new Scanner(System.in);

        System.out.println("enter the temperature in F");
       double ta = input.nextDouble();

        System.out.println("enter the wind speed >= 2");
        double v =input.nextDouble();
        double v2 = (Math.pow(v,0.16));

        double twc = (35.74 + 0.615 * ta - 35.75 * v2 + 0.4275 * ta * v2);
        System.out.println("The wind chill index is" + twc);
    }
}
