import java.util.List;

import javax.naming.OperationNotSupportedException;

public class Leaf extends Component{

	public Leaf(float number) {
		super(number);
	}

	@Override
	public void addChild(Component c) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public void removeChild(Component c) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public List<Component> getChilds() {
		return null;
	}
	
	@Override
	public float Sum()
	{
		return this.number;
	}
}
