package controller;

import dao.NhanVienDAO;
import dao.PhieuNhapDAO;
import dao.PhieuXuatDAO;
import dao.VatTuDAO;
import model.PhieuNhap;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CartController", value = "/cart")
public class CartController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_chi_nhanh = request.getParameter("id_chi_nhanh");
        PhieuNhapDAO phieuNhapDAO = new PhieuNhapDAO();
        PhieuXuatDAO phieuXuatDAO = new PhieuXuatDAO();
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        request.setAttribute("phieu_nhap_list", phieuNhapDAO.getAllPhieuNhap());
        request.setAttribute("phieu_xuat_list", phieuXuatDAO.getAllPhieuXuat());
        request.setAttribute("nhan_vien_list", nhanVienDAO.getAllNhanVien());

        request.getRequestDispatcher("/cart.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
