package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Ucgen implements ISekil {
    public void alanHesapla() {
        System.out.println("Üçgenin alanı hesaplandı...");
    }

    public void cevreHesapla() {
        System.out.println("Üçgenin çevresi hesaplandı...");
    }

    public void hacimHesapla() {
        System.out.println("Üçgenin hacmi hesaplandı...");
    }

}
