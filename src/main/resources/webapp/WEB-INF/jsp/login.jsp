<%--<%@ taglib prefix="form" url="http://www.springframerwork.org/tags/form"%>--%>


<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h2>Login Page</h2>
<form th:action="@{/login}" method="post">
    <div>
        <label>Username:</label>
        <input type="text" name="username"/>
    </div>
    <div>
        <label>Password:</label>
        <input type="password" name="password"/>
    </div>
    <div>
        <input type="submit" value="Log in"/>
    </div>
</form>
</body>
</html>
