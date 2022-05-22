package controller;

import dao.ChiTietPhieuNhapDAO;
import dao.ChiTietPhieuXuatDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetailPXController", value = "/detailpx")
public class DetailPXController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_phieu_xuat = request.getParameter("id_phieu_xuat");

        ChiTietPhieuXuatDAO chiTietPhieuXuatDAO = new ChiTietPhieuXuatDAO();
        request.setAttribute("listChiTietPhieuXuat", chiTietPhieuXuatDAO.getChiTietPhieuXuatByID(id_phieu_xuat));


        request.getRequestDispatcher("/detailpx.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
