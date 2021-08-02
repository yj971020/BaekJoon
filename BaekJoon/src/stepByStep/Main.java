package stepByStep;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.next());
		int sum=0;
		for(int i=0; i<=n ;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	
}
