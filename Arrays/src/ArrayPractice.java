
public class ArrayPractice {
	//calculate average value of array elements
	//test if an array contains a specific value
	//find the index of an array element
	
	public static void main(String[] args) {
	int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	System.out.println(addAll(list));
	System.out.println(checkNum(list));
	System.out.println(findIndex(list));
	
	
	
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
	 
	 /*public static int findIndex(int[] a3) {
		 for (int i = 0; i < 16; i = i + 4) {
			 if(i == a3[x]) {
				 
			 }
		 }
	 }*/

}
