<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login.</title>
    </head>
    <body>
        <h4>User Login.</h4>
        <form:form method="post"  name="loginForm"  commandName="loginmodel">
            <table>
                <tr><td>User Name: </td><td><input name="accountnum" type="text"></td></tr>
                <tr><td>Password: </td><td><input name="pin" type="password"></td></tr>
                <tr><td colspan="2" align="right"><input type="submit" value="Submit"></td></tr>
            </table>
            <div style="color:red">${error}</div>
        </form:form>
 
    </body>
</html>