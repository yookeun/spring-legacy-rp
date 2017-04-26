<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>	
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p>[READ]:: <a href="/repl/deleteAll" class="btn btn-danger">DELETE</a>&nbsp;<a href="/repl/insert" class="btn btn-primary">INSERT</a></p>
<table class="table">
	<thead>
		<tr>
			<th>id</th>
			<th>val1</th>
			<th>val2</th>
			<th>regdate</th>
			<th>moddate</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listR}" var="test">
		<tr>
			<td>${test.id}</td>
			<td>${test.val1}</td>
			<td>${test.val2}</td>
			<td>${test.regdate}</td>
			<td>${test.moddate}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<p>[WRITE]</p>
<table class="table">
	<thead>
		<tr>
			<th>id</th>
			<th>val1</th>
			<th>val2</th>
			<th>regdate</th>
			<th>moddate</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listW}" var="test">
		<tr>
			<td>${test.id}</td>
			<td>${test.val1}</td>
			<td>${test.val2}</td>
			<td>${test.regdate}</td>
			<td>${test.moddate}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>
