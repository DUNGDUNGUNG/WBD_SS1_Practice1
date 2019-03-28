import java.util.Scanner;

public class CelsiusConvertFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        System.out.println(" Nhap do C can doi: ");
        celsius = scanner.nextDouble();
        double fahrenheit = 1.8d * celsius + 32;
        System.out.println( celsius + " do C = " + fahrenheit +  " do F  " );

    }
}
