/**
 * @author Created by MadJieJie on 2017/1/30-10:13.
 * @brief
 * @attention
 */
public abstract class Decorator extends ConcreteComponent
{
	private ConcreteComponent mConcreteComponent;
	
	public Decorator ( ConcreteComponent concreteComponent )
	{
		mConcreteComponent = concreteComponent;
	}
	
	protected abstract void addProtect ();
	
}
