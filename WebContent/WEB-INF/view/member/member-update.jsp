<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.MemberBean" %>
<div id="member-detail">
<h1>비밀번호 수정</h1>
<%
MemberBean user = (MemberBean)session.getAttribute("user");
%>
<table>
	<tr>
		<th>\</th>
		<th>내용</th>
	</tr>
	<tr>
		<td>ID</td>
		<td><%=user.getId() %></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%=user.getName() %></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td>
		현재 비밀번호 <input type="password" name="currPass"></input>
		수정할 비밀번호 <input type="password" name="changePass"/>
		</td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td><%=user.getSsn() %></td>
	</tr>
</table>
</div>