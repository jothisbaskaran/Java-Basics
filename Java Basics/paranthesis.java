package stringconcept;
import java.util.Scanner;
public class paranthesis
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(balance(s));
	}
	public static boolean balance(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
		   if(s.charAt(i)=='(')
		   {
			   c++;
		   } 
		   else if(s.charAt(i)==')')
		   {
			   c--;
			   if(c<0)
			   {
				 return false;
			   }
		   }
		}
		if(c>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

