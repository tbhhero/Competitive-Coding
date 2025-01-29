import java.util.Scanner;

public class occurancecharinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            count = 0;
            for (int j = 0; j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " " + count);
        }
    }
}
