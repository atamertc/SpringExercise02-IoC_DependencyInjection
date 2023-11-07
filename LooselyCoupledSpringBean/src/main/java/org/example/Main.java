package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //farkli packagetaysa sekiller yolunu yazman lazim "org.atamertc.sekiller" gibi
public class Main {

    public static void main(String[] args) {

//        var sekil=new Kare(); //Nesne yaratılıyor.
//        var hesaplayici=new Hesaplayici(sekil); //Nesne yaratılıyor. + Wiring of Dependencies
//
//        hesaplayici.hesapla();
        var context = new AnnotationConfigApplicationContext(Main.class);
        context.getBean(ISekil.class).alanHesapla();

        context.getBean(Hesaplayici.class).hesapla();

    }
}