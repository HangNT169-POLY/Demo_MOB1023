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
public class Main {

    public static void main(String[] args) {
        ArrayList<ThucVat> listThucVat = new ArrayList<>();
        ThucVatService thucVatService = new ThucVatServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int chucNang;
        do {
            System.out.println("1. Nhap ");
            System.out.println("2. Xuat");
            System.out.println("3. Search ");
            System.out.println("4. Sort 1");
            System.out.println("5. Sort 2");
            System.out.println("6. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("Nhap chuc nang: ");
            chucNang = Integer.valueOf(scanner.nextLine());
            switch (chucNang) {
                case 1: {
                    ThucVat thucVat = thucVatService.nhapThucVat();
                    listThucVat.add(thucVat);
                    break;
                }
                case 2: {
                    thucVatService.hienThiThucVat(listThucVat);
                    break;
                }
                case 3: {
                    System.out.println("Nhap min: ");
                    int min = Integer.valueOf(scanner.nextLine());
                    System.out.println("Nhap max: ");
                    int max = Integer.valueOf(scanner.nextLine());
                    ArrayList<ThucVat> listSearch = 
                            thucVatService.timKiemKhoangCanNang
                                        (listThucVat, min, max);
                    thucVatService.hienThiThucVat(listSearch);
                    break;
                }
                case 4: {
                    thucVatService.sapXepTheoCanNang(listThucVat);
                    thucVatService.hienThiThucVat(listThucVat);
                    break;
                }
                case 5: {
                    thucVatService.sapXepTheoTen(listThucVat);
                    thucVatService.hienThiThucVat(listThucVat);
                    break;
                }
                case 6: {
                    CayAnQua cayAnQua = thucVatService.nhapCayAnQua();
                    cayAnQua.inThongTin();
                    break;
                }
                case 0: {
                    break;
                }
            }
        } while (chucNang != 0);
    }
}
