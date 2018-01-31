package si.mp.le.aop;

public class Print implements PrintSome {

	@Override
	public void hello() {
		System.out.println("난 print클래스의 hello메쏘드");

	}

}
