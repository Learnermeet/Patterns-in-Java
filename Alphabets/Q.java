import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for border of O shape:
                // 1. Top row (i == 1)
                // 2. Bottom row (i == n)
                // 3. Left column (j == 1)
                // 4. Right column (j == n)
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }
                // Tail of Q in lower-right area
                else if (i == j && i > n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
