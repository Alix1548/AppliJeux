<%--
  Created by IntelliJ IDEA.
  User: alix
  Date: 12/11/2019
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="login" method="POST">

  <div>
    <label for="username">Username:</label><br>
    <input type="text" id="username" name="username">
  </div><br>

  <div>
    <label for="pass">Password (8 characters minimum):</label><br>
    <input type="password" id="pass" name="password"
           minlength="8" required>
  </div><br>

  <input type="submit" value="Sign in">

</form>
</body>
</html>

