import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (n + 1) / 2; // handles both even & odd
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || // vertical sides
                    (i <= mid && j == i) || // left diagonal
                    (i <= mid && j == n - i + 1)) { // right diagonal   
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}