package si.mp.le;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import si.mp.le.user.service.UserSerivce;


public class Excute {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		
		UserSerivce us = (UserSerivce) ac.getBean("userSerivce");
		System.out.println(us.getUser());
	}
}