
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
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DocGhiFile {

    public String ghiFile(String path, List<SinhVien> listSV) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (SinhVien sinhVien : listSV) {
                    oos.writeObject(sinhVien);
                }
            }
            return "Ghi file thành công!";
        } catch (IOException e) {
            return "Ghi file thất bại";
        }
    }

    public String docFile(String path, List<SinhVien> listSV) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                System.out.println("Không tìm thấy file!");
            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listSV.add((SinhVien) ois.readObject());
                }
            }
            return "Đọc file thành công!";
        } catch (IOException | ClassNotFoundException e) {
            return "Đọc file thất bại";
        }
    }
}
