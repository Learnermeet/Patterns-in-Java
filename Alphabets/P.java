import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for:
                // 1. Left vertical line (j == 1)
                // 2. Top horizontal line (i == 1)
                // 3. Middle horizontal line (i == mid)
                // 4. Right vertical line in upper half (j == n && i < mid)
                if (j == 1 || i == 1 || i == mid || (j == n && i < mid)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
