package controller.member;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import model.DAO.MemberDAO;
import model.DTO.MemberDTO;

public class MemberJoinPage {
	public void memInsert(HttpServletRequest request) {
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		MemberDTO dto = new MemberDTO();
		
		dto.setMemId(request.getParameter("memId"));
		dto.setMemPw(request.getParameter("memPw"));
		dto.setMemAddress(request.getParameter("memAddress"));
		dto.setMemName(request.getParameter("memName"));
		dto.setMemPhone(request.getParameter("memPhone"));
		dto.setMemGender(request.getParameter("memGender"));
		dto.setMemAccount(request.getParameter("memAccount"));
		dto.setMemEmail(request.getParameter("memEmail"));
		dto.setMemEmailCk(request.getParameter("memEmailCk"));
		dto.setPostNumber(request.getParameter("postNumber"));
		dto.setDetailadd(request.getParameter("detailAdd"));
	
		String birth = request.getParameter("memBirth");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); // 생년월일 데이터 타입이 DATE라서 다른 방식으로 처리함.
		Date memBirth = null;
		
		try {
			memBirth= sf.parse(birth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dto.setMemBirth(memBirth);
		MemberDAO dao = new MemberDAO();
		dao.memInsert(dto);
	}
}
