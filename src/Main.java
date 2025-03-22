import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double r = s.nextDouble();
        double area =(22*r*r)/7;
        System.out.println("Area é: "+ area);

    }
}