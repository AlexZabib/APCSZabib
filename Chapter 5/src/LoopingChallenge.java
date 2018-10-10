
public class LoopingChallenge {

	public static void main(String[] args) {
		// prints sum of 1 -> 1000
		int y = 0;
		for(int x = 1; x<=1000; x++) {
			y = y + x;
		}
		System.out.println(y);
		
		
		//prints all even numbers from 1 to 100
		for(int a = 2; a<=100; a=a+2){
			System.out.println(a);
		}
		
		//challenge: print first 20 numbers of Fibonacci Sequence
		int e = 0;
		int f = 1;
		int g = 0;
		for(int i = 1; i<=7; i++)
		{
			g = f + e;
			System.out.println(g);
			e = g + f;
			System.out.println(e);
			f = e + g;
			System.out.println(f);
			
		}
	}

}
