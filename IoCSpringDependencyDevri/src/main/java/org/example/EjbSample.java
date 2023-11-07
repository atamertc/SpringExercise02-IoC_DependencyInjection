package org.example;

import java.io.Serializable;

public class EjbSample implements Serializable { //3. Serializable'dan implemente edilmesi gerekli.
    //1. public boş constructor
    public EjbSample() {

    }

    String text;
    int number;

    //2. getter & setter
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
