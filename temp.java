import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double F = sc.nextDouble();

        double C = (F - 32) * 5 / 9;

        System.out.println(F + " F is equal to " + C + " C");

        sc.close();
    }
}