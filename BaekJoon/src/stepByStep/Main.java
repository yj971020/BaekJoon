package stepByStep;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int A = Integer.parseInt(scanner.next());
		int B =Integer.parseInt(scanner.next());
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}	
}
