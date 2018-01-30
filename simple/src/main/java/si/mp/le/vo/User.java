package si.mp.le.vo;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String uiName;
	private int uiAge;
	private String uiId;
	private String uiPwd;
	private int uiNo;
	private String address;

	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public int getUiAge() {
		return uiAge;
	}
	public void setUiAge(int uiAge) {
		this.uiAge = uiAge;
	}
	public String getUiId() {
		return uiId;
	}
	public void setUiId(String uiId) {
		this.uiId = uiId;
	}
	public String getUiPwd() {
		return uiPwd;
	}
	public void setUiPwd(String uiPwd) {
		this.uiPwd = uiPwd;
	}
	public int getUiNo() {
		return uiNo;
	}
	public void setUiNo(int uiNo) {
		this.uiNo = uiNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [uiName=" + uiName + ", uiAge=" + uiAge + ", uiId=" + uiId + ", uiPwd=" + uiPwd + ", uiNo=" + uiNo
				+ ", address=" + address + "]";
	}
	
	
	

}
