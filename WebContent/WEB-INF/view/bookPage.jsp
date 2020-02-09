<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="KrishnaPrasad">
    <meta name="generator" content="v3.8.6">
    <title>My NoteBook</title>
    <!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <!-- Favicons -->
<meta name="theme-color" content="#563d8c">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
 <link href="${pageContext.request.contextPath}/resources/css/cover.css" rel="stylesheet">
  </head>
  <body class="text-center">
 <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
  </header>
<main role="main" class="inner cover">
<c:forEach var ="tempbookdata" items="${questin}">

<table width ="100%" border="1">

<tr>
<td width="30%"></td>
<td width="5%"></td>
<td width="50%"></td>
<td width="15%"></td>
</tr>	

<tr>
<td>
${tempbookdata.questin}
</td>
<td></td>
<td>
${tempbookdata.answer}
</td>
<td></td>
</tr>
</table>

</c:forEach>
</main>
<br>
<input type="button" onclick="window.location.href='showFormForAdd'" class="btn btn-primary">Add new note</input>
<br>
<input type="button" onclick="window.location.href='showDashBoard'" class="btn btn-primary">Dashboard</input>




<footer class="mastfoot mt-auto">
    <div class="inner">
      <p>Powerd By <a href="">Krishnapkk123</a>, by <a href="https://twitter.com/krishnapkk123">@kpkk</a>.</p>
    </div>
  </footer>
</div>

</body>

</html>