package controller.employee;

import javax.servlet.http.HttpServletRequest;

import model.DAO.EmployeeDAO;
import model.DTO.EmployeeDTO;

public class EmployeeJoinPage {
	public void empInsert(HttpServletRequest requset) {
		EmployeeDTO dto = new EmployeeDTO();
		
		dto.setEmployeeId(requset.getParameter("employeeId"));
		dto.setEmpUserid(requset.getParameter("empUserid"));
		dto.setEmpPw(requset.getParameter("empPw"));
		dto.setEmpName(requset.getParameter("empName"));
		dto.setHireDate(requset.getParameter("hireDate"));
		dto.setJobId(requset.getParameter("jobId"));
		dto.setPhNumber(requset.getParameter("PhNumber"));
		dto.setOfficeNumber(requset.getParameter("officeNumber"));
		dto.setEmpEmail(requset.getParameter("empEmail"));
		dto.setEmpAddress(requset.getParameter("empAddress"));
		
		EmployeeDAO dao = new EmployeeDAO();
		dao.empInsert(dto);
	}
}
