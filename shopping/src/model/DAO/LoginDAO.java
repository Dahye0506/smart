package model.DAO;

import java.sql.SQLException;

import model.DTO.AuthInfo;

public class LoginDAO extends DataBaseInfo { // 맨날 같은거 쓰니까 DatabaseInfo만 만들어서 상속해서 사용한다.
   public AuthInfo login(String userId) {
      AuthInfo authInfo = null; // rs가 있을 때에만 객체가 생성될 수 있게 함.
       sql = " select MEM_ID user_id, MEM_PW user_pw, 1 grade from member where MEM_ID = ? " // 일반 회원 // 별칭 줌
            + "union"
            + " select EMP_USERID, EMP_PW, EMPLOYEE_ID from employees where EMP_USERID = ?"; // 관리자 회원
      getConnect();
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, userId);
         pstmt.setString(2, userId);
         rs = pstmt.executeQuery();
         if(rs.next()) {
            authInfo = new AuthInfo();
            authInfo.setGrade(rs.getString("grade")); // 별칭으로 받음
            authInfo.setUserId(rs.getString("user_id"));
            authInfo.setUserPw(rs.getString("user_pw"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return authInfo;
   }
   
}