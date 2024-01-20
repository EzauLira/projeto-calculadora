import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.print("Insert a value: ");
		int value1 = input.nextInt();
		
		System.out.print("Insert an operation: ");
		char operation = input.next().charAt(0);
		
		System.out.print("Insert a value: ");
		int value2 = input.nextInt();
		
		
		switch(operation) {
		case '+':
			System.out.println(value1 + value2);
			break;
		case '-':
			System.out.println(value1 - value2);
			break;
		case '*':
			System.out.println(value1 * value2);
			break;
		case '/':
			System.out.println(value1 / value2);
			break;
		case '%':
			System.out.println(value1 % value2);
			break;
		case '^':
			System.out.println(Math.pow(value1, value2));
			break;
		}
	}
	

}
