import java.util.Scanner;

public class stackTest {
	public static String checkInput(String stringValue)
	{
		Scanner input = new Scanner(System.in);
		boolean variableCheck = true;
		
		stringValue = stringValue.toUpperCase();
		if (stringValue.length() == 1 && (stringValue.charAt(0) >=65 && stringValue.charAt(0) <= 68))
			variableCheck = true;
		else
			variableCheck = false;
		
		if (variableCheck == false)
		{
			System.out.print("Invalid Input! Enter A, B, C, or D: ");
			stringValue = checkInput(input.next());
		}
			return stringValue;
	}
	
	public static String checkIntInput(String numberValue)
	{
		Scanner input = new Scanner(System.in);
		boolean numberCheck = true;
		
		for (int i = 0; i < numberValue.length(); i++)
		{
			if (numberValue.charAt(i) >= 48 && numberValue.charAt(i) <= 57)
				numberCheck = true;
			else
				numberCheck = false;
		}
		
		if (numberCheck == false)
		{
			System.out.print("Enter an Integer: ");
			numberValue = checkIntInput(input.next());
		}
		
		return numberValue;
	}
	
	public static void main(String[] args)
	{
		stack testStack = new stack();
		
		Scanner input = new Scanner(System.in);
		String playerInput = "";
		String numberInput = "";
		boolean continuation = true;
		
		while (continuation == true)
		{
			System.out.print("Would you like to: " +
								"\na) PUSH an int into the stack" +
								"\nb) POP the int on top of the stack out" + 
								"\nc) PEEK into the stack to see what int is on top" + 
								"\nd) END the program" + 
								"\nYour Input: ");
			playerInput = checkInput(input.next());
			
			if (playerInput.equals("A"))
			{
				System.out.print("Enter an int to put into the stack: ");
				numberInput = checkIntInput(input.next());
				int value = Integer.parseInt(numberInput);
				
				testStack.push(value);
			}
			else if (playerInput.equals("B"))
			{
				testStack.empty();
				if (testStack.empty() == true)
					System.out.println("The stack is empty!");
				else
					testStack.pop();
			}
			else if (playerInput.equals("C"))
			{
				testStack.empty();
				if (testStack.empty() == true)
					System.out.println("The stack is empty!");
				else
					System.out.println(testStack.peek() + " is at the top of the stack.");
			}
			else if (playerInput.equals("D"))
				continuation = false;
			
			System.out.println();
		}
		
		System.out.println("Program terminated...");
		
		input.close();
		
		/*
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		testStack.push(4);
		testStack.push(5);
		testStack.push(6);
		testStack.push(7);
		testStack.push(8);
		testStack.push(9);
		System.out.println(testStack.peek());
		testStack.pop();
		System.out.println(testStack.peek());
		*/
	}
}
