package com.mycompany.lingkaran;

public class actionLingkaran {
    
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(11.78);

        System.out.println("Jari-jari lingkaran             : " + lingkaran.getJariJari());
        System.out.println("Pi                              : " + lingkaran.getPi());
        System.out.println("Hasilnya adalah (pecahan)       : " + lingkaran.hitungLuas());
        System.out.println("Hasilnya adalah (dibulatkan)    : " + lingkaran.hitungLuasDibulatkan());
        System.out.println("Hasilnya adalah (bilangan bulat): " + lingkaran.hitungLuasInteger());
    }
    
}
