/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ADMIN
 */
public class hoaQua {
    private float soLuong;
    private float giaBan;
    private String ngayNhap;
    float tinhTien(){
        return soLuong*giaBan;
    }

    public hoaQua() {
    }
    

    public hoaQua(float soLuong, float giaBan, String ngayNhap) {
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.ngayNhap = ngayNhap;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
            
    
}
