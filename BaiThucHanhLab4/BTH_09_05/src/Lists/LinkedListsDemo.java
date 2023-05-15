package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import Models.Students;

public class LinkedListsDemo {
    public static void main(String[] args) throws Exception {
        LinkedList<Students> stdLists = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Students std = new Students();

        System.out.print("Nhap vao so hoc sinh: ");
        int n = sc.nextInt();

        std.Add(stdLists, n);
        std.HienThi(stdLists);
        std.SuaThongTin(stdLists);
        std.XoaThongTin(stdLists);
    }
}
