
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
    List<ChiTietPhieuXuat> listChiTietPhieuXuat = (ArrayList<ChiTietPhieuXuat>) request.getAttribute("listChiTietPhieuXuat");

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
            <td>Phiếu xuất</td>
            <td>Ngày</td>
            <td>Tên khách hàng</td>
            <td>Nhân viên</td>
            <td>Số lượng</td>
            <td>Đơn giá</td>
            <td>Kho</td>

        </tr>
        </thead>
        <tbody>
        <% if(listChiTietPhieuXuat != null) {%>
        <% for(ChiTietPhieuXuat ctpx : listChiTietPhieuXuat) {
        %>
        <tr>
            <td><%= ctpx.getId_phieu_xuat() %></td>
            <td><%= ctpx.getNgay() %></td>
            <td id="price1"><%= ctpx.getTen_khach_hang() %></td>
            <td><%= ctpx.getId_nhan_vien() %></td>
            <td ><%= ctpx.getSo_luong() %></td>
            <td><%= ctpx.getDon_gia() %></td>
            <td id="total1"><%= ctpx.getId_kho() %></td>

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
