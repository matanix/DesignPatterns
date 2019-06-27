
public class IMultiplyByTwo implements IManipulateArray {
	public void ManipulateArray(int array[])
	{
		for (int i = 0; i < array.length; i++)
		{
			array[i] *= 2;
		}
	}
}
