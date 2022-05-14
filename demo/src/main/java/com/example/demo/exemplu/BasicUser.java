package com.example.demo.exemplu;

public abstract class BasicUser {

     private String nume ;
     private String prenume;
     public DataSource data=new Data();
     public DataSource data2= new Data();
     public DataSource data3;


    public BasicUser(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        data3=new Data();

    }
    public abstract int zile();

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }


}
