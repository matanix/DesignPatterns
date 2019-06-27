import java.io.IOException;
import java.util.Scanner;

public class UserInputManager {
	private MatrixGame game = new MatrixGame();
	private Scanner scanner = new Scanner(System.in);
	
	public void Run() throws IOException
	{
		game.PrintMatrix();
		
		while(true)
		{
			char command = Character.toLowerCase(scanner.next().charAt(0));
			
			switch(command)
			{
				case '1':
					game.MoveUp();
					break;
					
				case '2':
					game.MoveDown();
					break;
				
				case '3':
					game.MoveRight();
					break;
				
				case '4':
					game.MoveLeft();
					break;
				
				case '+':
					game.Increase();
					break;
					
				case '-':
					game.Decrease();
					break;
					
				case 's':
					game.Save();
					break;
				
				case 'l':
					game.Restore();
					break;
					
				case 'x':
					game.Exit();
					break;
			}
			
			ClearConsole();
			game.PrintMatrix();
		}
	}
	
	public void ClearConsole() {
		for (int i = 0; i < 50; i++)
		{
			System.out.print("\n");
		}
	}
}
