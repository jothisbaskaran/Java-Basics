package practicejava;

import java.util.Scanner;

public class charcterpattern {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		for(int i=1;i<n;i++) {
			for(char ch=1;ch<=i;ch++) {
				System.out.print("ch");
			}
			System.out.println();
		}
	}

}
