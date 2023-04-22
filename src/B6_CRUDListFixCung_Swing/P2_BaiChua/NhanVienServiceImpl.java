/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_CRUDListFixCung_Swing.P2_BaiChua;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class NhanVienServiceImpl implements NhanVienService {

    private List<NhanVien> listNhanViens;

    public NhanVienServiceImpl() {
        this.listNhanViens = new ArrayList<>();
    }

    @Override
    public List<NhanVien> fakeData() {
        listNhanViens.add(new NhanVien("ten1", "Loai 1", true, "Ăn"));
        listNhanViens.add(new NhanVien("ten2", "Loai 2", true, "Ăn Lăn"));
        listNhanViens.add(new NhanVien("ten3", "Loai 3", false, "Ăn"));
        listNhanViens.add(new NhanVien("ten4", "Loai 1", true, "Lăn"));
        listNhanViens.add(new NhanVien("ten5", "Loai 2", false, "Ăn"));
        return listNhanViens;
    }

    @Override
    public String addNhanVien(NhanVien nhanVien) {
        if (nhanVien != null) {
            listNhanViens.add(nhanVien);
            return "Add thanh cong";
        }
        return " Add that bai";
    }

    @Override
    public List<NhanVien> searchName(String name) {
        List<NhanVien> listSearchTheoTen = new ArrayList<>();
        for (NhanVien sinhVien : listNhanViens) {
            if (sinhVien.getTen().contains(name)) {
                listSearchTheoTen.add(sinhVien);
            }
        }
        return listSearchTheoTen;
    }

}
