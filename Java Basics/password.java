package stringconcept;
import java.util.*;
public class password
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("validpassword"+vaild(str));
	}
	public static boolean vaild(String str)
	{
		int l=str.length();
		boolean hasupper=false,haslower=false,hasdgt=false,hasspace=false,hassplchr=false;
		if(l<8)
			return false;
		else
		{
			for(int i=0;i<l;i++)
			{
				if(Character.isUpperCase(str.charAt(i)))
					return true;
				else if(Character.isLowerCase(str.charAt(i)))
					return true;
				else if(Character.isDigit(str.charAt(i)))
					return true;
				else if(Character.isWhitespace(str.charAt(i)))
					return true;
				else if(special(str.charAt(i)))
					return true;
			}
			return hasupper&&haslower&&hasdgt&&!hasspace&&hassplchr;
		}
	}
		public static boolean special(char c)
		{
			String sp="!@#$%^&*()_+-";
			if(sp.indexOf(c)!=1)
				return true;
			else
				return false;
		}
}