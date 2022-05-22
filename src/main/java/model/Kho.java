package model;

public class Kho {
    private String id_kho;
    private String ten_kho;
    private String dia_chi;
    private String id_chi_nhanh;

    public Kho() {
    }

    public Kho(String id_kho, String ten_kho, String dia_chi, String id_chi_nhanh) {
        this.id_kho = id_kho;
        this.ten_kho = ten_kho;
        this.dia_chi = dia_chi;
        this.id_chi_nhanh = id_chi_nhanh;
    }

    public String getId_kho() {
        return id_kho;
    }

    public void setId_kho(String id_kho) {
        this.id_kho = id_kho;
    }

    public String getTen_kho() {
        return ten_kho;
    }

    public void setTen_kho(String ten_kho) {
        this.ten_kho = ten_kho;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getId_chi_nhanh() {
        return id_chi_nhanh;
    }

    public void setId_chi_nhanh(String id_chi_nhanh) {
        this.id_chi_nhanh = id_chi_nhanh;
    }
}
