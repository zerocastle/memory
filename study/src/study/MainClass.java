package study;

import java.util.Scanner;

import study.service.Service;

public class MainClass {

	private static final Scanner s = new Scanner(System.in);
	Service service = new Service();

	public MainClass() {
		// TODO Auto-generated constructor stub
		int choose = 1;
		String order = "";
		if (choose == 1) 
			order += "/search";
		
		service.setOrder(order);

	}

	public static void main(String[] args) {

		new MainClass();
	}

}
