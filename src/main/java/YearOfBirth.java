import java.util.Scanner;

public class YearOfBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ns;
        System.out.println("Nhap nam sinh cua ban: ");
        ns = scanner.nextInt();
        int age = 2019 - ns;
        System.out.println("Tuoi nam nay cua ban la : " + age);
    }
}
