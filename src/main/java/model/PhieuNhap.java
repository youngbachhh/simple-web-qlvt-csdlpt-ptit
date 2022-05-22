package model;

public class PhieuNhap {
    private String id_phieu_nhap;
    private String ngay;
    private String id_don_dat_hang;
    private int id_nhan_vien;
    private String id_kho;

    public PhieuNhap() {
    }

    public PhieuNhap(String id_phieu_nhap, String ngay, String id_don_dat_hang, int id_nhan_vien, String id_kho) {
        this.id_phieu_nhap = id_phieu_nhap;
        this.ngay = ngay;
        this.id_don_dat_hang = id_don_dat_hang;
        this.id_nhan_vien = id_nhan_vien;
        this.id_kho = id_kho;
    }

    public String getId_phieu_nhap() {
        return id_phieu_nhap;
    }

    public void setId_phieu_nhap(String id_phieu_nhap) {
        this.id_phieu_nhap = id_phieu_nhap;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getId_don_dat_hang() {
        return id_don_dat_hang;
    }

    public void setId_don_dat_hang(String id_don_dat_hang) {
        this.id_don_dat_hang = id_don_dat_hang;
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
