package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

public class Ex5_Inheritance {
	ArrayList<CanBo> list = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	public void Them() {
		int lc;
		do {
			System.out.println("--------MENU---------");
			System.out.println("1. Nhân Viên ");
			System.out.println("2. Công Nhân ");
			System.out.println("3. Kỹ Sư ");
			System.out.println("4. Quay lại");
			System.out.print("Mời bạn nhập lựa chọn : ");
			lc= scanner.nextInt();
			switch (lc) {
			case 1:
				System.out.println("==============NHÂN VIÊN===========");
				System.out.print("Số Lượng cần thêm : ");
				int a = scanner.nextInt();
				for (int i = 0; i < a; i++) {
					System.out.println("Nhân viên thứ "+(i+1));
					NhanVien NV = new NhanVien();
					NV.Input();
					list.add(NV);
				}
				break;
			case 2:
				System.out.println("==============CÔNG NHÂN===========");
				System.out.print("Số Lượng cần thêm : ");
				int b = scanner.nextInt();
				for (int i = 0; i < b; i++) {
					System.out.println("Công nhân thứ "+(i+1));
					CongNhan CN = new CongNhan();
					CN.Input();
					list.add(CN);
				}
				break;
			
			case 3:
				System.out.println("==============KỸ SƯ===========");
				System.out.print("Số Lượng cần thêm : ");
				int c = scanner.nextInt();
				for (int i = 0; i < c; i++) {
					System.out.println("Kỹ sư thứ "+(i+1));
					KySu KS = new KySu();
					KS.Input();
					list.add(KS);
				}
				break;
			case 4:
				return;
			default:
				System.out.println("Bạn nhập sai, mời nhập lại");
				break;
			}
		} while (lc !=4);
	}
}
