import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите число");
        int n = scanner.nextInt();
        int m = 7;
        if (n > m) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше или равно 7");
        }
    }
}
