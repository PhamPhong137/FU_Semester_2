/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testArrayList;

/**
 *
 * @author PC-Phong
 */
public class Hocsinh {
    private String ma,hoten;
    private double luong;

    public Hocsinh() {
    }

    public Hocsinh(String ma, String hoten, double luong) {
        this.ma = ma;
        this.hoten = hoten;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Hocsinh{" + "ma=" + ma + ", hoten=" + hoten + ", luong=" + luong + '}';
    }
}
