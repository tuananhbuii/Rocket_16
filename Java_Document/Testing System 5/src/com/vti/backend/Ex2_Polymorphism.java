package com.vti.backend;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.vti.entity.Polymorphism.Question1.Student;

public class Ex2_Polymorphism {
	Random random = new Random();
	ArrayList<Student> list = new ArrayList<Student>();
	Scanner scanner = new Scanner(System.in);

	public void Question1() {
		Student[] students = new Student[11];
		while (true) {
			System.out.println("\t\t MENU \t\t");
			System.out.println("\t 1.Tạo 10 học sinh, chia thành 3 nhóm.");
			System.out.println("\t 2.Kêu gọi cả lớp điểm danh.");
			System.out.println("\t 3.Gọi nhóm 1 đi học bài.");
			System.out.println("\t 4.Gọi nhóm 2 đi dọn vệ sinh.");
			System.out.println("\t 5.Thoát.");
			System.out.println("\t\t\t ========= \t\t\t");
			System.out.print("Mời bạn đưa ra lựa chọn : ");
			int n = scanner.nextInt();
			switch (n) {
			case 1:
				students[1] = new Student("Tuấn Anh ", 1);
				students[2] = new Student("Hoa Mai ", 1);
				students[3] = new Student("Duy ", 1);
				students[4] = new Student("Kiên ", 2);
				students[5] = new Student("Hải ", 2);
				students[6] = new Student("Hiền ", 2);
				students[7] = new Student("Bích ", 3);
				students[8] = new Student("Giang ", 3);
				students[9] = new Student("Linh ", 3);
				students[10] = new Student("Long ", 3);
				System.out.println("Tạo thành công 10 Sinh viên");
				break;
			case 2:
				System.out.println("\t--- Cả lớp điểm danh --- \t");
				for (int i = 1; i <= 10; i++) {
					students[i].DiemDanh();
				}
				break;
			case 3:
				System.out.println("\t--- Nhóm 1 đi học bài  ---\t");
				for (int i = 1; i <= 10; i++) {
					if (students[i].getGroup() == 1) {
						students[i].HocBai();
					}
				}
				break;
			case 4:
				System.out.println("\t--- Nhóm 2 đi dọn vệ sinh ---\t");
				for (int i = 1; i <= 10; i++) {
					if (students[i].getGroup() == 2) {
						students[i].DonVeSinh();
					}
				}
				break;
			case 5:
				System.out.println("Thoát chương trình !");
				return;
			default:
				System.out.println("Bạn nhập sai, mời nhập lại : ");
				break;
			}
		}
	}
}
