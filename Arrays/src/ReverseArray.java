
public class ReverseArray {

	public static void main(String[] args) {
		

	}

	public static boolean does6Exist(int[] testArray) {
		boolean exists = false;
		for (int x = 0; x <testArray.length; x++){
			if(testArray[x] == 6) {
				exists = true;
			}
		}
		return exists;
	}
	
}
