
public class Work3 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 78; i++) {
            if (i % 3 == 0)
                a++;
        }
        int mass[] = new int[a];
        int b = 0;
        for (int i = 1; i <= 78; i++) {
            if (i % 3 == 0) {
                mass[b] = i;
                System.out.print(mass[b] + " ");
                b++;
            }
        }
    }
}