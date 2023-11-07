package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("karenesnesi")
public class Kare implements ISekil {
    public void alanHesapla(){
        System.out.println("Karenin alanı hesaplandı...");
    }
    public void cevreHesapla(){
        System.out.println("Karenin çevresi hesaplandı...");
    }
    public void hacimHesapla(){
        System.out.println("Karenin hacmi hesaplandı...");
    }

}
