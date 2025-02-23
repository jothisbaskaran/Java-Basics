package practicejava;
import java.util.*;
public class multipication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		for(int i=1;i<=n;i=i+1)
		{
			mul=mul*i;
		}
		System.out.println(mul);
	}

}
