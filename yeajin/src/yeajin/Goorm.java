package yeajin;

import java.util.ArrayList;

public class Goorm {
	public static void main(String[] args) {
		int numOfRegion=4;
		int numOfAttackableFrequency=3;
		int max=0;
		int[] maxarr=new int[numOfAttackableFrequency];

		int[][] frequencies= {{6,18,16,17,2,9,19},
				{8,2,16,3,11,6,19,15,17},
				{5,19,1,4,17,7},
				{6,16,3,6,19,14,12} };
		int arr[]=new int[20];
		
		for(int i=0;i<frequencies.length;i++) {
			for(int j=0;j<frequencies[i].length;j++) {
				arr[frequencies[i][j]-1]+=1;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"ÀÇ °¹¼ö:"+arr[i]+" ");
			}
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		int ans=0;
		for(int i=0;i<numOfAttackableFrequency;i++) {
			ans+=arr[i];
		}
		System.out.println(ans); 
			}
	}

