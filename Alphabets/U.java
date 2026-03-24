import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for:
                // 1. Left vertical line (j == 1 && i < n)
                // 2. Right vertical line (j == n && i < n)
                // 3. Bottom horizontal line (i == n)
                if ((j == 1 && i < n) || (j == n && i < n) || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
