import java.util.Random;

public class Array {
	private int array[] = new int[20]; 
	Random random = new Random();
	IManipulateArray manipulation = null;
	
	public Array()
	{
		for (int i = 0; i < 20; i++)
		{
			array[i] = random.nextInt(99);
		}
	}
	
	public void Manipulate()
	{
		if (manipulation == null)
		{
			return; 
		}
		
		manipulation.ManipulateArray(this.array);
	}
	
	public void SetManipulation(IManipulateArray manipulation)
	{
		this.manipulation = manipulation;
	}
	
	public void PrintArray()
	{
		for (int i = 0; i < 19; i++)
		{
			System.out.print(array[i] + ",");
		}
		System.out.print(array[19]);
		System.out.print("\n");
	}
}
