package controller.member;

import javax.servlet.http.HttpServletRequest;

import model.DAO.MemberDAO;

public class MemberListPage {
	public void memList(HttpServletRequest request) {
		String memId = request.getParameter("memId");
		MemberDAO dao = new MemberDAO();
		dao.memDetail(memId);
		
		
	}


}
