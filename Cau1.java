import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so phan tu: ");
            n = sc.nextInt();
        } while (n < 1 || n > 50);

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                sum += a[i];
                count++;
            }
        }

        if (count == 0) {
            System.out.println("\nKhong co so nao chia het cho 3.");
        } else {
            double average = (double) sum / count;
            System.out.println("\nTrung binh cong cac so chia het cho 3: " + average);
        }

        sc.close();
    }
}
