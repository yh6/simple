package si.mp.le.common;

import org.springframework.stereotype.Component;

@Component
public class DBCon {
	
	public String getConnection() {
		return "db접속 완료";
	}
}
