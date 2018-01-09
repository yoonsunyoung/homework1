import java.util.Scanner;

public class Calculator {
	public static int menu(){
		System.out.println("[ ID: 1413911 ]");
		System.out.println("[ Name: À±¼±¿µ   ]");
		
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbers");
		System.out.println("4. Quit");
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		num = scan.nextInt();
		
		return num;
	}

	public static void main(String[] args) {
		int menuNum;
		
		menuNum = menu();
	}

}
