<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.MemberBean" %>
    <% System.out.println("home/welcome.jsp진입"); %>
<div id="welcome">
<%
MemberBean user = (MemberBean)session.getAttribute("user");
	%>
	 <%=user.getName() %> 님 환영합니다
	 <a href="member.do?cmd=logout">로그아웃</a>
	<%
%>
</div>