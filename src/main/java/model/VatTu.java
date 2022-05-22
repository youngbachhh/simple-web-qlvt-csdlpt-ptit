package model;

public class VatTu {
    private String id;
    private String ten;
    private int so_luong_ton;
    private int gia;
    private String don_vi_tinh;

    public VatTu() {
    }

    public VatTu(String id, String ten, int so_luong_ton, int gia, String don_vi_tinh) {
        this.id = id;
        this.ten = ten;
        this.so_luong_ton = so_luong_ton;
        this.gia = gia;
        this.don_vi_tinh = don_vi_tinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSo_luong_ton() {
        return so_luong_ton;
    }

    public void setSo_luong_ton(int so_luong_ton) {
        this.so_luong_ton = so_luong_ton;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getDon_vi_tinh() {
        return don_vi_tinh;
    }

    public void setDon_vi_tinh(String don_vi_tinh) {
        this.don_vi_tinh = don_vi_tinh;
    }
}
