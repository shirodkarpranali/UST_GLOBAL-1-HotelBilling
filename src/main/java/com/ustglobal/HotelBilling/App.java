package com.ustglobal.HotelBilling;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		HotelImpl hi = new HotelImpl();
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1: To show all food items");
		System.out.println("Press 2: To take order from customers");
		System.out.println("Press 3:To operate on food items");
		System.out.println("Press 4:To total bill of the day");
		System.out.println("**************************");

		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1:
			hi.getAllData();
			System.out.println("Press 1: To insert data");
			System.out.println("Press 2: To edit particular food item");
			System.out.println("Press 3: To delete particular food item");
			System.out.println("***************************");

			int choice2 =  Integer.parseInt(sc.nextLine());
			switch (choice2) {
			case 1:
				System.out.println("insert data");
				hi.insert();
				break;
			case 2:
				System.out.println("edit data");
				hi.update();
				break;
			case 3:
				hi.deleteData();
				break;
			default:System.out.println("choose correct option");
			}
			break;
		case 2:
			System.out.println("order from customer ");
			hi.addFood();
			break;
		case 3:
			System.out.println("Press A:To add food items");
			System.out.println("Press B:To remove food items");
			System.out.println("Press C:To modify food items");
			System.out.println("************************");

			int choice3 = Integer.parseInt(sc.nextLine());
			switch (choice3) {
			case 1:
				hi.insert();
				break;
			case 2:
				hi.deleteData();
				break;
			case 3:
				hi.update();
				break;
			default:
			}
			break;
		case 4:hi.bill();
			break;
		default:
		}
	}
}
