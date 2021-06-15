package controller.employee;

import javax.servlet.http.HttpServletRequest;

import model.DAO.EmployeeDAO;
import model.DTO.EmployeeDTO;

public class EmployeeInfoPage {
	public void empInfo(HttpServletRequest request) {
		String empId=request.getParameter("empId"); // 날려진 파라미터 값 ?뒤에
		EmployeeDAO dao=new EmployeeDAO();
		EmployeeDTO dto=dao.empInfo(empId); // 하나의 칼럼이 하나하나의 DTO라고 할 수 있다.
		request.setAttribute("emp", dto); // emp에 담아서 request로 날렸다. jsp에서 받을 값
	}
}
