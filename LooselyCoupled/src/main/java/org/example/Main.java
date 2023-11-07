package org.example;

public class Main {
    public static void main(String[] args) {
     /*
      TightCoupling ve LooseCoupling
      */
       // var sekil=new Kare();
        var sekil=new Kare(); //Nesne yaratılıyor.
        var hesaplayici=new Hesaplayici(sekil); //Nesne yaratılıyor. + Wiring of Dependencies
        //burada sekil Hesaplayıcı için bağımlılıktır.
        //sekil nesnesini Hesaplayıcı nesnesine inject ediyoruz.
        //DI - Dependency Injection.
        hesaplayici.hesapla();
    }
}