<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.sql.Connection,java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet,java.sql.SQLException,com.zubiri.football.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%
	Conn conn = new Conn();

	String text = "";
	if (request.getParameter("update") != null) {
		FootballMatch footballMatch = conn.selectMatch2(Integer.parseInt(request.getParameter("id")));
		text = "<title>Update a match</title></head><body><h1>Update a match</h1><form action='matches.jsp' method='POST'>"
				+ "<input type='hidden' value='" + request.getParameter("id") + "' name='id'>"
				+ "<label>Local team</label>&nbsp;&nbsp;<input type='text' value='" + footballMatch.getLocalTeam().getTeamName()
				+ "' name='local_team'><br>"
				+ "<label>Local goals</label>&nbsp;&nbsp;<input type='text' value='" + footballMatch.getGoalsLocal()
				+ "' name='local_goals'><br>"
				+ "<label>Visitor team</label>&nbsp;&nbsp;<input type='text' value='" + footballMatch.getVisitorTeam().getTeamName()
				+ "' name='visitor_team'><br>"
				+ "<label>Visitor goals</label>&nbsp;&nbsp;<input type='text' value='" + footballMatch.getGoalsVisitor()
				+ "' name='visitor_goals'><input type='submit' value='Update' name='update'>" + "</form>";
	}
	if (request.getParameter("delete") != null) {
		conn.deleteMatch(Integer.parseInt(request.getParameter("id")));
		response.sendRedirect("matches.jsp");
		//String site = new String("matches.jsp");
		//response.setStatus(response.SC_MOVED_TEMPORARILY);
		//response.setHeader("Location", site);
	}
	if (request.getParameter("insert") != null) {
		int maxID = conn.getMaxID();
		text = "<title>Insert a match</title></head><body><h1>Insert a match</h1><form action='matches.jsp' method='POST'><input type='hidden' name='id' value='"
				+ maxID + 1 + "'><label>Local team</label>&nbsp;&nbsp;<input type='text' name='local_team'><br>"
				+ "<label>Local goals</label>&nbsp;&nbsp;<input type='text' name='local_goals'><br>"
				+ "<label>Visitor team</label>&nbsp;&nbsp;<input type='text' name='visitor_team'><br>"
				+ "<label>Visitor goals</label>&nbsp;&nbsp;<input type='text' name='visitor_goals'><br>"
				+ "<input type='submit' value='Insert' name='insert'></form>";
	}
%>
<p><%=text%></p>
</body>
</html>