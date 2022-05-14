package com.example.demo.exemplu;

public class Vizitator extends BasicUser {


    public Vizitator(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public int zile() {
        return super.data.zile()*4;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Vizitator;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
