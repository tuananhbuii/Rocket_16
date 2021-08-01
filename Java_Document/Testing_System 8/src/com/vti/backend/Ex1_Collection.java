package com.vti.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import com.vti.entity.Student;
import com.vti.ultis.ScannerUltis;

public class Ex1_Collection {
	// List chiếm ít ô nhớ hơn ArrayList Nếu không quan tâm tới thuộc tính của nó
	private static List<Student> list;

	public Ex1_Collection() {
		list = new ArrayList<Student>();
//	System.out.println("Nhập số sinh viên muốn thêm : ");
//	int st = ScannerUltis.inputInt();
//	for (int i = 0; i < st - 3; i++) {
//		Student student = new Student("Student "+ (i+1));
//		list.add(student);
//	}
		list.add(new Student("Bùi Tuấn Anh"));
		list.add(new Student("Bùi Thị Hoa Mai"));
		list.add(new Student("Phạm Ngọc Diễn"));
		list.add(new Student("Lê Bảo Ngọc"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getID());
			System.out.println(list.get(i).getName());
		}
	}

	public static void Question1() {
		int lc;
		while (true) {
			System.out.println("\t\t --- MENU --- \t\t");
			System.out.println("\t 1.In ra tổng số phần tử của students.");
			System.out.println("\t 2.Lấy phần tử thứ 4 của students.");
			System.out.println("\t 3.In ra phần tử đầu và phần tử cuối của students.");
			System.out.println("\t 4.Thêm 1 phần tử vào vị trí đầu của students.");
			System.out.println("\t 5.Thêm 1 phần tử vào vị trí cuối của students.");
			System.out.println("\t 6.Đảo ngược vị trí của students.");
			System.out.println("\t 7.Tạo 1 method tìm kiếm student theo id.");
			System.out.println("\t 8.Tạo 1 method tìm kiếm student theo name.");
			System.out.println("\t 9.Tạo 1 method để in ra các student có trùng tên.");
			System.out.println("\t 10.Xóa name của student có id = 2.");
			System.out.println("\t 11.Delete student có id = 5.");
			System.out.println("\t 12.Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies.");
			System.out.print(" Mời bạn đưa ra lựa chọn : ");
			lc = ScannerUltis.inputInt();
			switch (lc) {
			case 1:
				System.out.println("Tổng số phần tử của Student là : " + list.size());
				break;
			case 2:
				System.out.println("Phần tử thứ 4 của student là : " + list.get(3));
				break;
			case 3:
				System.out.println("Phần tử đầu là : " + list.get(0));
				System.out.println("Phần tử cuối là : " + list.get(list.size() - 1));
				break;
			case 4:
				System.out.println("Nhập thông tin Student cần thêm : ");
				String name = ScannerUltis.inputString();
				list.add(0, new Student(name));
				break;
			case 5:
				System.out.println("Nhập thông tin Student cần thêm : ");
				String name2 = ScannerUltis.inputString();
				list.add(new Student(name2));
				break;
			case 6:
				Collections.reverse(list);
				System.out.println("Đã đảo ngược vị trí phần tử");
				break;
			case 7:
				System.out.print("Nhập ID Student cần tìm : ");
				int n = ScannerUltis.inputInt();
				for (Student student : list) {
					if (n == student.getID()) {
						System.out.println(student);
					}
				}
				break;
			case 8:
				System.out.print("Nhập tên Student cần tìm : ");
				String name3 = ScannerUltis.inputString();
				for (Student student : list) {
					if (student.getName().equalsIgnoreCase(name3)) {
						System.out.println(student);
					}
				}
				break;
			case 9:
				System.out.println("Các sinh viên trùng tên: ");
				for (int i = 0; i < list.size(); i++) {
					for (int j = i + 1; j < list.size(); j++) {
						if (list.get(i).getName().equals(list.get(j).getName())) {
							System.out.println(list.get(i).toString());
						}
					}
				}
				break;
			case 10:
				for (Student student : list) {
					if (student.getID() == 2) {
						student.setName(null);
						System.out.println("Đã thay đổi tên phần tử thứ 2");
					}
				}
				break;
			case 11:
//				System.out.println("Nhập vào ID của student cần xóa:");
//				int id = ScannerUltis.inputIntPositive();
				list.removeIf(student -> student.getID() == 5);
				System.out.println("Đã xóa Student id = 5");
				break;
			case 12:
				List<Student> arrayCop = new ArrayList<Student>();
				arrayCop.addAll(list);
				System.out.println("In phần tử trong ArrayCop : ");
				for (Student student : arrayCop) {
					System.out.println(student);
				}
				break;
			default:
				System.out.println("Mời nhập lại !");
				return;
			}
		}
	}

	public static void Question2() {
		int lc;
		while (true) {
			System.out.println("\t\t --- MENU --- \t\t");
			System.out.println("1.Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ \r\n"
					+ "muộn nhất tới sớm nhất (gợi ý dùng Stack)");
			System.out.println("2.Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự \r\n"
					+ "sớm nhất tới muộn nhất (gợi ý dùng Queue)");
			System.out.print("Nhập lựa chọn của bạn : ");
			lc = ScannerUltis.inputInt();
			switch (lc) {
			case 1:
				Stack<Student> students = new Stack<Student>();
				students.push(new Student("Nguyễn Văn A"));
				students.push(new Student("Trần Văn Nam"));
				students.push(new Student("Nguyễn Văn Huyên"));
				students.push(new Student("Nguyễn Văn Nam"));

				System.out.println("Thứ tự sinh viên theo thứ tự từ sớm nhất đến muộn nhất dùng Stack: ");
				// Sử dụng pop để lấy Data Element trong stack
				System.out.println(students.pop());
				System.out.println(students.pop());
				System.out.println(students.pop());
				System.out.println(students.pop());
				break;
			case 2:
				Queue<Student> student = new LinkedList<>();
				student.add(new Student("Nguyễn Văn A"));
				student.add(new Student("Trần Văn Nam"));
				student.add(new Student("Nguyễn Văn Huyên"));
				student.add(new Student("Nguyễn Văn Nam"));

				System.out.println("Thứ tự sinh viên theo thứ tự từ muộn nhất đến sớm nhất dùng Queue: ");
				// Sử dụng poll để lấy Data Element trong stack
				System.out.println(student.poll());
				System.out.println(student.poll());
				System.out.println(student.poll());
				System.out.println(student.poll());
				break;
			default:
				System.out.println("Mời nhập lại");
				break;
			}
		}
	}
	public static void Question3() {
		Set<Student> students = new HashSet<Student>();
		
		
	}
}
