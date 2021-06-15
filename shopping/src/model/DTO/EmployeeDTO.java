package model.DTO;

public class EmployeeDTO {
	//memberField 는 Database 내 컬럼명과 동일해야한다.
	//그래야만 DTO에 저장해서 이용가능
	String employeeId;
	String empUserid;
	String empPw;
	String empPwCon;
	String empName;
	String hireDate;
	String jobId;
	String PhNumber;
	String officeNumber;
	String empEmail;
	String empAddress;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpUserid() {
		return empUserid;
	}
	public void setEmpUserid(String empUserid) {
		this.empUserid = empUserid;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}
	public String getEmpPwCon() {
		return empPwCon;
	}
	public void setEmpPwCon(String empPwCon) {
		this.empPwCon = empPwCon;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getPhNumber() {
		return PhNumber;
	}
	public void setPhNumber(String phNumber) {
		PhNumber = phNumber;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
}
