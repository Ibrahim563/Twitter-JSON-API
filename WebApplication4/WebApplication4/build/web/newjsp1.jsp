<%-- 
    Document   : newjsp1
    Created on : Jan 16, 2022, 1:41:48 PM
    Author     : M-N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        <label >screen name:</label>
  <input type="text" id="name" ><br><br>
   <%
            client.NewClient1 srv1 = new client.NewClient1();
            String Str =  srv1.getAllTweets();
            out.println(Str);
       %>
           <%
            client.NewClient1 srv2 = new client.NewClient1();
            String Str2 =  srv2.getAllUsers();
            out.println(Str2);
       %> 
       <%
            client.NewClient1 srv4 = new client.NewClient1();
            String Str4 =  srv4.getbyid();
            out.println(Str4);
       %>
         <%
             String data = (String)request.getParameter("name");
             
   //VS
         
            client.NewClient1 srv3 = new client.NewClient1();
            String Str3 = srv3.getbyname("TwitterDev");
            out.println(Str3);
            //TwitterDev
       %> 
    </body>
</html>
