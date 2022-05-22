package dao;

import model.ChiTietPhieuNhap;
import model.ChiTietPhieuXuat;
import model.PhieuNhap;
import model.PhieuXuat;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PhieuXuatDAO extends DBConnection{
    public List<PhieuXuat> getAllPhieuXuat() {
        List<PhieuXuat> list = new ArrayList<>();
        String sql = "SELECT * FROM phieu_xuat";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuXuat phieuXuat = new PhieuXuat();
                phieuXuat.setId_phieu_xuat(rs.getString("id_phieu_xuat"));
                phieuXuat.setNgay(rs.getString("ngay"));
                phieuXuat.setTen_khach_hang(rs.getString("ten_khach_hang"));
                phieuXuat.setId_nhan_vien(rs.getInt("id_nhan_vien"));
                phieuXuat.setId_kho(rs.getString("id_kho"));

                list.add(phieuXuat);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<ChiTietPhieuXuat> getChiTietPhieuXuatByID(String id_chi_nhanh) {
        List<ChiTietPhieuXuat> list = null;
        String sql = " SELECT * FROM chi_tiet_phieu_xuat where id_phieu_xuat in (SELECT id_phieu_xuat FROM phieu_xuat WHERE id_kho = (select id_kho from kho where id_chi_nhanh= ?) and id_nhan_vien in (select id_nhan_vien from nhan_vien where id_chi_nhanh = ?))";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_chi_nhanh);
            ps.setString(2, id_chi_nhanh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietPhieuXuat chiTietPhieuXuat = new ChiTietPhieuXuat();
                chiTietPhieuXuat.setId_phieu_xuat(rs.getString("id_phieu_xuat"));
                chiTietPhieuXuat.setSo_luong(rs.getInt("so_luong"));
                chiTietPhieuXuat.setDon_gia(rs.getInt("don_gia"));
                chiTietPhieuXuat.setId_vat_tu(rs.getString("id_vat_tu"));

                list.add(chiTietPhieuXuat);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<PhieuXuat> getPhieuXuatByID(String id_phieu_xuat) {
        List<PhieuXuat> list = new ArrayList<>();
        String sql = "SELECT * FROM phieu_xuat WHERE id_phieu_xuat = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_phieu_xuat);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuXuat phieuXuat = new PhieuXuat();
                phieuXuat.setId_phieu_xuat(rs.getString("id_phieu_xuat"));
                phieuXuat.setNgay(rs.getString("ngay"));
                phieuXuat.setTen_khach_hang(rs.getString("ten_khach_hang"));
                phieuXuat.setId_nhan_vien(rs.getInt("id_nhan_vien"));
                phieuXuat.setId_kho(rs.getString("id_kho"));

                list.add(phieuXuat);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
