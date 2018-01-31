package si.mp.le.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Excute {
	
	public static void main(String[] agrs) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("emp/ioc.xml");
		EmpDAO ed = (EmpDAO) ac.getBean("edao");
		ed.test();
		System.out.println(ed.selectEmpList());
		System.out.println(ed.selectEmp(1));
		//System.out.println(ed.insertEmp("청길동", 250));
		
		System.out.println(ed.deleteEmp(4));
		
		System.out.println(ed.updateEmp("청길동", 350, 3));
		System.out.println(ed.selectEmpList());
	}
	
}
