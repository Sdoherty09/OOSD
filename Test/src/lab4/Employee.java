package lab4;

public class Employee {
	private String fName;
	private String lName;
	private static int nextStaffNumber=1000;
	private int employeeNumber;
	private String empType;
	private String comCarType;
	public Employee(String fName, String lName, String empType) {
		setfName(fName);
		setlName(lName);
		setEmployeeNumber(nextStaffNumber);
		nextStaffNumber++;
		setEmpType(empType);
	}
	public Employee(String fName, String lName, String empType, String comCarType) {
		setfName(fName);
		setlName(lName);
		setEmployeeNumber(nextStaffNumber);
		nextStaffNumber++;
		setEmpType(empType);
		setComCarType(comCarType);
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getComCarType() {
		return comCarType;
	}
	public void setComCarType(String comCarType) {
		this.comCarType = comCarType;
	}
	@Override
	public String toString() {
		if(empType.equalsIgnoreCase("manager"))
		{
			return "Employee [fName=" + fName + ", lName=" + lName + ", employeeNumber=" + employeeNumber + ", empType="
					+ empType + ", comCarType=" + comCarType + "]";
		}
		else
		{
			return "Employee [fName=" + fName + ", lName=" + lName + ", employeeNumber=" + employeeNumber + ", empType="
					+ empType + ", comCarType=" + "]";
		}
	}
	
}
