import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap so thu hai: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        Double quotient = (num2 != 0) ? (num1 / num2) : null;
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        if (quotient != null) {
            System.out.println("Thuong: " + quotient);
        } else {
            System.out.println("Khong the chia cho 0!");
        }
        scanner.close();
    }
}
