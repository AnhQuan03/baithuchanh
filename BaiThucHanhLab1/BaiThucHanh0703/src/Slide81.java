//Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều, sau đó tìm và hiển thị phần tử có giá trị lớn nhất trong ma trận đó.
import java.util.Scanner;
public class Slide81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dong,cot;
        double max=0;
        System.out.print("Nhap so dong: ");
        dong=sc.nextInt();
        while(dong<=0){
            System.out.print("Nhap lai so dong >0: ");
            dong=sc.nextInt();
        }
        System.out.print("Nhap so cot: ");
        cot=sc.nextInt();
        while(cot<=0){
            System.out.print("Nhap lai so cot >0: ");
            cot=sc.nextInt();
        }
        int a[][]=new int [dong][cot];
        for(int i=0;i<dong;i++){
            for(int j=0;j<cot;j++){
                System.out.printf("Nhap vao phan tu a[%d][%d]= ",i,j);
                a[i][j]=sc.nextInt();
            }
        }
        max=a[0][0];
        for(int i=0;i<dong;i++){
            for(int j=0;j<cot;j++){
                if(a[i][j]>max)
                max=a[i][j];
            }
        }
        System.out.printf("Gia tri lon nhat trong mang la: "+ max);
    }
}
