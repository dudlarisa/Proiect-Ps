package com.example.demo.exemplu;

public class Extern extends BasicUser {


    public Extern(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public int zile() {
        return super.data.zile()+2;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Extern ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
