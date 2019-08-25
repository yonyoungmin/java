<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date" %>
<</div>
<span class="border border-dark"></span>
<button type="button" class="close" aria-label="Close">
  <span aria-hidden="true">&times;</span>
</button>

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrao.min.css">
<title>Welcome</title>
</head>

<body>

	<%@ include file="menu.jsp" %>
	
	<%!String Greeting = "웹 쇼핑몰에 오신 것을 환영합니다";
	String tagline = "Welcome to Web Market!";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=Greeting%>
				<form>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<button type="button" class="btn btn-link">Link</button>
  <button type="button" class="btn btn-secondary float-left">Example Button floated left</button>
  <button type="button" class="btn btn-secondary float-right">Example Button floated right</button>
</div>
  <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/zpOULjyy-n8?rel=0" allowfullscreen></iframe>
</div>
			</h1>
		</div>
	<main role="main">
	<div class="container">
		<div class="text-center">
		<div class="alert alert-success" role="alert">

			<%@ page contentType="text/html; charset=utf-8"%>
			<%@ page import="java.util.Date"%>
			<h3>
				<%=tagline%>
			</h3>
			<%
				Date day = new java.util.Date();
				String am_pm;
				int hour = day.getHours();
				int minute = day.getMinutes();
				int second = day.getSeconds();
				if (hour / 12 == 0) {
					am_pm = "AM";
				} else {
					am_pm = "PM";
					hour = hour - 12;
				}
				String CT = hour + ":" + minute + ":" + second + " " + am_pm;
				out.println("현재 접속 시각: " + CT + "\n");
			%>
<nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">Next</a></li>
  </ul>
</nav>
      </a>
    </li>
  </ul>
</nav>
			
		</div>
		<hr>
	</div>
	</main>
	<%@ include file="footer.jsp" %>
</body>
</html>
