import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество точек: ");
        int n = scanner.nextInt();
        System.out.print("Радиус окружности: ");
        int radius = scanner.nextInt();
        int count = 0;
        for (int points = 1; points <= n; points++) {
            if (inCircle(scanner, radius, points))
                count++;
        }
        System.out.println(count + " точек попали в окружность");
        scanner.close();
    }
    private static boolean inCircle(Scanner scanner, int radius, int points) {
        System.out.printf("X %d точки: ", points);
        double x = scanner.nextDouble();
        System.out.printf("Y %d точки: ", points);
        double y = scanner.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        return distance <= radius;
    }
}