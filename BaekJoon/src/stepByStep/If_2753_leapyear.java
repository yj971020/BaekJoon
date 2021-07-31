package stepByStep;

import java.io.IOException;
import java.util.Scanner;

public class If_2753_leapyear {

	public static void main(String[] args) throws IOException {
		Scanner scanner= new Scanner(System.in);
		int year=Integer.parseInt(scanner.nextLine());
		
		if( (year%4==0 && year%100!=0)  ) {
			System.out.println("1");
		 }else if(year%400==0)
		{System.out.println("1");
		}else 
			System.out.println("0");
		
	}

}
