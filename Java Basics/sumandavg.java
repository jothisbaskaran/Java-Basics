package stringconcept;

import java.util.Scanner;

public class sumandavg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        	sum=sum+arr[i];
        }
        float avg=sum/n;
        System.out.println(sum);
        System.out.println(avg);
	}
}
