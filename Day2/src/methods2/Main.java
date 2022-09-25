package methods2;

public class Main {
	//Variable Arguments
		public static void main(String[] args) {
			String message ="Bugün hava çok güzel.";
			String newMessage = city();
			System.out.println(newMessage);
			int number = sum(5,7);
			System.out.println(number);
			int total = sum2(1,2,3,4,5,6,7,8,9);
			System.out.println(total);
		}
		
		public static void add() {
			System.out.println("Added!");
		}
		
		public static void delete () {
			System.out.println("Deleted!");
		}
		
		public static void update() {
			System.out.println("Updated!");
		}
		
		public static int sum(int num1, int num2) {
			return num1 + num2;
		}
		
		public static int sum2(int... numbers) {
			int total = 0;
			for (int number : numbers) {
				total += number;
			}
			return total;
		}
		
		public static String city() {
			return "Ankara";
		}

}
