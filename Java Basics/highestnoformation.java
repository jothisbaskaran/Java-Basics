package practicejava;
import java.util.*;
public class highestnoformation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=n+"";
		char[]ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}
