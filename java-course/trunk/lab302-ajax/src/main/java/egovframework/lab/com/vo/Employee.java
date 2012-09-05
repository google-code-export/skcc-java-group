package egovframework.lab.com.vo;

public class Employee {
	
	private String employeeid;
	private String name;	
	private int age;
	private String departmentid;
	private String password;
	private String email;
	private String superdeptid;
	private String ihidnum1;
	private String ihidnum2;
	
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSuperdeptid() {
		return superdeptid;
	}
	public void setSuperdeptid(String superdeptid) {
		this.superdeptid = superdeptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIhidnum() {
		return ihidnum1+ihidnum2;
	}
	/*
	public void setIhidnum(String ihidnum) {
		this.ihidnum = ihidnum;
	}
	*/
	public String getIhidnum1() {		
		return ihidnum1;
	}
	public void setIhidnum1(String ihidnum1) {
		this.ihidnum1 = ihidnum1;
	}
	public String getIhidnum2() {
		return ihidnum2;
	}
	public void setIhidnum2(String ihidnum2) {
		this.ihidnum2 = ihidnum2;
	}
	
}
