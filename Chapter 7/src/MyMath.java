import java.util.Scanner;

public class MyMath {

		public static void main (String args[]){
			
			System.out.println(addNum(1,2));
			System.out.println(addNum(1.2,1.7));
			System.out.println(circ(2.3));
			System.out.println(area(2.3));
			System.out.println(dist(20,50,10,100));
			System.out.println("The missing side is " + phyt());
		
		}
		public static int addNum(int num1, int num2) {
			int sum = num1 + num2;
			
			return sum;
		}
		
		public static double addNum(double num1, double num2) {
			return num1 + num2;
		}
		
		public static double circ(double diameter) {
			return Math.PI * diameter;
		}
		
		public static double area(double radius) {
			return Math.PI * Math.pow(radius, 2);
		}
		
		public static double dist(double x1, double y1, double x2, double y2) {
			return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		}
		
		
		public static double phyt() {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("If you don't know a side enter 0");
			System.out.print("Enter A --> ");
			int a = keyboard.nextInt();
			System.out.print("Enter B --> ");
			int b = keyboard.nextInt();
			System.out.print("Enter C --> ");
			int c = keyboard.nextInt();
			if (a == 0) {
				return Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2)); 
			}
			else if (b == 0) {
				return Math.sqrt(Math.pow(c, 2) - Math.pow(a,2));
				
			}
			else if (c == 0) {
				return Math.sqrt(Math.pow(a, 2) + Math.pow(b,  2));

			}
			else {
				return -1;
			}
			
		}
		
		
}
