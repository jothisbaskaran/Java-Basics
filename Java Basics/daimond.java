package practicejava;

import java.util.Scanner;

public class daimond {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int i1=1;i1<=n;i1--){
				System.out.print(" ");}
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");}
			}
			System.out.println();
			}
		}
	


