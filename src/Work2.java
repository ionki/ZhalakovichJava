import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String str1 = scanner.next();
        String str2 = "Вячеслав";
        Comparison(str1, str2);
    }

    public static void Comparison(String n, String m) {
        if (n.equals(m)) {
            System.out.println("Привет Вячелав");
        } else {
            System.out.println("Такого имени нет");
        }
    }
}
