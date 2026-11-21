package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OrderCalculatorTest {

    OrderCalculator order = new OrderCalculator();

    @Test
    void testGiamGia20PhanTram() {
        assertEquals(100000.0, order.tinhGiamGia(500000, 20));
    }

    @Test
    void testGiamGiaKhongPhanTram() {
        assertEquals(0.0, order.tinhGiamGia(500000, 0));
    }

    @Test
    void testGiamGiaLeThapPhan() {
        assertEquals(12500.0, order.tinhGiamGia(250000, 5));
    }

    @Test
    void testMienPhiShipNgayTaiBien500k() {
        assertTrue(order.kiemTraMienPhiShip(500000));
    }

    @Test
    void testMienPhiShipDuoiBien() {
        assertFalse(order.kiemTraMienPhiShip(499999));
    }

    @Test
    void testMienPhiShipTrenBien() {
        assertTrue(order.kiemTraMienPhiShip(500001));
    }

    @Test
    void testDonHangNhoKhongTranSo() {
        assertEquals(20000000L, order.tinhTongTienDonLon(2, 10000000));
    }

    @Test
    void testDonHangLonVuotIntegerMaxValue() {
        // 50 * 50,000,000 = 2.5 ty (vuot 2.14 ty cua int nhung van tinh dung nho long)
        assertEquals(2500000000L, order.tinhTongTienDonLon(50, 50000000));
    }
}