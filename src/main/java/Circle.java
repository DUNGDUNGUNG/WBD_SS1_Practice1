import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Nhap ban kinh hinh tron: ");
        double r = scanner.nextDouble();
        double cv = 2*r*pi;
        System.out.println("Chu vi hinh tron la: " + cv + "\n");
        System.out.println("Dien tich hinh tron la: " + (r*r*pi) );

    }
}
