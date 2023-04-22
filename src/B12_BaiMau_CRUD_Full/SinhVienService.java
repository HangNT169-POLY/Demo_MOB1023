/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_BaiMau_CRUD_Full;

import java.util.List;

/**
 *
 * @author hangnt
 */
public interface SinhVienService {

    List<SinhVien> getAll();

    String addSinhVien(SinhVien sv);

    String xoaSinhVien(int viTri);

    String suaSinhVien(int viTri, SinhVien sv);

    void sortByName();

    List<SinhVien> searchByName(String name);

    String ghiFile(String path);

    String docFile(String path);

}
