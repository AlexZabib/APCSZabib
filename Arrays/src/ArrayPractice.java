
public class ArrayPractice {
	//calculate average value of array elements
	//test if an array contains a specific value
	//find the index of an array element
	//remove a value from the index, and print without that index
	
	public static void main(String[] args) {
	int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	System.out.println(addAll(list));
	System.out.println(checkNum(list));
	System.out.println(findIndex(list), 3);
	
	
	
	}
	 public static int addAll(int[] a1){
		 int x = 0; 
		 for(int i = 0; i<a1.length; i++)
			 x = x+a1[i];
		 	 x = x/a1.length;
		return x;
	 }
	 
	 public static boolean checkNum(int[] a2){
		 boolean exists = false;
		 for(int i = 0; i<a2.length; i++) {
			 if(a2[i] == 4) {
				 exists = true;
			 }
		 }
		 return exists;
	 }
	 
	 public static int findIndex(int[] a3, int t) {
		 int len = a3.length;
		 int i = 0;
		 while  (i < a3.length) {
			 if(a3[i] == t)
				 return t;
			 else
				 i++;
		 }
		 return -1;
	 }

}
