<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenue à votre session:</h1>
<% if (request.getParameter("nom").equals("")) { %>
  <jsp:useBean id="nameBean" type="modeles.AuthentificationBean" scope="session" />
  <h2>Prénom:
    <jsp:getProperty property="prenom" name="nameBean" />
  </h2>
  <h2>Nom:
    <jsp:getProperty property="nom" name="nameBean" />
  </h2>
<% } else { %>
  <h2>Prénom:
    <%= request.getParameter("prenom") %>
  </h2>
  <h2>Nom:
    <%= request.getParameter("nom") %>
    
  </h2>
<% } %>
</body>
</html>
