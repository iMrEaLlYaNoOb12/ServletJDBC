<!--
	Scripting tags - SCRIPLET,EXPRESSION,DECLARATION
	Directive tags - PAGE, INCLUDE, TAGLIB
 -->

<%@page import="java.time.LocalDate"%>
<h1>Welcome to JSP programming</h1>
<%
    String name = request.getParameter("uname");
    out.println("<h1>java code written here...</h1>" + "<h1>" + name + "</h1>");
    String path = application.getRealPath("views/first.jsp");
   
     out.println(path);
    met();
    out.println(name2);
    LocalDate date = LocalDate.now();
    %>
<h1>
	<%=request.getParameter("uname")%>
</h1>
<%=name2%>
<%!String name2 = "hello world";

	public void met() {
		System.out.println("met method called...");
	}%>