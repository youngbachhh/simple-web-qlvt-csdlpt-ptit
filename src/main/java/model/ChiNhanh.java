package model;

public class ChiNhanh {
    private String id_chi_nhanh;
    private String chi_nhanh;
    private String dia_chi;
    private String sdt;

    public ChiNhanh() {
    }

    public ChiNhanh(String id_chi_nhanh, String chi_nhanh, String dia_chi, String sdt) {
        this.id_chi_nhanh = id_chi_nhanh;
        this.chi_nhanh = chi_nhanh;
        this.dia_chi = dia_chi;
        this.sdt = sdt;
    }

    public String getId_chi_nhanh() {
        return id_chi_nhanh;
    }

    public void setId_chi_nhanh(String id_chi_nhanh) {
        this.id_chi_nhanh = id_chi_nhanh;
    }

    public String getChi_nhanh() {
        return chi_nhanh;
    }

    public void setChi_nhanh(String chi_nhanh) {
        this.chi_nhanh = chi_nhanh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
