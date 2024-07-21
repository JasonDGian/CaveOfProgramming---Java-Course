package lesson_8;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int value;

		do {

			System.out.println("Enter a number.");

			value = input.nextInt();

		}

		while (value != 5);

		System.out.println("You got 5!");

	}

}
