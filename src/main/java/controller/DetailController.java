package controller;

import dao.ChiTietPhieuNhapDAO;
import dao.ChiTietPhieuXuatDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetailController", value = "/detailpn")
public class DetailController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_phieu_nhap = request.getParameter("id_phieu_nhap");
        String id_phieu_xuat = request.getParameter("id_phieu_xuat");

        ChiTietPhieuNhapDAO chiTietPhieuNhapDAO = new ChiTietPhieuNhapDAO();
        ChiTietPhieuXuatDAO chiTietPhieuXuatDAO = new ChiTietPhieuXuatDAO();
        request.setAttribute("listChiTietPhieuNhap", chiTietPhieuNhapDAO.getChiTietPhieuNhapByID(id_phieu_nhap));
        request.setAttribute("listChiTietPhieuXuat", chiTietPhieuXuatDAO.getChiTietPhieuXuatByID(id_phieu_xuat));


        request.getRequestDispatcher("/detailpn.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
