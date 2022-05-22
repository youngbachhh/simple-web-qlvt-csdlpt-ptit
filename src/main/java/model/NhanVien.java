package model;

public class NhanVien {
    private int id_nhan_vien;
    private String ho;
    private String ten;
    private String gioi_tinh;
    private String dia_chi;
    private String ngay_sinh;
    private int luong;
    private String id_chi_nhanh;

    public NhanVien() {
    }

    public NhanVien(int id_nhan_vien, String ho, String ten, String gioi_tinh, String dia_chi, String ngay_sinh, int luong, String id_chi_nhanh) {
        this.id_nhan_vien = id_nhan_vien;
        this.ho = ho;
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
        this.ngay_sinh = ngay_sinh;
        this.luong = luong;
        this.id_chi_nhanh = id_chi_nhanh;
    }

    public int getId_nhan_vien() {
        return id_nhan_vien;
    }

    public void setId_nhan_vien(int id_nhan_vien) {
        this.id_nhan_vien = id_nhan_vien;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getId_chi_nhanh() {
        return id_chi_nhanh;
    }

    public void setId_chi_nhanh(String id_chi_nhanh) {
        this.id_chi_nhanh = id_chi_nhanh;
    }
}
