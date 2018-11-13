
public class CodingBatP168357 {

	public static void main(String[] args) 
	{
		int[] a1 = {1, 7, 7};
		int[] a2 = {1, 7, 1, 7};
		int[] a3 = {1, 7, 1, 1, 7};
	
		checkSeven(a1);
		checkSeven(a2);
		checkSeven(a3);
	}
	public static void checkSeven(int[] a)
	{
		boolean seven = false;
		for(int i = 1; i<a.length; i++)
		{
			while(i>0)
			{
				if(a[i] == 7 && a[i-1] == 7)
				{
					seven = true;
					break;
				}	
				else
				{
					seven = false;
					break;
				}	
			}
			while(i>1)
			{
				if(a[i] ==7 && a[i-2] == 7)
				{
					seven = true;
					break;
				}
				else if(a[i] == 7 && a[i-1] == 7)
				{
					seven = true;
					break;
				}
				else
				{
					seven = false;
					break;
				}
			}		
		}
		System.out.println(seven);
	}
}
