import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                // Left outer vertical line
                // Right outer vertical line
                if (j == 1 || j == (2 * n - 1)) {
                    System.out.print("*");
                }
                else if (i >= mid && //starts from middle row
                        (j == (n - i + 1) + (mid - 1) // Left inner diagonal 
                        || j == (n + i - 1) - (mid - 1) // Right inner diagonal
                        )) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}