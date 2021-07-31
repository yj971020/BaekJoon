package stepByStep;

import java.util.Scanner;

public class If_2884_Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int H=Integer.parseInt(scn.next());
		int M=Integer.parseInt(scn.next());
		
		if(M<45) {
			M=60-(45-M);
			if(H==0) {
				H=23;
			}else {
			H--;
			}
		}else
		{
			M=M-45;
		}
System.out.printf("%d %d",H,M);

	}
	
}
