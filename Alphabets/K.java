import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= mid; j++) {

                if (j == 1 ||                     // left vertical line
                    (i + j == mid + 1) ||         // upper diagonal
                    (i - j == mid - 1)) {         // lower diagonal
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}