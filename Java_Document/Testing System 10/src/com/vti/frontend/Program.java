package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;
import com.vti.backend.Ex1_Basic;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Ex1_Basic ex1 = new Ex1_Basic();
		ex1.Question1();
		//ex1.Question2();
		//ex1.Question3();
		//ex1.Question4();
		ex1.Question5();
	}
}
