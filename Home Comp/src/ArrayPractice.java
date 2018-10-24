
public class ArrayPractice {
	//calculate average value of array elements
	//test if an array contains a specific value
	//find the index of an array element
	//remove a value from the index, and print without that index
	
	public static void main(String[] args) {
	int list[] = {1, 9, 2, 8, 3, 7, 4, 6, 5};
	System.out.println(addAll(list));
	System.out.println(checkNum(list));
	System.out.println(findIndex(list, 1));
	System.out.print(removeIndex(list, 3));
	
	
	
	
	}
	 public static int addAll(int[] a1)
	 {
		 int x = 0; 
		 for(int i = 0; i<a1.length; i++)
			 x = x+a1[i];
		 	 x = x/a1.length;
		return x;
	 }
	 
	 public static boolean checkNum(int[] a2)
	 {
		 boolean exists = false;
		 for(int i = 0; i<a2.length; i++) 
		 {
			 if(a2[i] == 4) 
			 {
				 exists = true;
			 }
		 }
		 return exists;
	 }
	 
	 public static int findIndex(int[] a3, int t) 
	 {
		 int len = a3.length;
		 int i = 0;
		 
		 while  (i < len) 
		 {
			 if(a3[i] == t) 
			 {
				 return i;
			 }
			 else 
			 {
				 i++;
			 }
		 }
		return -1;
		 
	 }
	 
	 public static int removeIndex(int a4[], int t)
	 {
		int len = a4.length;
		int i = 0;
		while(i < len)
	 	{
	 		if(t == a4[i])
	 		{
	 			for(int k = 0; k < len; k++)
	 			{
	 				while(a4[k] != t)
	 				{
	 					return a4[k];
	 				}
	 			}	  	
	 		}
	 		else {i++;}
	 	}
		return -1;
	 }
}
