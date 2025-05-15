import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //nhập phân số thứ nhất
        System.out.println("Nhập phân số 1");
        System.out.print("Nhập tử số của phân số 1: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Nhập mẫu số của phân số 1: ");
        int b = scanner.nextInt();

        //nhập phân số thứ hai
        System.out.println("Nhập phân số 2");
        System.out.print("Nhập tử số của phân số 2: ");
        int c = scanner.nextInt();
        System.out.print("Nhập mẫu số của phân số 2: ");
        int d = scanner.nextInt();

        //tính tổng 2 phân số
        int sumAbove = a*d + b*c;
        int sumBelow = b*d;


        //rút gọn phân số
        if(sumAbove != sumBelow){
            int maxDivide=1;
            if(sumAbove>sumBelow){
                for(int i =1;i<= sumBelow;i++){
                    if(sumAbove % i == 0 && sumBelow % i ==0){
                        maxDivide = i;
                    }
                }
            }
            else{
                for(int i =1;i<= sumAbove;i++){
                    if(sumAbove % i == 0 && sumBelow % i ==0){
                        maxDivide = i;
                    }
                }
            }
            sumAbove = sumAbove / maxDivide;
            sumBelow = sumBelow / maxDivide;
            //in phân số đã rút
            System.out.printf("Kết quả: %d/%d",sumAbove,sumBelow);
        }
        else{
            //in phân số 1 / 1 nếu tử = mẫu
            System.out.print("Kết quả: 1/1");
        }


    }
}