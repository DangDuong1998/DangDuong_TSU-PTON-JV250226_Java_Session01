import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
        scanner.close();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        float quotient = (float)a / b;
        int remainder = a % b;
        System.out.printf("a = %d và b = %d\n",a,b);
        System.out.printf("Tổng 2 số a+b = %d\n",sum);
        System.out.printf("Hiệu 2 số a-b = %d\n",difference);
        System.out.printf("Tích 2 số a*b = %d\n",product);
        System.out.printf("Thương 2 số a/b = %.0f\n",quotient);
        System.out.printf("Số dư khi chia số a cho b = %d",remainder);
    }
}