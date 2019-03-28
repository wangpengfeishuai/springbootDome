package cn.dream.entity;

public class ReadInforDTO {
	private String name;
	private String age;
	private String addr;
	private char sex;
	private String hight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getHight() {
		return hight;
	}
	public void setHight(String hight) {
		this.hight = hight;
	}
	@Override
	public String toString() {
		return "ReadInforDTO [name=" + name + ", age=" + age + ", addr=" + addr + ", sex=" + sex + ", hight=" + hight
				+ "]";
	}
	public ReadInforDTO() {
		super();
	}
	public ReadInforDTO(String name, String age, String addr, char sex, String hight) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.sex = sex;
		this.hight = hight;
	}
	
}
