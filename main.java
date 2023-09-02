/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien service = new QuanLyNhanVien();
        int ct;
        do {
            System.out.println("===========Menu===========");
            System.out.println("1.       Nhập 1 danh sách đối tượng");
            System.out.println("2.    Xuất danh sách đối tượng đã nhập");
            System.out.println("3.    Xóa NV theo mã NV nhập vào");
            System.out.println("4.    Tìm nhân viên theo mã NV nhập vào");
            System.out.println("5.    Xuất danh sách NV theo khoảng lương nhập vào");
            System.out.println("0. Thoat");
            System.out.println("6. Ke thua");
            System.out.println("7. Sap xep");
            System.out.println("Nhap chuong trinh:");
            ct = Integer.parseInt(sc.nextLine());
            switch (ct) {
                case 1 -> {
                    service.nhap();
                    break;
                }
                case 2 -> {
                    service.xuat();
                    break;
                }
                case 3 -> {
                    service.xoa();
                    break;
                }
                case 4 -> {
                    service.tim();
                    break;
                }
                case 5 -> {
                    service.timTrongKhoang();
                    break;
                }
                case 6 -> {
                    service.keThua();
                    break;
                }
                case 7 -> {
                    service.sapXep();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
            }
        } while (ct != 0);
    }
}