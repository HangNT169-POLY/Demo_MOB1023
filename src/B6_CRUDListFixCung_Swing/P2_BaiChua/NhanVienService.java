/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_CRUDListFixCung_Swing.P2_BaiChua;

import java.util.List;

/**
 *
 * @author hangnt
 */
public interface NhanVienService {

    List<NhanVien> getAll();

    String addNhanVien(NhanVien nhanVien);

    List<NhanVien> searchName(String name);

}
