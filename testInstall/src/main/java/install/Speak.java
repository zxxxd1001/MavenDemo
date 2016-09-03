package install;
import com.my.model.HelloWorld;
public class Speak{
	public String sayHi(){
		return new HelloWorld().sayHello();
	}
}