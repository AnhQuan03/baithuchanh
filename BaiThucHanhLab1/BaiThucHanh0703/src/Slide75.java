//Viết chương trình tính tổng các số chẵn của mảng 2 chiều
import java.util.Scanner;
public class Slide75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dong, cot, tong=0;
        System.out.print("Nhap so dong:");
            dong=sc.nextInt();
            while(dong<=0){
                System.out.print("Nhap lai so dong phai > 0:");
                dong=sc.nextInt();
            }
        System.out.print("Nhap so cot:");
            cot=sc.nextInt();
            while(cot<=0){
                System.out.println("Nhap lai so cot phai > 0:");
                cot=sc.nextInt();
            }
        int a[][]=new int[dong][cot];
        for(int i=0;i<dong;i++){
            for(int j=0;j<cot;j++){
                System.out.printf("Nhap vao phan tu thu a[%d][%d]= ",i,j);
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<dong;i++){
            for(int j=0;j<cot;j++){
                if(a[i][j]%2==0)
                    tong+=a[i][j];
            }
        }
        System.out.printf("Tong cac so chan cua mang la: %d",tong);
    }
}