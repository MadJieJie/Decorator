/**
 * @author Created by MadJieJie on 2017/4/21-21:38.
 * @brief
 * @attention
 */
public class ConcreteDecorator extends Decorator
{
	
	public ConcreteDecorator ( ConcreteComponent concreteComponent )
	{
		super(concreteComponent);
	}
	

	@Override
	protected void addProtect ()
	{
		super.Voltage5V();
		System.out.println("增加过流保护\n");
	}
	
	
}
