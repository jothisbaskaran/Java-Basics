package stringconcept;

public class basic 
{
	public static void main(String[] args) 
	{
	   String str="welcome";
	   String str1=str.concat(" to java");
	   System.out.println(str1);
	   for(int i=0;i<str1.length();i++)
	   {
	   System.out.println(i+"="+str1.charAt(i));
	   }
	}
}
