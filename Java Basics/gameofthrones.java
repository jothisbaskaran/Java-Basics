package stringconcept;

import java.util.Arrays;
import java.util.Scanner;

public class gameofthrones 
{
   public static void main(String[]args)
   {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
       System.out.println(got(s));
   }
   public static String got(String s)
   {
	   char[]ar=s.toCharArray();
	   Arrays.sort(ar);
	   int errorcount=0;
	   int i=0;
	   while(i<ar.length)
	   {
		    if((i<ar.length-1&&ar[i]==ar[i+1]))
		    {
		    	i=i+2;
		    }
		    else
		    {
		    	i++;
		    	errorcount++;
		    }
	    }
	   if(errorcount<=1)
	   {
		   return"YES";
	   }
	   else
	   {
		   return"NO";
	   }
   }
}
