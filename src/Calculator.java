import java.util.Scanner;

public class Calculator {
	public static int menu(){
		System.out.println("[ ID: 1413911 ]");
		System.out.println("[ Name: 윤선영   ]");
		
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbers");
		System.out.println("4. Quit");

		System.out.print(">");
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		menu = scan.nextInt();
		
		return menu;
	}
	
	
	public static int add(int addFirstNum, int addSecondNum){		
		return addFirstNum + addSecondNum;
	}
	
	public static int subtract(int subtractionFirstNum, int subtractionSecondNum){		
		return subtractionFirstNum - subtractionSecondNum;
	}
	
	public static int multiply(int multiplicationFirstNum, int multiplicationSecondNum){		
		return multiplicationFirstNum * multiplicationSecondNum;
	}

	
	public static void main(String[] args) {
		
		int menuNum, firstInput, lastInput;
		int result = 0;
		
		do{
			menuNum = menu();
			
			if(menuNum == 4){
				System.out.println("프로그램이 종료되었습니다.");
			}
			else{
				Scanner scan = new Scanner(System.in);
				
				System.out.print("x: ");
				firstInput = scan.nextInt();
				
				System.out.print("y: ");
				lastInput = scan.nextInt();		
				
				switch(menuNum){
				case 1:
					result = add(firstInput, lastInput);
					break;
				case 2:
					result = subtract(firstInput, lastInput);
					break;
				case 3:
					result = multiply(firstInput, lastInput);
					break;
				}
				
				System.out.println("The result is "+ result);
			}	
		
		}while(menuNum != 4);
	}

}