package stringconcept;
import java.util.*;
public class length 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	{
		String s="Computers";
		int l2=0;
		System.out.println("length="+s.length());
		for(char c:s.toCharArray())
		{
			l2++;
		}
		System.out.println(l2);
	}
	}
}
