//Viết chương trình tính tổng các số chẵn của mảng 1 chiều
import java.util.Scanner;
public class slide74 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n,tong=0;
        System.out.print("Nhap so phan tu trong mang: ");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            do{
                System.out.print("Nhap vao phan tu thu "+ (i+1) +": ");
                a[i]=sc.nextInt();
            }while(n<=0);
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                tong+=a[i];
        }
        System.out.print("Tong cac so chan trong mang la: "+tong);
    }
}
