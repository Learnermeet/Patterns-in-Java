import java.util.Scanner;

public class Y {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for:
                // 1. Upper-left diagonal arm (i <= mid && j == i)
                // 2. Upper-right diagonal arm (i <= mid && j == n - i + 1)
                // 3. Lower vertical stem (i > mid && j == mid)
                if ((i <= mid && (j == i || j == n - i + 1)) ||
                    (i > mid && j == mid)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
