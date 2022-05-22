package controller;

import dao.ChiNhanhDAO;
import dao.NhanVienDAO;
import model.NhanVien;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_chi_nhanh = request.getParameter("id_chi_nhanh");
        String so_dt = request.getParameter("so_dt");
        ChiNhanhDAO chiNhanhDAO = new ChiNhanhDAO();


        if (ChiNhanhDAO.checkChiNhanh(id_chi_nhanh, so_dt) == true) {
            HttpSession session = request.getSession();
            session.setAttribute("id_chi_nhanh", id_chi_nhanh);
            System.out.println("id_chi_nhanh: " + id_chi_nhanh);
            response.sendRedirect("index.jsp");

        }
        else {
            response.sendRedirect("login.jsp");
        }
    }
}
