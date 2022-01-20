package gcloud.kdt.korea;


//JavaBean, ~DTO, ~VO : 데이터베이스의 테이블고 1:1 로 매핑됨
//@Getter, @Setter : 스프링에서 배우게 됨
class DefaultClass {
	
	private int temp=10;
	private int temp1=10;
	private int temp2=10;
	private int temp3=10;
	private int temp4=10;
	private int temp5=10;
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getTemp1() {
		return temp1;
	}
	public void setTemp1(int temp1) {
		this.temp1 = temp1;
	}
	public int getTemp2() {
		return temp2;
	}
	public void setTemp2(int temp2) {
		this.temp2 = temp2;
	}
	public int getTemp3() {
		return temp3;
	}
	public void setTemp3(int temp3) {
		this.temp3 = temp3;
	}
	public int getTemp4() {
		return temp4;
	}
	public void setTemp4(int temp4) {
		this.temp4 = temp4;
	}
	public int getTemp5() {
		return temp5;
	}
	public void setTemp5(int temp5) {
		this.temp5 = temp5;
	}
	
	@Override
	public String toString() {
		return "DefaultClass [temp=" + temp + ", temp1=" + temp1 + ", temp2=" + temp2 + ", temp3=" + temp3 + ", temp4="
				+ temp4 + ", temp5=" + temp5 + "]";
	}
	
    

}
