package si.mp.le.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodExcute {
	
	public static void main(String[] agrs) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("method/ioc.xml");
		
		Test t = (Test) ac.getBean("t");
		t.doWork();
	}

}
