
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.ChiTietPhieuNhap" %>
<%@ page import="model.ChiTietPhieuXuat" %>
<%@ page import="model.PhieuNhap" %>
<%@ page import="model.PhieuXuat" %>
<%@ page import="java.util.List" %>
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
    List<ChiTietPhieuNhap> listChiTietPhieuNhap = (ArrayList<ChiTietPhieuNhap>) request.getAttribute("listChiTietPhieuNhap");

    int total = 0;
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

<section id="cart" class="phan-doan-p1">
    <table width="100%">
        <thead>
        <tr>
            <td>Phiếu nhập</td>
            <td>Ngày</td>
            <td>Đơn đặt hàng</td>
            <td>Nhân viên</td>
            <td>Số lượng</td>
            <td>Đơn giá</td>
            <td>Kho</td>

        </tr>
        </thead>
        <tbody>
        <% if(listChiTietPhieuNhap != null) {%>
        <% for(ChiTietPhieuNhap ctpn : listChiTietPhieuNhap) {
        %>
        <tr>
            <td><%= ctpn.getId_phieu_nhap() %></td>
            <td><%= ctpn.getNgay() %></td>
            <td id="price1"><%= ctpn.getId_don_dat_hang() %></td>
            <td><%= ctpn.getId_nhan_vien() %></td>
            <td ><%= ctpn.getSo_luong() %></td>
            <td><%= ctpn.getDon_gia() %></td>
            <td id="total1"><%= ctpn.getId_kho() %></td>

        </tr>
        <script src="cart.js"></script>
        <% } } %>
        </tbody>
    </table>
</section>

<section id="cart-add" class="phan-doan-p1">
    <div id="subtotal">
        <button class="normal">Thêm</button>
        <button class="normal">Sửa</button>
        <button class="normal">Xoá</button>
    </div>
</section>


<script src="script.js"></script>
</body>

<script>

</script>

</html>
