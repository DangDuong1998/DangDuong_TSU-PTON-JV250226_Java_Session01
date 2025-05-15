import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        Scanner scanner = new Scanner(System.in);
        float width = scanner.nextFloat();
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        float height = scanner.nextFloat();
        scanner.close();
        float area = width * height;
        float circumference = 2 * (width+height);
        System.out.printf("Diện tích : %.2f\nChu vi : %.2f",area,circumference);
    }
}