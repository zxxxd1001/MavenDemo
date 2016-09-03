package install;
import org.junit.*;
import org.junit.Assert.*;

public class TestSpeak{
	@Test
	public void testHi(){
		Assert.assertEquals("Hello,World!",new Speak().sayHi());
	}
}