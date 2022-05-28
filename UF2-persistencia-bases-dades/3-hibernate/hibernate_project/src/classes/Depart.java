package classes;
// Generated Apr 2, 2022, 8:31:41 PM by Hibernate Tools 5.6.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Depart generated by hbm2java
 */
public class Depart implements java.io.Serializable {

	private int deptNo;
	private String dnombre;
	private String loc;
	private Set emples = new HashSet(0);

	public Depart() {
	}

	public Depart(int deptNo) {
		this.deptNo = deptNo;
	}

	public Depart(int deptNo, String dnombre, String loc, Set emples) {
		this.deptNo = deptNo;
		this.dnombre = dnombre;
		this.loc = loc;
		this.emples = emples;
	}

	public int getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDnombre() {
		return this.dnombre;
	}

	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set getEmples() {
		return this.emples;
	}

	public void setEmples(Set emples) {
		this.emples = emples;
	}

}
