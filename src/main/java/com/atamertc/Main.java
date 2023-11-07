package com.atamertc;

public class Main {
    public static void main(String[] args) {
     /*
      TightCoupling ve LooseCoupling
      */
       // var sekil=new Kare();
        var sekil=new Ucgen();
        var hesaplayici=new Hesaplayici(sekil);
        hesaplayici.hesapla();
    }
}