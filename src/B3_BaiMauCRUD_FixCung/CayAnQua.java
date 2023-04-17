/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_BaiMauCRUD_FixCung;

/**
 *
 * @author hangnt
 */
public class CayAnQua extends ThucVat {

    private int muaRaQua;

    public CayAnQua() {
    }

    public CayAnQua(String maTV, String ten, String khuVuc, int canNang, int muaRaQua) {
        super(maTV, ten, khuVuc, canNang);
        this.muaRaQua = muaRaQua;
    }

    public int getMuaRaQua() {
        return muaRaQua;
    }

    public void setMuaRaQua(int muaRaQua) {
        this.muaRaQua = muaRaQua;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Mua ra qua: " + muaRaQua);
    }

}
