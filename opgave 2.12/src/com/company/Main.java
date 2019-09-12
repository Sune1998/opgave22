package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// løsning til opgave 2.12
        Scanner input = new Scanner(System.in);
        System.out.println("enter speed and acceleration");
        double v = input.nextDouble();
        long a = input.nextLong();

        double lenght = (Math.pow(v,2) / 2 *a);

        System.out.println("the minum length is" + lenght);





    }
}
