package egovframework.lab.com.vo;

public class Department {
	
	private String deptid;
	private String deptname;
	private String superdeptid;
	private String superdeptname;
	private String depth;
	private String description;
	
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getSuperdeptid() {
		return superdeptid;
	}
	public void setSuperdeptid(String superdeptid) {
		this.superdeptid = superdeptid;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	public String getSuperdeptname() {
		return superdeptname;
	}
	public void setSuperdeptname(String superdeptname) {
		this.superdeptname = superdeptname;
	}	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}	
}
