package practicejava;

public class oddevenarray 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,6,3,5};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+":"+"even");
			}
			else 
			{
				System.out.println(arr[i]+":odd");
			}
		    
		}
	}		
}

