import java.util.List;

import javax.naming.OperationNotSupportedException;

public abstract class Component {

	protected float number;
	
	public abstract void addChild(Component c) throws OperationNotSupportedException;
	
	public abstract void removeChild(Component c) throws OperationNotSupportedException;
	
	public abstract List<Component> getChilds();
	
	public abstract float Sum();
		
	public Component(float number) {
		this.number = number;
	}	
	
	protected Boolean amIEven() {
		return (number % 2 == 0);
	}
}
