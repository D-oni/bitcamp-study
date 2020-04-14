<%@page import="com.eomcs.lms.domain.Member"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<jsp:include page="/header.jsp"/>

  <h1>회원 검색 결과(JSP + EL)</h1>
  <table border='1'>
  <tr>
    <th>번호</th>
    <th>이름</th>
    <th>이메일</th>
    <th>전화</th>
    <th>등록일</th>
  </tr>

<jsp:useBean id="list" 
  type="java.util.List<Member>"
  class="java.util.ArrayList"
  scope="request"/>
<% 
  for(Member item : list) {
    pageContext.setAttribute("item", item);
%>
  <tr>
    <td>${item.no}</td> 
    <td><a href='detail?no=${item.no}'>${item.name}</a></td> 
    <td>${item.email}</td> 
    <td>${item.tel}</td>
    <td>${item.registeredDate}</td>
  </tr>
<%
  }
%>
  </table>

<jsp:include page="/footer.jsp"/>
    