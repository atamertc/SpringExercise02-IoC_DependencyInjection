package com.atamertc;

public class Hesaplayici {
    //Kare sekil;
    Ucgen sekil;
    public Hesaplayici(Ucgen sekil) {
        this.sekil=sekil;
    }

    public void hesapla() {
        System.out.println("Şekil hesapla metodu çalışıyor..."+sekil);
        sekil.alanHesapla();
        sekil.cevreHesapla();
        sekil.hacimHesapla();
    }
}
