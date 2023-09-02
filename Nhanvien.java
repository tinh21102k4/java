/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

/**
 *
 * @author ThuyVT
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ten;
    private String maNV;
    private int luong;

    public NhanVien() {
    }

    public NhanVien(String ten, String maNV, int luong) {
        this.ten = ten;
        this.maNV = maNV;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    public void inThongTin() {
        System.out.println("Ten:" + this.ten + " - Ma:" + this.maNV + " - Luong: " + this.luong);
    }
    
    public int tinhLuong() {
        return this.luong * 22;
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.maNV.compareTo(o.getMaNV());
        return o.getMaNV().compareTo(this.getMaNV());
        return this.luong - o.getLuong();
    }
}