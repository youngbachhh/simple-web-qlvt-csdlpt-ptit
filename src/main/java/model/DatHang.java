package model;

public class DatHang {
    NhaCungCap ncc =  new NhaCungCap();
    private String id_don_dat_hang;
    private int id_nhan_vien;
    private String id_kho;
    private String id_ncc = ncc.getId();
    private String ngay;

    public DatHang() {
    }

    public DatHang(String id_don_dat_hang, int id_nhan_vien, String id_kho, String id_ncc) {
        this.id_don_dat_hang = id_don_dat_hang;
        this.id_nhan_vien = id_nhan_vien;
        this.id_kho = id_kho;
        this.id_ncc = id_ncc;
    }

    public NhaCungCap getNcc() {
        return ncc;
    }

    public void setNcc(NhaCungCap ncc) {
        this.ncc = ncc;
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

    public String getId_ncc() {
        return id_ncc;
    }

    public void setId_ncc(String id_ncc) {
        this.id_ncc = id_ncc;
    }
}
