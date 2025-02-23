package practicejava;
import java.util.Scanner;
public class palindrom 
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String [] arr=str.split(" ");
	    for(String s:arr)
	    {
	        s=s.toLowerCase();
	    	String s1="";
	    for(int i=s.length()-1;i>=0;i--)
	    {
	    	s1=s1+str.charAt(i);
	    }
	    if(s.equals(s1))
	    {
	    	System.out.println("palindrom");
	    }
	    else
	    {
	    	System.out.println("not palindrom");
	    }
	    }
	}
}
