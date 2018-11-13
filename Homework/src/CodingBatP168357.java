
public class CodingBatP168357 {

	public static void main(String[] args) 
	{
		System.out.println(checkSeven(1, 7, 7, 0, 0, 0));	
		System.out.println(checkSeven(1, 7, 1, 7, 0, 0));
		System.out.println(checkSeven(1, 7, 1, 1, 7, 0));
	}
	
	public static boolean checkSeven(int num, int num1, int num2, int num3, int num4, int num5)
	{
		int[] array1 = {num, num1, num2, num3, num4, num5};
		boolean sevenSeven = false;
		for(int i = 1; i<=array1.length; i++)
		{
			if(array1[i] == 7 && array1[i-1] == 7 )
			{
				sevenSeven = true;
				return sevenSeven;
			}
			/*else if(array1[i] == 7 && array1[i-2] == 7)
			{	
				sevenSeven = true;
				return sevenSeven;
			}*/
			else
			{
				sevenSeven = false;
				return sevenSeven;
			}
		}
		return sevenSeven;
		
	}

}
