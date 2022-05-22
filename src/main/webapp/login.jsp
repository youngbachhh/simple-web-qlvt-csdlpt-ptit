<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" />
  <title>Ecommerce Website</title>
  <link rel="stylesheet" href="style.css">
</head>

<body>

<section id="dautrang">

  <div>
    <ul id="thanh-dieu-huong">
      <% if (session.getAttribute("id_chi_nhanh") == null) { %>
      <li><a href="login.jsp">Đăng nhập</a></li>
      <% }else{  %>
      <li><a href="/logout">Đăng xuất</a></li>
      <% } %>
    </ul>
  </div>
</section>

<section id="home">
  <div class="max-width">
    <div class="home-content">
    </div>
    <div class="home-login">
      <div class="wrapper">
        <h1>Đăng nhập</h1>
        <form action="/login" method="post">
          <input type="text" name="id_chi_nhanh" placeholder="ID Chi nhánh"><br>
          <input type="password" name="so_dt" placeholder="Mật khẩu"><br>
          <input type="submit" class="but" value="Đăng nhập" >
        </form>
      </div>
    </div>
  </div>
</section>
</body>
</html>