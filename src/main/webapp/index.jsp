
<%@ page import="java.util.List" %>
<%@ page import="dao.ChiNhanhDAO" %>
<%@ page import="model.ChiNhanh" %>
<%@ page import="dao.VatTuDAO" %>
<%@ page import="model.VatTu" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<%
    ChiNhanhDAO chiNhanhDAO = new ChiNhanhDAO();
    List<ChiNhanh> chiNhanhList = chiNhanhDAO.getAllChiNhanh();
    List<VatTu> vatTuList = new VatTuDAO().getAllVatTu();
%>


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


<section id="sanpham1" class="phan-doan-p1">
    <h2>Các chi nhánh</h2>
    <div class="ngan-san-pham">
        <% for (ChiNhanh chiNhanh : chiNhanhList) {
            String id = chiNhanh.getId_chi_nhanh();%>
        <div class="san-pham" onclick="window.location.href='cart?id_chi_nhanh=<%= id %>';">
            <div class="mo-ta">
                <span><%= chiNhanh.getChi_nhanh() %></span>
                <h5><%= chiNhanh.getDia_chi() %></h5>
                <h4><%= chiNhanh.getSdt() %></h4>
            </div>
        </div>
        <% } %>
    </div>
</section>


<section id="cart" class="phan-doan-p1" style="height: 100%; margin-top: 400px;">
    <table width="100%">
        <thead>
        <tr>
            <td>ID vật tư</td>
            <td>Tên vật tư</td>
            <td>Đơn vị tính</td>
            <td>Số lượng tồn</td>
            <td>Giá</td>

        </tr>
        </thead>
        <tbody>
        <% if(vatTuList != null) {%>
        <% for(VatTu vt : vatTuList) {
        %>
        <tr>
            <td><%= vt.getId() %></td>
            <td><%= vt.getTen() %></td>
            <td><%= vt.getDon_vi_tinh() %></td>
            <td><%= vt.getSo_luong_ton() %></td>
            <td><%= vt.getGia() %></td>

        </tr>
        <script src="cart.js"></script>
        <% } } %>
        </tbody>
    </table>
</section>

<section id="cart-add" class="phan-doan-p1" >
    <div id="subtotal">
        <button class="normal">Thêm</button>
        <button class="normal">Sửa</button>
        <button class="normal">Xoá</button>
    </div>
</section>


</body>

<script>

</script>


</html>
