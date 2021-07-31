package stepByStep;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	int score= scn.nextInt();
	int num=score/10;
	switch (num) {
	case 10 :
	case 9:
		System.out.println("A");
	case 8:
		System.out.println("B");
	case 7 : 
		System.out.println("C");
	case 6:
		System.out.println("D");
	

	}
	}
}
