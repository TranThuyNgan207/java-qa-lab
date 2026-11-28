package com.qa.lab;

public class OrderCalculator {

    public double tinhGiamGia(int tongTien, int phanTram) {
        return tongTien * ((double) phanTram / 100);
    }

    public boolean kiemTraMienPhiShip(int tongTien) {
        return tongTien >= 500000;
    }

    public long tinhTongTienDonLon(int soLuong, int donGia) {
        return (long) soLuong * donGia;
    }
}