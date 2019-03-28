import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vl,hh,th;
        System.out.println("Moi ban nhao diem vat ly: ");
        vl=scanner.nextFloat();
        System.out.println("Moi ban nhap diem hoa hoc: ");
        hh=scanner.nextFloat();
        System.out.println("Moi ban nhap diem toan hoc: ");
        th=scanner.nextFloat();
        float dtb =(vl+hh+th)/3;
        System.out.println("Diem trung binh cua ban la: " + dtb);
        float tong = vl+ hh+ th;
        System.out.println("Tong diem ba mon cua ban la: " + tong);
    }
}
