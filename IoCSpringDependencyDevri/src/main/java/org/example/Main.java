package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Spring contexti yaratma. İçine class olarak ayar dosyası verilir.
        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        //Bean çağrımları: Metod isimleri ile:
        System.out.println(context.getBean("ad"));
        System.out.println(context.getBean("yas"));
        System.out.println(context.getBean("kisi"));
        System.out.println(context.getBean("adresname"));
        System.out.println(context.getBean("kisiMetodCalling"));
        System.out.println(context.getBean("kisi2"));
        System.out.println(context.getBean("kisi2MetodCalling"));
        System.out.println(context.getBean("kisi2Qualifier"));
        //Bean çağrımları: Class isimleri ile:
        System.out.println(context.getBean(Adres.class));
        //Spring Framework tarafından yönetilen tüm beanleri nasıl görebilirim?
        System.out.println("_____________________________________________");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}