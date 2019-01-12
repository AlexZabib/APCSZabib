

public class CodingBatP199484 {

	public static void main(String[] args) 
	{
		tenRun(2, 10, 3, 4, 20, 5);
		System.out.println("");
		tenRun(10, 1, 20, 2, 0, 0);
		System.out.println("");
		tenRun(10, 1, 9, 20, 0, 0);
	}
	
	public static void tenRun(int num, int num1, int num2, int num3, int num4, int num5)
	{
		int array1[] = {num, num1, num2, num3, num4, num5};
		boolean ten = false;
		for(int i = 0; i<array1.length; i++)
		{
			if(array1[i] == 0)
				break;
			if(array1[i] % 10 == 0)
			{
				ten = true;
			}
			else 
			{
				ten = false;
			}
			if (ten == true)
			{
				array1[i] = 10 * array1[i] / 10;
				System.out.println(array1[i]);
			}
				else 
			{
				while(i == 0)
				{
					array1[i] = array1[i];
					System.out.println(array1[i]);
					break;
				}
				while(i>0)
				{
					array1[i] = array1[i-1];
					System.out.println(array1[i]);
					break;
				}
				
			}
				
		}
	}

}
