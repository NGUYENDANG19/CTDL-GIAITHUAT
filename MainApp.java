package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
	    LinkedList list = new LinkedList();

	    // Chèn 5 giá trị vào danh sách
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);

	    // In ra màn hình các giá trị trong danh sách
	    System.out.println("Danh sách các giá trị:");
	    list.display();

	    // Tìm kiếm giá trị x
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Nhập giá trị cần tìm: ");
	    int x = scanner.nextInt();
	    if (list.search(x)) {
	        System.out.println(x + " có trong danh sách");
	    } else {
	        System.out.println(x + " không có trong danh sách");
	    }

	    // Xóa giá trị x
	    System.out.print("Nhập giá trị cần xóa: ");
	    x = scanner.nextInt();
	    list.delete(x);
	    System.out.println("Danh sách sau khi xóa:");
	    list.display();
	}
}
