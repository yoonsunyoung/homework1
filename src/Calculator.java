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
	
	
	public static void add(int addFirstNum, int addSecondNum){		
		int result = addFirstNum + addSecondNum;		
		System.out.println(result);
	}
	
	public static void subtract(int subtractionFirstNum, int subtractionSecondNum){		
		int result = subtractionFirstNum - subtractionSecondNum;		
		System.out.println(result);
	}
	
	public static void multiply(int multiplicationFirstNum, int multiplicationSecondNum){		
		int result = multiplicationFirstNum * multiplicationSecondNum;		
		System.out.println(result);
	}

	
	public static void main(String[] args) {
		
		int menuNum, firstInput, lastInput;
		
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
					add(firstInput, lastInput);
					break;			
				case 2:
					subtract(firstInput, lastInput);
					break;
				case 3:
					multiply(firstInput, lastInput);
					break;
				}
			}
				
			
		
		}while(menuNum != 4);
	}

}