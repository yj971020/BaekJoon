package stepByStep;

import java.util.Scanner;

public class For_2739_multiple {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());

		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
