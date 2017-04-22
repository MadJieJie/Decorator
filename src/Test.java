import java.io.OutputStreamWriter;
import java.io.StringBufferInputStream;

/**
 * @author Created by MadJieJie on 2017/4/21-21:40.
 * @brief
 * @attention
 */
public class Test
{
	
	public static void main ( String[] args )
	{
		ConcreteComponent component = new ConcreteComponent();
		ConcreteDecorator decorator = new ConcreteDecorator(component);
		decorator.addProtect();     //out add protect.
		
		component.Voltage5V();      //out not protect.
		testExceptionMethod();
	}
	
	private static void testMethod ()
	{
		StringBufferInputStream inputStream = new StringBufferInputStream("Test");
		inputStream.read();
		OutputStreamWriter writer = new OutputStreamWriter();
	}
	
}
