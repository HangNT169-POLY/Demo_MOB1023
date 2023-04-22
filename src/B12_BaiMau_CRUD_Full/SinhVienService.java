/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_BaiMau_CRUD_Full;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    private List<SinhVien> listSinhViens;

    public SinhVienService() {
        this.listSinhViens = new ArrayList<>();
    }

    public List<SinhVien> fakeData() {
        listSinhViens.add(new SinhVien("1", "ten1", 10, "Nam dinh", 1));
        listSinhViens.add(new SinhVien("2", "a", 15, "Nam dinh1", 2));
        listSinhViens.add(new SinhVien("3", "ten2", 13, "Nam dinh2", 1));
        listSinhViens.add(new SinhVien("4", "ten3", 9, "Nam dinh3", 1));
        listSinhViens.add(new SinhVien("5", "ten4", 11, "Nam dinh4", 2));
        return listSinhViens;
    }

    public void sortByName() {
        listSinhViens.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }

    public List<SinhVien> searchByName(String name) {
        List<SinhVien> listSearch = new ArrayList<>();
        // code
        for (SinhVien sv : listSinhViens) {
            if (sv.getTen().contains(name)) {
                listSearch.add(sv);
            }
        }
        return listSearch;
    }

    public String addSinhVien(SinhVien sv) {
        if (sv != null) {
            listSinhViens.add(sv);
            return "Add thanh cong";
        }
        return " Add that bai";
    }

    public String xoaSinhVien(int viTri) {
        if (viTri != -1) {
            listSinhViens.remove(viTri);
            return "Xoa thanh cong";
        }
        return " Xoa that bai";
    }
    
    public String ghiFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); 
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (SinhVien sinhVien : listSinhViens) {
                    oos.writeObject(sinhVien);
                }
            }
            return "Ghi file thành công!";
        } catch (IOException e) {
            return "Ghi file thất bại";
        }
    }

    public String docFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                System.out.println("Không tìm thấy file!");
            }
            try (FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listSinhViens.add((SinhVien) ois.readObject());
                }
            }
            return "Đọc file thành công!";
        } catch (IOException | ClassNotFoundException e) {
            return "Đọc file thất bại";
        }
    }
}
