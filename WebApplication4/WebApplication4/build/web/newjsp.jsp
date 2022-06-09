

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <label for="fname">screen name:</label>
  <input type="text" id="name" name="fname"><br><br>
        <%
            client.NewClient srv1 = new client.NewClient();
            String Str =  srv1.getAllTweets();
            out.println(Str);
       %>
           <%
            client.NewClient srv2 = new client.NewClient();
            String Str2 =  srv2.getAllUsers();
            out.println(Str2);
       %>    <%
            client.NewClient srv3 = new client.NewClient();
            String Str3 = srv3.getbyname("TwitterDev");
            out.println(Str3);
       %>    <%
            client.NewClient srv4 = new client.NewClient();
            String Str4 =  srv4.getbyid();
            out.println(Str4);
       %>
    </body>
</html>
