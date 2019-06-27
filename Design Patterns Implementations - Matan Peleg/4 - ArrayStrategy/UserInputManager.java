import java.util.Scanner;

public class UserInputManager {
	private Array array = new Array();
	private IManipulateArray multiply = new IMultiplyByTwo();
	private IManipulateArray sort = new ISort();
	private Scanner scanner = new Scanner(System.in);
	
	public void Run()
	{
		array.PrintArray();
		
		while(true)
		{
			char command = scanner.next().charAt(0);
			
			switch(command)
			{
			case '1':
				array.SetManipulation(sort);
				array.Manipulate();
				break;
			case '2':
				array.SetManipulation(multiply);
				array.Manipulate();
				break;
			}
			
			array.PrintArray();
		}
	}
}
