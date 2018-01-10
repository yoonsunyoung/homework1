import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
	public static int GetInput(){
		try{
			Scanner scan = new Scanner(System.in);
			return scan.nextInt();
		}
		catch(InputMismatchException ie){
			return -1;
		}		
	}
	
	public static int menu(){
		System.out.println("[ ID: 1413911 ]");
		System.out.println("[ Name: ������   ]");
		
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbers");
		System.out.println("4. Quit");

		System.out.print(">");
		
		int menu;
		
		menu = GetInput();
		
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
		int result;
		
		do{
			result = 0;
			
			menuNum = menu();
			
			if((menuNum == -1) || ((menuNum != 1) && (menuNum != 2) && (menuNum != 3) && (menuNum != 4))){
				System.out.println("�ùٸ� ���ڸ� �Է��ϼ���.");
			}			
			else{
				if(menuNum == 4){
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
				}
				else{					
					System.out.print("x: ");
					firstInput = GetInput();
					
					System.out.print("y: ");
					lastInput = GetInput();
					
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

			}
					
		}while(menuNum != 4);
	}

}