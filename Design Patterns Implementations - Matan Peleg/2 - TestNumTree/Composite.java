import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

	List<Component> children = new ArrayList<Component>(); 
	
	public Composite(float number) {
		super(number);
	}

	@Override
	public void addChild(Component c) {
		children.add(c);
	}

	@Override
	public void removeChild(Component c) {
		children.remove(c);	
	}

	@Override
	public List<Component> getChilds() {
		return children;
	}	
	
	@Override
	public float Sum()
	{
		float sumResult = this.number;
		
		for (Component child : this.getChilds()) 
		{ 
		    sumResult += child.Sum();
		}
		
		return sumResult;
	}
}
