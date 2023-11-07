package org.atamertc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
Springde 3 tip DI vardir
1- Constructor DI
2- Setter DI
3- Field DI

IoC : InversionOfControl -> Butun nesne yaratma islerini Springe devretmeye verilen ad
 */
@Component
class ServiceClass {
    Dependency1 dependency1;
    Dependency2 dependency2;
    @Autowired // Autowired yazmasak bile spring constructordakileri olusturur
    public ServiceClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "ServiceClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
@Component
class Dependency1 {

}
@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Main.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(ServiceClass.class));
    }
}