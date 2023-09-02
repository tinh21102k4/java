/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class QuanLyNhanVien {

//    ArrayList<NhanVien> arr = new ArrayList<>();
    List<NhanVien> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        int nhapNua;
        do {
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap ma:");
            String ma = sc.nextLine();
            System.out.println("Nhap luong:");
            int luong = Integer.parseInt(sc.nextLine());
            NhanVien nv = new NhanVien(ten, ma, luong);
            arr.add(nv);
            System.out.println("Co nhap tiep khong 1 - co, 0 - khong");
            nhapNua = Integer.parseInt(sc.nextLine());
        } while (nhapNua == 1);
    }

    public void xuat() {
        for (NhanVien item : arr) {
            item.inThongTin();
        }
    }

    public void xoa() {
        System.out.println("Nhap manv:");
        String ma = sc.nextLine();
        int index = getIndex(ma);
        if (index == -1) {
            System.out.println("Khong tim thay doi tuong can xoa!!");
        } else {
            // xoa doi tuong trong ds = index
            arr.remove(index);
            System.out.println("Xoa doi tuong thanh cong");
        }
    }

    public void tim() {
        System.out.println("Nhap manv:");
        String ma = sc.nextLine();
        int index = getIndex(ma);
        if (index == -1) {
            System.out.println("Khong tim thay doi tuong can tim!!");
        } else {
            System.out.println("Tim thay doi tuong");
            arr.get(index).inThongTin();
        }
    }

    public int getIndex(String maNv) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getMaNV().trim().equalsIgnoreCase(maNv.trim())) {
                return i;
            }
        }
        return -1;
    }

    public void timTrongKhoang() {
        System.out.println("Nhap luong bat dau:");
        int luongbd = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong ket thuc:");
        int luongkt = Integer.parseInt(sc.nextLine());
        for (NhanVien item : arr) {
            if (luongbd <= item.tinhLuong() && item.tinhLuong() <= luongkt) {
                item.inThongTin();
            }
        }
    }

    public void keThua() {
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap ma:");
        String ma = sc.nextLine();
        System.out.println("Nhap luong:");
        int luong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ca:");
        int ca = Integer.parseInt(sc.nextLine());
        NhanVien baoVe = new BaoVe(ca, ten, ma, luong);
        System.out.println("Thong tin doi tuong bao ve:");
        baoVe.inThongTin();
        System.out.println("Luong cua bao ve la:" + baoVe.tinhLuong());
    }
    
    public void sapXep() {
        
        List<NhanVien> sort = arr.stream().sorted(Comparator.comparing(NhanVien::getTen)).collect(Collectors.toList());
        for (NhanVien item : sort) {
            item.inThongTin();
        }
    }
}