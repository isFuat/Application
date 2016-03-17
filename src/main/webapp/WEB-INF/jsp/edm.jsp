<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Department and Meeting Management</title>

</head>
<body>


<!--<table>
<td> -->
<h1>Employee, Department and Meeting Data</h1>

<form:form action="edm.do" method="POST" commandName="edm">
	
	<table>
	
		
		<tr> 
			<td>First Name</td>
			<td>><form:input path="firstname"/></td>
		</tr>
		<tr> 
			<td>Last Name</td>
			<td>><form:input path="lastname"/></td>
		</tr>
		<tr> 
			<td>Salary</td>
			<td>><form:input path="salary"/></td>
		</tr>
		<tr> 
			<td>Department Name</td>
			<td>><form:input path="d_name"/></td>
		</tr>
		<tr> 
			<td>Department Description</td>
			<td>><form:input path="d_description"/></td>
		</tr>
		<tr> 
			<td>Meeting Name</td>
			<td>><form:input path="m_name"/></td>
		</tr>
		<tr> 
			<td>Meeting Description</td>
			<td>><form:input path="m_description"/></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	
	</table>
	
	
</form:form>
	
<br>

<table border="1">
	
	<th>First name</th>
	<th> Last name</th>
	<th>Salary</th>
	<th>Dept. name</th>
	<th>Dept. Desc.</th>
	<th>Meeting name</th>
	<th>Meeting Desc.</th>
	<c:forEach items="${edmList}" var="edm">
		<tr>
			
			<td>${edm.firstname }</td>
			<td>${edm.lastname }</td>
			<td>${edm.salary }</td>
			<td>${edm.d_name }</td>
			<td>${edm.d_description }</td>
		
			
			<td>${edm.m_name }</td>
			<td>${edm.m_description }</td>
		</tr>
		
	</c:forEach>
	
</table>








<!--  </td>
</table> -->



</body>
</html>