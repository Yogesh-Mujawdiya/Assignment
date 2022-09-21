<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Login Page</title>
  </head>
  <body>
    <header>
      <h1>Dairy Management System</h1>
    </header>
    <form method="post" action="/Login">
      <h1>Welcome Back :)</h1>
        <input
          placeholder="Username"
          type="text"
          name="username"
          required="true"
        />
          <input
            class="form-control"
            placeholder="Password"
            type="password"
            name="password"
            required="true"
          />
<button class="btn btn-warning btn-block" type="submit" name="login">
        Login
      </button>
      <p class="font-14 text-center mt-15">Having trouble logging in?</p>
    </form>
  </body>
</html>
