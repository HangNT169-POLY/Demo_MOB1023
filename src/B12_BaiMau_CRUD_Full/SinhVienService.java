/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_BaiMau_CRUD_Full;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    public List<SinhVien> fakeData() {
        List<SinhVien> listSinhViens = new ArrayList<>();
        listSinhViens.add(new SinhVien("1", "ten1", 10, "Nam dinh", 1));
        listSinhViens.add(new SinhVien("2", "a", 15, "Nam dinh1", 2));
        listSinhViens.add(new SinhVien("3", "ten2", 13, "Nam dinh2", 1));
        listSinhViens.add(new SinhVien("4", "ten3", 9, "Nam dinh3", 1));
        listSinhViens.add(new SinhVien("5", "ten4", 11, "Nam dinh4", 2));
        return listSinhViens;
    }

    public void sortByName(List<SinhVien> lists) {
        lists.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }

    public List<SinhVien> searchByName(List<SinhVien> listSinhViens, String name) {
        List<SinhVien> listSearch = new ArrayList<>();
        // code
        for (SinhVien sv : listSinhViens) {
            if (sv.getTen().contains(name)) {
                listSearch.add(sv);
            }
        }
        return listSearch;
    }
    public String addSinhVien(List<SinhVien> listSV, SinhVien sv) {
        if (sv != null) {
            listSV.add(sv);
            return "Add thanh cong";
        }
        return " Add that bai";
    }
}
