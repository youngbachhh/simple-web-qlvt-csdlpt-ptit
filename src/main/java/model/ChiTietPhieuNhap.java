package model;

public class ChiTietPhieuNhap extends PhieuNhap{
    private String id_vat_tu;
    private int so_luong;
    private int don_gia;

    public ChiTietPhieuNhap(){
        super();
    }

    public ChiTietPhieuNhap(String id_vat_tu, int so_luong, int don_gia){
        super();
        this.id_vat_tu = id_vat_tu;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
    }

    public String getId_vat_tu() {
        return id_vat_tu;
    }

    public void setId_vat_tu(String id_vat_tu) {
        this.id_vat_tu = id_vat_tu;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }
}
