import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       System.out.println("Nhập bán kính hình tròn: ");
       Scanner sc = new Scanner(System.in);
       int bk=sc.nextInt();
       sc.close();
       double area = bk*bk * Math.PI;
       System.out.printf("Diện tích hình tròn là: %.2f",area);

    }
}