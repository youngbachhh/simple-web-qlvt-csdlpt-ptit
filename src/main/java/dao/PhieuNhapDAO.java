package dao;

import model.ChiTietPhieuNhap;
import model.PhieuNhap;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PhieuNhapDAO extends DBConnection{

    public List<PhieuNhap> getAllPhieuNhap() {
        List<PhieuNhap> list = new ArrayList<>();
        String sql = "SELECT * FROM phieu_nhap";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhap phieuNhap = new PhieuNhap();
                phieuNhap.setId_phieu_nhap(rs.getString("id_phieu_nhap"));
                phieuNhap.setNgay(rs.getString("ngay"));
                phieuNhap.setId_don_dat_hang(rs.getString("id_don_dat_hang"));
                phieuNhap.setId_nhan_vien(rs.getInt("id_nhan_vien"));
                phieuNhap.setId_kho(rs.getString("id_kho"));

                list.add(phieuNhap);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<ChiTietPhieuNhap> getChiTietPhieuNhapByID(String id_chi_nhanh) {
        List<ChiTietPhieuNhap> list = null;
        String sql = " SELECT * FROM chi_tiet_phieu_nhap where id_phieu_nhap in (SELECT id_phieu_nhap FROM phieu_nhap WHERE id_kho = (select id_kho from kho where id_chi_nhanh= ?) and id_nhan_vien in (select id_nhan_vien from nhan_vien where id_chi_nhanh = ?))";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_chi_nhanh);
            ps.setString(2, id_chi_nhanh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap();
                chiTietPhieuNhap.setId_phieu_nhap(rs.getString("id_phieu_nhap"));
                chiTietPhieuNhap.setId_vat_tu(rs.getString("id_vat_tu"));
                chiTietPhieuNhap.setSo_luong(rs.getInt("so_luong"));
                chiTietPhieuNhap.setDon_gia(rs.getInt("don_gia"));

                list.add(chiTietPhieuNhap);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<PhieuNhap> getPhieuNhapByID(String id_phieu_nhap) {
        List<PhieuNhap> list = new ArrayList<>();
        String sql = "SELECT * FROM phieu_nhap WHERE id_phieu_nhap = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_phieu_nhap);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhap phieuNhap = new PhieuNhap();
                phieuNhap.setId_phieu_nhap(rs.getString("id_phieu_nhap"));
                phieuNhap.setNgay(rs.getString("ngay"));
                phieuNhap.setId_don_dat_hang(rs.getString("id_don_dat_hang"));
                phieuNhap.setId_nhan_vien(rs.getInt("id_nhan_vien"));
                phieuNhap.setId_kho(rs.getString("id_kho"));

                list.add(phieuNhap);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<PhieuNhap> getPhieuNhapByIDChiNhanh(String id_chi_nhanh) {
        List<PhieuNhap> list = new ArrayList<>();
        String sql = "SELECT * FROM phieu_nhap WHERE id_chi_nhanh = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id_chi_nhanh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhap phieuNhap = new PhieuNhap();
                phieuNhap.setId_phieu_nhap(rs.getString("id_phieu_nhap"));
                phieuNhap.setNgay(rs.getString("ngay"));
                phieuNhap.setId_don_dat_hang(rs.getString("id_don_dat_hang"));
                phieuNhap.setId_nhan_vien(rs.getInt("id_nhan_vien"));
                phieuNhap.setId_kho(rs.getString("id_kho"));

                list.add(phieuNhap);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


}
