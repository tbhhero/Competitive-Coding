import java.util.Scanner;

public class perimetercircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Radius: ");
        int r = scanner.nextInt();
        int p=2*(22/7)*r;
        System.out.println("Perimeter of circle having radius"+r+" is "+p);
        scanner.close();
    }
}
