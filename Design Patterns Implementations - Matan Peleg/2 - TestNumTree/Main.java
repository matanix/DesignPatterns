import javax.naming.OperationNotSupportedException;

//This solution uses the Composite DP
public class Main {
	
	public static void main(String args[]) throws OperationNotSupportedException
	{
		Component root = new Composite(5);
		Component one = new Composite(4);
		Component two = new Composite(4);
		Component three = new Leaf(6);
		Component four = new Leaf(6);
		Component five = new Leaf(7);
		
		root.addChild(one);
		root.addChild(two);
		one.addChild(three);
		one.addChild(four);
		two.addChild(five);
		
		System.out.println(root.Sum());
		System.out.println(checkEven(root));
		System.out.println(checkEven(one));
	}
	
	public static Boolean checkEven(Component nodeToCheck)
	{
		if (!nodeToCheck.amIEven())
		{
			return false;
		}
		
		if (nodeToCheck.getChilds() != null)
		{
			for (Component child : nodeToCheck.getChilds()) 
			{ 
			    if (!checkEven(child))
			    {
			    	return false;
			    }
			}
		}
		
		return true;
	}
}
