package practicejava;
import java.util.Scanner;
public class split 
{
   public static void main(String[]args)
   {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   String []str=s.split(" ");
	   for(String s1:str)
	   {
	   String S="";
	   for(int i=s1.length()-1;i>=0;i--)
	   {
		   S=S+s1.charAt(i);
	   }
	   System.out.println(S+" ");
	   }
   }
}
