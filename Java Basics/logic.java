package stringconcept;
import java.util.Scanner;
public class logic 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			String ch=sc.nextLine();
			boolean flag=false;
			String skills = "java python react node 123 456 789";
			String []skills_arr=skills.split("");
			for(String temp:skills_arr)
			{
			    if(temp.equals(ch))
			    {
			       flag=true;  	
			    }
			}
			if(flag)
			{
			System.out.println("available");
		    }
			else
			{
			System.out.println("not available");
			}
		}
}


