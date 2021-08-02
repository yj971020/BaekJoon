package stepByStep;

import java.util.Scanner;

public class For_10950_sum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num= Integer.parseInt(scn.nextLine());
		
		for(int i=0;i<num;i++) {
			int a= Integer.parseInt(scn.next());
			int b= Integer.parseInt(scn.next());
			System.out.println(a+b);
		}

	}

}
