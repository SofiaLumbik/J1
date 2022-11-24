import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();
        scanner.close();
        boolean negative = n < 0;
        if (negative) n *= -1;
        double result = 1;
        for (int i = 1; i <= n; i++) result *= x;
        if (negative) result = 1 / result;
        System.out.println(result);
    }
}