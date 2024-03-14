package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private String epass;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String epass) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epass = epass;
	}
	
	public Employee(String ename, String epass) {
		super();
		
		this.ename = ename;
		this.epass = epass;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEpass() {
		return epass;
	}
	public void setEpass(String epass) {
		this.epass = epass;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", epass=" + epass + "]";
	}

	

}
