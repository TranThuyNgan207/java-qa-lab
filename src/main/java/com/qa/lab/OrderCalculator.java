package com.qa.lab;

public class OrderCalculator {

    // Ep kieu (double) truoc khi chia de khong bi mat phan thap phan
    public double tinhGiamGia(int tongTien, int phanTram) {
        return tongTien * ((double) phanTram / 100);
    }

    // Dieu kien bien: tu 500,000 tro len (>=) moi mien phi ship
    public boolean kiemTraMienPhiShip(int tongTien) {
        return tongTien >= 500000;
    }

    // Ep sang long de tranh tran so khi vuot Integer.MAX_VALUE (2.14 ty)
    public long tinhTongTienDonLon(int soLuong, int donGia) {
        return (long) soLuong * donGia;
    }
}