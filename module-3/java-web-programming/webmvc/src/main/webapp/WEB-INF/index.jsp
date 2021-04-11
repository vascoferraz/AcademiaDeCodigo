<%--
<html>
<head></head>
<body>
<h2>Welcome: ${user.name}</h2>
<p>Email: ${user.email}</p>
</body>
</html>--%>


<html>
<head></head>
<body>


<form action="" method="get" class="form-example">


    <div>
    <label for="name">Name (4 to 8 characters):</label>
    <input type="text" id="name" name="name" required
           minlength="4" maxlength="8" size="10">
    </div>

    <br>

    <div>
    <label for="email">Email:</label>
    <input type="email" id="email"
           pattern=".+@globex.com" size="30" required>
    </div>

    <br>

    <div class="form-example">
        <input type="submit" value="Register">
    </div>


<br>
<h2>Welcome: ${user.name}</h2>
<br>
<p>Email: ${user.email}</p>





</form>




</body>
</html>