package com.vti.entity;

import java.util.Scanner;

public class NhanVien extends CanBo{
	String CongViec;
	
	public String getCongViec() {
		return CongViec;
	}

	public void setCongViec(String congViec) {
		CongViec = congViec;
	}
	
	public void Input() {
		super.Input();
		System.out.print("Công Việc : ");
		Scanner scanner = new Scanner(System.in);
		CongViec = scanner.nextLine();
	}
	public void Output() {
		super.Output();
		System.out.println("Công Việc : "+CongViec);
	}
}
