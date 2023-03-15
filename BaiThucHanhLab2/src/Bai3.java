import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap vao nam sinh: ");
        year = scanner.nextInt();

        age = 2023 - year;
        if (age < 16) {
            ageGroup = "Tuoi vi thanh nien.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "Tuoi truong thanh.";
        } else {
            ageGroup = "Gia roi!";
        }
        System.out.println("Ban" + name + "thuoc nhom" + ageGroup);
    }
}

