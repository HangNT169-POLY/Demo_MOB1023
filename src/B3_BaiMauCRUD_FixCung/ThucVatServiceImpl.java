/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_BaiMauCRUD_FixCung;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class ThucVatServiceImpl implements ThucVatService {

    @Override
    public ThucVat nhapThucVat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma:");
        String ma = scanner.nextLine();
        System.out.println("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.println("Nhap khu vuc:");
        String khuVuc = scanner.nextLine();
        System.out.println("Nhap can nang:");
        int canNang = Integer.valueOf(scanner.nextLine());
        return new ThucVat(ma, ten, khuVuc, canNang);
    }

    @Override
    public void hienThiThucVat(ArrayList<ThucVat> lists) {
        lists.forEach(s -> s.inThongTin());
    }

    @Override
    public ArrayList<ThucVat> timKiemKhoangCanNang(ArrayList<ThucVat> lists, int min, int max) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapXepTheoTen(ArrayList<ThucVat> lists) {
        lists.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }

    @Override
    public void sapXepTheoCanNang(ArrayList<ThucVat> lists) {
        lists.sort((o1, o2) -> {
            return o1.getCanNang() - o2.getCanNang();
        });
    }

    @Override
    public CayAnQua nhapCayAnQua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma:");
        String ma = scanner.nextLine();
        System.out.println("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.println("Nhap khu vuc:");
        String khuVuc = scanner.nextLine();
        System.out.println("Nhap can nang:");
        int canNang = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhap mua ra hoa:");
        int mua = Integer.valueOf(scanner.nextLine());
        return new CayAnQua(ma, ten, khuVuc, canNang, mua);
    }

}
