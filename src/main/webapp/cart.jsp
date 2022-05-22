
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.*" %>
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
        ArrayList<PhieuNhap> pnList = (ArrayList<PhieuNhap>) request.getAttribute("phieu_nhap_list");
        ArrayList<PhieuXuat> pxList = (ArrayList<PhieuXuat>) request.getAttribute("phieu_xuat_list");
        ArrayList<NhanVien> nvList = (ArrayList<NhanVien>) request.getAttribute("nhan_vien_list");
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
                    <td>Chi tiết</td>
                    <td>Phiếu nhập</td>
                    <td>Ngày</td>
                    <td>Đơn đặt hàng</td>
                    <td>Nhân viên</td>
                    <td>Kho</td>

                </tr>
            </thead>
            <tbody>
                <% if(pnList != null) {%>
                <% for(PhieuNhap pn : pnList) {
                %>
                <tr>
                    <td><a href="/detailpn?id_phieu_nhap=<%=pn.getId_phieu_nhap()%>"><i class="far fa-times-circle"></i></a></td>
                    <td><%= pn.getId_phieu_nhap() %></td>
                    <td><%= pn.getNgay() %></td>
                    <td id="price1"><%= pn.getId_don_dat_hang() %></td>
                    <td><%= pn.getId_nhan_vien() %></td>
                    <td id="total1"><%= pn.getId_kho() %></td>
                </tr>
                <script src="cart.js"></script>
                <% } } %>
            </tbody>
        </table>
    </section>


    <section id="cart" class="phan-doan-p1">
        <table width="100%">
            <thead>
            <tr>
                <td>Chi tiết</td>
                <td>Phiếu xuất</td>
                <td>Ngày</td>
                <td>Đơn xuất hàng</td>
                <td>Nhân viên</td>
                <td>Kho</td>

            </tr>
            </thead>
            <tbody>
            <% if(pxList != null) {%>
            <% for(PhieuXuat px : pxList) {
            %>
            <tr>
                <td><a href="/detailpx?id_phieu_xuat=<%=px.getId_phieu_xuat()%>"><i class="far fa-times-circle"></i></a></td>
                <td><%= px.getId_phieu_xuat() %></td>
                <td><%= px.getNgay() %></td>
                <td id="price2"><%= px.getId_phieu_xuat() %></td>
                <td><%= px.getId_nhan_vien() %></td>
                <td id="total2"><%= px.getId_kho() %></td>
            </tr>
            <script src="cart.js"></script>
            <% } } %>
            </tbody>
        </table>
    </section>

    <section id="cart" class="phan-doan-p1">
        <table width="100%">
            <thead>
            <tr>
                <td>ID Nhân viên</td>
                <td>Họ</td>
                <td>Tên</td>
                <td>Địa chỉ</td>
                <td>Ngày sinh</td>
                <td>Lương</td>

            </tr>
            </thead>
            <tbody>
            <% if(nvList != null) {%>
            <% for(NhanVien nv : nvList) {
            %>
            <tr>
                <td><%= nv.getId_nhan_vien() %></td>
                <td><%= nv.getHo() %></td>
                <td><%= nv.getTen() %></td>
                <td><%= nv.getDia_chi() %></td>
                <td><%= nv.getNgay_sinh() %></td>
                <td><%= nv.getLuong() %></td>
            </tr>
            <script src="cart.js"></script>
            <% } } %>
            </tbody>
        </table>
    </section>

    <section id="cart-add" class="phan-doan-p1">
        <div id="subtotal">
            <button class="normal">Thêm nhân viên</button>
            <button class="normal">Sửa</button>
            <button class="normal">Xoá</button>
        </div>
    </section>


    <script src="script.js"></script>
</body>

<script>

</script>

</html>
