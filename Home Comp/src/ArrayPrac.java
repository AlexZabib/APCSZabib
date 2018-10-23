
public class ArrayPrac {

	public static void main(String[] args) {
		 //declares the array list identifier or name of array
		 //declares how long the list of the array is
		// can combine lines 5 and 6 to be int list[] = new int[10];
		int list[];
		list = new int[10];
		
		for(int i = 0; i<=9; i++) {
			list[i] = i + 100;
			System.out.println(list[i] + " ");
		}
		
		int list1[] = {100, 101, 102, 103, 104};
		for(int i = 0; i<=4; i++) {
			System.out.println("List1[" + i + "] = " + list1[i]);
		}
		
		int twoD[][];			// declaration of two-dimensional integer array
		twoD = new int[2][3];	// new 2D array is constructed with 2 rows and 3 columns
		twoD[0][0] = 1;
		twoD[0][1] = 2;
		twoD[0][2] = 3;
		twoD[1][0] = 4;
		twoD[1][1] = 5;
		twoD[1][2] = 6;	

		System.out.print(twoD[0][0] + "  ");
		System.out.print(twoD[0][1] + "  ");
		System.out.println(twoD[0][2] + "  ");	
		System.out.print(twoD[1][0] + "  ");
		System.out.print(twoD[1][1] + "  ");
		System.out.println(twoD[1][2] + "  ");	

	}
}
