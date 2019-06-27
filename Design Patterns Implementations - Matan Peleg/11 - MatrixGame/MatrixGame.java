
public class MatrixGame {
	private MatrixCareTaker save = new MatrixCareTaker();
	private int xAxis;
	private int yAxis;
	private int number;
	
	public MatrixGame()
	{
		xAxis = 2;
		yAxis = 2;
		number = 1;
	}
	
	public void MoveUp()
	{
		yAxis -= 1;
		CheckValidity();
	}
	
	public void MoveDown()
	{
		yAxis += 1;
		CheckValidity();
	}
	
	public void MoveRight()
	{
		xAxis += 1;
		CheckValidity();
	}
	
	public void MoveLeft()
	{
		xAxis -= 1;
		CheckValidity();
	}
	
	public void Increase()
	{
		if (number < 9)
		{
			number++;
		}
	}
	
	public void Decrease()
	{
		if (number > 0)
		{
			number--;
		}
	}
	
	public void Save()
	{
		this.save.Save(new MatrixMemento(xAxis, yAxis, number));
	}
	
	public void CheckValidity()
	{
		if (!IsValid())
		{
			MatrixMemento lastSave = save.getSave();
			
			if (lastSave == null)
			{
				System.out.println("No save available. exiting");
				System.exit(-1);
			}
			
			else 
			{
				Restore(lastSave);
			}
		}
	}
	
	public Boolean IsValid()
	{
		if (yAxis < 0 || yAxis > 4 || xAxis < 0 || xAxis > 4)
		{
			return false;
		}
		
		return true;
	}
	
	public void Restore()
	{
		if (this.save.getSave() != null)
		{
			Restore(this.save.getSave());
		}
	}
	
	protected void Restore(MatrixMemento toRestore)
	{
		yAxis = toRestore.getY();
		xAxis = toRestore.getX();
		number = toRestore.getNumber();
	}
	
	public void PrintMatrix()
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (xAxis == i && yAxis == j)
				{
					System.out.print(number);
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.print("\n");
		}
	}
	
	public void Exit()
	{
		System.out.println("-------------");
		System.out.println("Good bye!");
		System.out.println("-------------");
		System.exit(0);
	}
}
