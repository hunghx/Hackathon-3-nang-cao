import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> listCustomers = new LinkedList<>();
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên khách hàng chờ mua vé xem phim\n" +
                    "2. Khách tiếp theo\n" +
                    "3. Thoát");
            System.out.println("Nhập vào lwuja chọn");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên kahchs hàng mua vé");
                    String customerName = input.nextLine();
                    listCustomers.add(customerName);
                    System.out.println("thêm mới thành công");
                    break;
                case 2:
                    System.out.println("Khách hàng tiếp theo");
                    System.out.println(listCustomers.poll());
                    break;
                case 3:
                    System.out.println("thoát");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ");
                    break;
            }

        }
    }
}