import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Cau3 {
    public static int getDaysInMonth(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);

        try {
            YearMonth yearMonth = YearMonth.parse(input, formatter);
            return yearMonth.lengthOfMonth();
        } catch (DateTimeParseException | DateTimeException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang nam (MM/yyyy): ");
        String input = sc.nextLine();

        int days = getDaysInMonth(input);

        if (days == -1) {
            System.out.println("Dinh dang khong hop le.");
        } else {
            System.out.println("So ngay: " + days);
        }

        sc.close();
    }
}
