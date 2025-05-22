package com.mycompany.lingkaran;

public class Lingkaran {

    private double r;
    private final double pi = 3.141592;
    public Lingkaran(double r) {
        this.r = r;
    }

    public double getJariJari() {
        return r;
    }

    public double getPi() {
        return pi;
    }

    public double hitungLuas() {
        return pi * r * r;
    }

    public long hitungLuasDibulatkan() {
        return Math.round(hitungLuas());
    }

    public int hitungLuasInteger() {
        return (int) hitungLuas();
    }
    
}
