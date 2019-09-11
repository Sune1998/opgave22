//løsning til opg 2.2
import java.util.Scanner;
public class Trekant {
    public static void main(String[] args) {
        System.out.println("intast længde");
        Scanner input = new Scanner(System.in);
        double længde = input.nextDouble();

        double areal = Math.sqrt(3) / 4 * Math.pow(længde,2);
        double volume = areal * længde;

        System.out.println("arealet er" + areal);
        System.out.println("volumen er" + volume);
    }
}
