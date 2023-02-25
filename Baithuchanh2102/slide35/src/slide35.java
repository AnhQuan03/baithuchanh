import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a = ");
        a = scanner.nextInt();
        System.out.println("Nhap so b = ");
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("Hai so bang nhau");
        } else if (a > b) {
            System.out.println("So lon hon la: " + a);
        } else {
            System.out.println("So lon hon la: " + b);
        }
        ;
    }
}