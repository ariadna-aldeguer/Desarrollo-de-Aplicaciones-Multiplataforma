package Bean;

public class Departamentos {
	private int deptno;
	private String dnombre;
	private String loc;
	public Departamentos() {}
	
	public Departamentos(int deptno, String dnombre, String loc) {
		super();
		this.deptno = deptno;
		this.dnombre = dnombre;
		this.loc = loc;
	}
	
	public int getDeptno() { return deptno; }
	
	public void setDeptno(int deptno) { this.deptno = deptno; }
	
	public String getDnombre() { return dnombre; }
	
	public void setDnombre(String dnombre) { this.dnombre = dnombre; }
	
	public String getLoc() { return loc; }
	
	public void setLoc(String loc) { this.loc = loc;}
}