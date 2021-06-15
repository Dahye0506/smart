<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employee Form</title>
 
 <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery/jquery-3.2.1.js"></script>
    <script>
        $(function(){
            $("#frm").submit(function(){  
                if($("#empUserId").val().trim()==""){ 
                    alert("아이디를 입력하세요.");
                    $("#empUserId").focus();
                    return false;
                }
                if($("#empPw").val().trim()==""){
                    alert("비밀번호를 입력하세요.");
                    $("#empPw").focus();
                    return false;
                }
                if($("#empPwCon").val().trim()==""){
                    alert("비밀번호를 다시 확인하세요.")      
                    $("#empPwCon").focus();              
                    return false;
                }else{
                    if($("#empPwCon").val().trim() != $("#empPw").val().trim()){
                        alert("비밀번호가 일치하지 않습니다");
                        $("#empPw").val()="";
                        $("#empPwCon").val()="";
                        $("#empPw").focus();                         
                        return false;
                    }
                }
            }); 
        });
    </script>
</head>
<body>
<form action="empJoin.em" method="get" name="frm" id="frm">
<table border = 1 align = "center">
	<tr><td>사원번호</td>
		<td>
			<input type="text" name="employeeId" value="${empNo }"/>
			</td></tr>
	<tr><td>사원아이디</td>
		<td>
			<input type="text" name="empUserid" id="empUserId"/>
			</td></tr>
	<tr><td>비밀번호</td>
		<td>
			<input type="password" name="empPw" id="empPw"/>
		</td></tr>
	<tr><td>비밀번호 확인</td>
		<td>
			<input type="password" name="empPwCon" id="empPwCon"/>
		</td></tr>
	<tr><td>이름</td>
		<td>
			<input type="text" name="empName"/>
		</td></tr>
	<tr><td>입사일</td>
		<td>
			<input type="date" name="hireDate"/>
		</td></tr>
	<tr><td>직무</td>
		<td>
			<input type="text" name="jobId"/>
		</td></tr>
	<tr><td>연락처</td>
		<td>
			<input type="text" name="PhNumber" placeholder="010-1234-1234"/>
		</td></tr>
	<tr><td>사무실번호</td>
		<td>
			<input type="text" name="officeNumber" placeholder="02-1234-1234"/>
		</td></tr>
	<tr><td>이메일</td>
		<td>
			<input type="text" name="empEmail"/>
		</td></tr>
	<tr><td>주소</td>
		<td>
			<input type="text" name="empAddress"/>
		</td></tr>
	<tr><td colspan="2">
			<input type="submit" value="등록"/>
		</td></tr>	
</table>
</form>
</body>
</html>