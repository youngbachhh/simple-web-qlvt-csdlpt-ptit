package dao;

import model.ChiTietPhieuNhap;
import model.ChiTietPhieuXuat;
import model.PhieuNhap;
import model.PhieuXuat;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiTietPhieuXuatDAO extends DBConnection{
    public List<ChiTietPhieuXuat> getAllChiTietPhieuXuat() {
        List<ChiTietPhieuXuat> list = null;
        String sql = "SELECT * FROM chi_tiet_phieu_xuat";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                ChiTietPhieuXuat chiTietPhieuXuat = new ChiTietPhieuXuat();
                chiTietPhieuXuat.setId_phieu_xuat(rs.getString("id_phieu_xuat"));
                chiTietPhieuXuat.setId_vat_tu(rs.getString("id_vat_tu"));
                chiTietPhieuXuat.setSo_luong(rs.getInt("so_luong"));
                chiTietPhieuXuat.setDon_gia(rs.getInt("don_gia"));
                list.add(chiTietPhieuXuat);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


    public List<ChiTietPhieuXuat> getChiTietPhieuXuatByID(String id_phieu_xuat) {
        List<ChiTietPhieuXuat> list = null;
        List<PhieuXuat> listPhieuXuat = new ArrayList<>(new PhieuXuatDAO().getPhieuXuatByID(id_phieu_xuat));
        String sql = "SELECT * FROM chi_tiet_phieu_xuat where id_phieu_xuat = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_phieu_xuat);
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                ChiTietPhieuXuat chiTietPhieuXuat = new ChiTietPhieuXuat();
                chiTietPhieuXuat.setId_phieu_xuat(rs.getString("id_phieu_xuat"));
                chiTietPhieuXuat.setNgay(listPhieuXuat.get(0).getNgay());
                chiTietPhieuXuat.setTen_khach_hang(listPhieuXuat.get(0).getTen_khach_hang());
                chiTietPhieuXuat.setId_kho(listPhieuXuat.get(0).getId_kho());
                chiTietPhieuXuat.setId_nhan_vien(listPhieuXuat.get(0).getId_nhan_vien());
                chiTietPhieuXuat.setId_vat_tu(rs.getString("id_vat_tu"));
                chiTietPhieuXuat.setSo_luong(rs.getInt("so_luong"));
                chiTietPhieuXuat.setDon_gia(rs.getInt("don_gia"));
                list.add(chiTietPhieuXuat);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
