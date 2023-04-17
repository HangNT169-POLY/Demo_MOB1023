/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_OverviewOOP_P2;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class SinhVienServiceImpl implements SinhVienService {

    @Override
    public void nhapVaInThongTinSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = Integer.valueOf(scanner.nextLine());
        System.out.print("Nhap mssv:");
        String mssv = scanner.nextLine();
        System.out.print("Nhap diem:");
        double diem = Double.valueOf(scanner.nextLine());
        SinhVien sinhVien = new SinhVien(mssv, diem, ten, tuoi);
        sinhVien.display();
    }

}
