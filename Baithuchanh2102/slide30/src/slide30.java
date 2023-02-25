import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) throws Exception {
        int number, remainder;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen lon hon 0: ");
        number = scanner.nextInt();

        while (number <= 0) {
            System.out.println("So nhap vao phai lon hon 0: ");
            number = scanner.nextInt();
        }

        while (number > 0) {
            remainder = number % 10;
            sum += remainder;
            number /= 10;
        }

        System.out.println("Tong cac chu so la: " + sum);
    }
}