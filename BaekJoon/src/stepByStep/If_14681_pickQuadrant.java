package stepByStep;

import java.util.Scanner;

public class If_14681_pickQuadrant {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in); 
		int x = Integer.parseInt(scanner.nextLine());
		int y = Integer.parseInt(scanner.nextLine());
		
		if(x>0&&y>0) {
			System.out.println("1");
		}else if(x>0&&y<0) {
			System.out.println("4");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}else if(x<0&&y>0) {
			System.out.println("2");
		}
	}

}
