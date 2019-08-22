<html>
<head>
<link rel = "stylesheet"
    href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrao.min.css">
<title>Welcome</title>    
</head>

<body>
    <nav class = "navbar navbar-expand navbar-dark dg-dark">
         <div class = "container">
              <div class = "navbar-header">
                   <a class = "navbar-brand" href=" ./welcome.jsp">Home</a>          
            </div>
       </div>
</nav> 
<%! String Greeting = "Welcome to Web Shopping Mall";
String tagline = "Welcome to Web Market!";%>
<div class = "jumbotron">
    <div class = "container">
         <h1 class = "display-3">
              <%= Greeting %>
         </h1>
    </div>
</div>
<main role = "main">
<div class = "container">
    <div class = "text-center">
         <h3>
              <%= tagline %>
         </h3>
   </div>
   <hr>
</div>
</main>
     <footer class = "container">
         <p>&copy; WebMarket</p>
     </footer>
</body>
</html>         