import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex5_Input_from_console {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Question1();
		// Question2();
		//Question3();
		Question4();
		Question5();
		Question6();
		Question7();
		Question8();
		Question9();
		Question10();
		Question11();

	}

	private static void Question1() {
		// Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		System.out.println("\t --- Question 1 --- \t");
		int arrayInt[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("Mời nhập vào số thứ " + (i + 1 + " : "));
			arrayInt[i] = scanner.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Số thứ " + (i + 1) + " là: " + arrayInt[i]);
		}
	}

	private static void Question2() {
		// Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		System.out.println("\t --- Question 2 --- \t");
		float array[] = new float[2];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Nhập vào số thực thứ " + (i + 1) + " : ");
			array[i] = scanner.nextFloat();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Số thứ " + (i + 1) + " là : " + array[i]);
		}
	}

	private static void Question3() {
		// Viết lệnh cho phép người dùng nhập họ và tên
		System.out.println("\t --- Question 3 --- \t");
		System.out.print("Nhập vào Họ tên : ");
		String Hoten = scanner.nextLine();
		System.out.println("Họ tên là : " + Hoten);
	}

	private static void Question4() {
		// Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		System.out.println("\t --- Question 4 --- \t");
		System.out.println("Question 4: ");
		System.out.print("Mời bạn nhập năm sinh : ");
		int year = scanner.nextInt();
		System.out.print("Mời bạn nhập tháng sinh : ");
		int month = scanner.nextInt();
		System.out.print("Mời bạn nhập ngày sinh : ");
		int day = scanner.nextInt();
		LocalDate dateBirth = LocalDate.of(day, month, year);
		System.out.println("Ngày sinh của bạn là: " + dateBirth);

	}

	private static void Question5() {
		// Viết lệnh cho phép người dùng tạo account (viết thành method)
		// Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
		// chương trình sẽ chuyển thành Position.Dev, Position.Test,
		// Position.ScrumMaster, Position.PM
		System.out.println("\t --- Question 5 --- \t");
		Account account = new Account();
		System.out.println("AccountID : ");
		account.AccountID = Integer.parseInt(scanner.nextLine());
		System.out.println("Email : ");
		account.Email = scanner.nextLine();
		System.out.println("FullName : ");
		account.FullName = scanner.nextLine()
	}

	private static void Question6() {
		// Viết lệnh cho phép người dùng tạo department (viết thành method)
		System.out.println("\t --- Question 6 --- \t");
	}

	private static void Question7() {
		// Nhập số chẵn từ console
		System.out.println("\t --- Question 7 --- \t");
	}

	private static void Question8() {
		// Viết chương trình thực hiện theo flow sau:
		/*
		 * Bước 1: Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
		 * Bước 2: Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account Nếu người dùng
		 * nhập vào 2 thì sẽ thực hiện chức năng tạo department Nếu người dùng nhập vào
		 * số khác thì in ra text "Mời bạn nhập lại" và quay trở lại bước 1
		 */
		System.out.println("\t --- Question 8 --- \t");
	}

	private static void Question9() {
		// Viết method cho phép người dùng thêm group vào account theo flow sau:
		/*
		 * Bước 1: In ra tên các usernames của user cho người dùng xem Bước 2: Yêu cầu
		 * người dùng nhập vào username của account Bước 3: In ra tên các group cho
		 * người dùng xem Bước 4: Yêu cầu người dùng nhập vào tên của group Bước 5: Dựa
		 * vào username và tên của group người dùng vừa chọn, hãy thêm account vào group
		 * đó .
		 */
		System.out.println("\t --- Question 9 --- \t");
	}

	private static void Question10() {
		// Tiếp tục Question 8 và Question 9
		/*
		 * Bổ sung thêm vào bước 2 của Question 8 như sau: Nếu người dùng nhập vào 3 thì
		 * sẽ thực hiện chức năng thêm group vào account Bổ sung thêm Bước 3 của
		 * Question 8 như sau: Sau khi người dùng thực hiện xong chức năng ở bước 2 thì
		 * in ra dòng text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
		 * không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người dùng chọn
		 * "Không" thì kết thúc chương trình (sử dụng lệnh return để kết thúc chương
		 * trình)
		 */
		System.out.println("\t --- Question 10 --- \t");
	}

	private static void Question11() {
		// Tiếp tục Question 10
		/*
		 * Bổ sung thêm vào bước 2 của Question 8 như sau: Nếu người dùng nhập vào 4 thì
		 * sẽ thực hiện chức năng thêm account vào 1 nhóm ngẫu nhiên, chức năng sẽ được
		 * cài đặt như sau: Bước 1: In ra tên các usernames của user cho người dùng xem6
		 * Bước 2: Yêu cầu người dùng nhập vào username của account Bước 3: Sau đó
		 * chương trình sẽ chọn ngẫu nhiên 1 group Bước 4: Thêm account vào group chương
		 * trình vừa chọn ngẫu nhiên
		 */
		System.out.println("\t --- Question 11 --- \t");
	}

}
