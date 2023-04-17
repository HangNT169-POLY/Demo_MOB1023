/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_BaiMauCRUD_FixCung;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public interface ThucVatService {

    ThucVat nhapThucVat();

    void hienThiThucVat(ArrayList<ThucVat> lists);

    ArrayList<ThucVat> timKiemKhoangCanNang(ArrayList<ThucVat> lists, int min, int max);

    void sapXepTheoTen(ArrayList<ThucVat> lists);

    void sapXepTheoCanNang(ArrayList<ThucVat> lists);

    CayAnQua nhapCayAnQua();

}
