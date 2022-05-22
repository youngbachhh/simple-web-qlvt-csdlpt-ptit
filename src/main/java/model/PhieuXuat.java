package model;

public class PhieuXuat {
    private String id_phieu_xuat;
    private String ngay;
    private String ten_khach_hang;
    private int id_nhan_vien;
    private String id_kho;

    public PhieuXuat() {
    }

    public PhieuXuat(String id_phieu_xuat, String ngay, String ten_khach_hang, int id_nhan_vien, String id_kho) {
        this.id_phieu_xuat = id_phieu_xuat;
        this.ngay = ngay;
        this.ten_khach_hang = ten_khach_hang;
        this.id_nhan_vien = id_nhan_vien;
        this.id_kho = id_kho;
    }

    public String getId_phieu_xuat() {
        return id_phieu_xuat;
    }

    public void setId_phieu_xuat(String id_phieu_xuat) {
        this.id_phieu_xuat = id_phieu_xuat;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTen_khach_hang() {
        return ten_khach_hang;
    }

    public void setTen_khach_hang(String ten_khach_hang) {
        this.ten_khach_hang = ten_khach_hang;
    }

    public int getId_nhan_vien() {
        return id_nhan_vien;
    }

    public void setId_nhan_vien(int id_nhan_vien) {
        this.id_nhan_vien = id_nhan_vien;
    }

    public String getId_kho() {
        return id_kho;
    }

    public void setId_kho(String id_kho) {
        this.id_kho = id_kho;
    }
}
