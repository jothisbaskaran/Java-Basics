package practicejava;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i = 1;
	int sum = 0;
	for(; i<=n; ) {
		if(i%2==0) {
		sum = sum+i;
	}
		i++;
	}
	System.out.println(sum);

        
}
}