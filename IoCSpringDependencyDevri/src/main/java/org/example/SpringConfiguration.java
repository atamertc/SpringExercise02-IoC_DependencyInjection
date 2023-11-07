package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Burası springin ayar dosyası olacak.
 */

record Kisi(String ad, int yas) {
};

record Adres(String ilce, String il) {
};

record Kisi2(String ad, int yas, Adres adres) {
};

@Configuration
public class SpringConfiguration {
    /*
    @Bean anotasyonu ile Spring Context tarafından yönetilecek bir bean oluşturuluyor.
     */
    @Bean
    public String ad() {
        return "Mr. Bean";
    }

    @Bean
    public int yas() {
        return 50;
    }

    @Bean
    public Kisi kisi() {
        return new Kisi("Barış", 37);
    }

    @Bean(name = "adresname")
    public Adres adres() {
        return new Adres("Bakırköy", "İstanbul");
    }

    @Bean
    public Kisi kisiMetodCalling() {
        return new Kisi(ad(), yas());
    }

    @Bean
    public Kisi2 kisi2() {
        return new Kisi2("Cüneyt", 40, new Adres("Midyat", "Mardin"));
    }

    @Bean
    public Kisi2 kisi2MetodCalling() {
        return new Kisi2(ad(), yas(), adres());
    }

    @Bean
    @Primary
    public Adres adres2() {
        return new Adres("Gölbaşı", "Ankara");
    }

    @Bean
    @Qualifier("adres3Qualifier")
    public Adres adres3() {
        return new Adres("Atakum", "Samsun");
    }

    @Bean
    public Kisi2 kisi2Qualifier(String ad, int yas, @Qualifier("adres3Qualifier") Adres adres3) {
        return new Kisi2(ad, yas, adres3);
    }

    //Bugün neler gördük?
    /*
    Sıkı bağlılık-gevşek bağlılık.
    @Configuration
    @Bean
    Spring Context: - Spring Container AnnotationConfigApplicationContext
    @Primary
    @Qualifier
    Bean içinde bean kullanımı

    Spring Bean: Spring tarafından yönetilen Java Objeleridir. @Bean ile işaretlenmelidir.
    Java Bean: 3 kesin özelliğe sahip olmalıdır. 1 implement Serializable, No-args Constructor, Getter & Setter
    Pojo: Herhangi bir kısıtlamasız java sınıflarıdır.

    Spring Context, Spring Container, IoC Container
        >Application Context: Kurumsal yapılara daha uygun. Web uygulamaları için de uygun. AOP ile uyumlu.
    Amaçları:Spring beanleri ve onların yaşam döngülerini yönetmektir.
     */

}
