package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Abstraction.Question1.News;

public class Ex1_Abstraction {
	ArrayList<News> list = new ArrayList<News>();
	Scanner scanner = new Scanner(System.in);
	News news = new News();
	public void Question1() {
		int choose;
		do {
			System.out.println("===\t\t MENU \t\t===");
			System.out.println("\t 1.Insert news.");
			System.out.println("\t 2.View list news.");
			System.out.println("\t 3.Average rate.");
			System.out.println("\t 4.Exit.");
			System.out.println("============================");
			System.out.print("Mời bạn đưa ra lựa chọn : ");
			choose = scanner.nextInt();
			switch (choose) {
			case 1:	
				float[]rates = new float[3];			
				System.out.print("Title : ");
				scanner.next();
				news.setTitle(scanner.nextLine());
				System.out.print("PublishDate : ");
				news.setPublishDate(scanner.nextLine());
				System.out.print("Author : ");
				news.setAuthor(scanner.nextLine());
				System.out.print("Content : ");
				news.setContent(scanner.nextLine());					
				System.out.println("Nhập vào 3 đánh giá  ");
				for(int i =0; i<3; i++){
					System.out.print("Đánh giá thứ "+(i+1)+": ");
					rates[i] = scanner.nextFloat();
				}
				news.setRate(rates);
				list.add(news);
				break;
			case 2:
				for (News news : list) {
					news.Display();
				}
			case 3:
				System.out.println("Đánh giá trung bình Rate");
				for (News news : list) {
					System.out.println("Title : "+news.getTitle() + "RateAVG : "+news.Calculate());
				}
			case 4:
				return;
			default:
				System.out.println("Bạn nhập sai, mời nhập lại : ");
				break;
			}
		} while (choose != 4);
	}
}
