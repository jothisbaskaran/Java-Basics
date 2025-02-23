package practicejava;

public class searchelementarray 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		int key=3;
		boolean found=false;
		for(int i:arr)
		{
			if(i==key) 
			{
				found=true;
				//break;
				System.out.println(i);
			

			}
		}
		System.out.println(found);

	}

}
