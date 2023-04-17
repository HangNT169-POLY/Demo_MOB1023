/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_BaiMauCRUD_FixCung;

/**
 *
 * @author hangnt
 */
public class ThucVat {

    private String maTV;
    private String ten;
    private String khuVuc;
    private int canNang;

    public ThucVat() {
    }

    public ThucVat(String maTV, String ten, String khuVuc, int canNang) {
        this.maTV = maTV;
        this.ten = ten;
        this.khuVuc = khuVuc;
        this.canNang = canNang;
    }

    public String getMaTV() {
        return maTV;
    }

    public void setMaTV(String maTV) {
        this.maTV = maTV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public void inThongTin() {
        System.out.println("Ma: " + maTV + " Ten: " + ten + " Khu vuc: " + khuVuc + " Can nang: " + canNang);
    }
}
