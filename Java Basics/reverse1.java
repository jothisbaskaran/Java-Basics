package practicejava;
import java.util.Scanner;
public class reverse1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []sp=str.split(" ");
		String S="";
		for(int i=sp.length-1;i>=0;i--)
		{
			S=S+sp[i];
			if(i>=0)
			{
				S=S+" ";
			}
		}
		System.out.println(S);
	}
}
