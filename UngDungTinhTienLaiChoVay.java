import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        double money;
        System.out.println("Nhập số tháng trả: ");
        month = scanner.nextInt();
        System.out.println("Nhập số tiền cần vay: ");
        money = scanner.nextDouble();

        double total = 0;
        for (int i = 0; i < month; i++) {
            total = money * (money / 100) / 12 * month;
        }

        System.out.println("Tổng: " + total);
    }
}

