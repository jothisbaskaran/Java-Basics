package practicejava;
import java.util.*;
public class widthspace {
public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	long num = sc.nextLong();
	long num2 = sc.nextLong();
	double d = sc.nextDouble();
	System.out.printf("%05d\n",num);
	System.out.printf("%5d\n",num2);
	System.out.printf("%20.4f",d);
}
}
