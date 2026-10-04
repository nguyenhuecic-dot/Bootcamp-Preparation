import java.util.Scanner;

public class Cau2 {
    public static boolean isPerfectNumber(int n) {
        if (n <= 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong: ");
        int n = sc.nextInt();

        System.out.println(isPerfectNumber(n));

        sc.close();
    }
}
