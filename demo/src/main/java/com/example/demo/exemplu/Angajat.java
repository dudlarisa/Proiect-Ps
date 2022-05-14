package com.example.demo.exemplu;

public class Angajat extends BasicUser {


    public Angajat(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public int zile() {
        return super.data.zile()*12;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Angajat;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
