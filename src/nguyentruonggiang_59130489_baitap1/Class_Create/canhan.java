/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyentruonggiang_59130489_baitap1.Class_Create;

/**
 *
 * @author Giang Tien Ty
 */
public abstract class canhan {
    protected String hoTen;
    protected int tuoi;
    protected String diaChi;
    protected String sdt;
  
    public canhan(String hoTen, int tuoi, String diaChi, String sdt) {
      this.hoTen = hoTen;
      this.tuoi = tuoi;
      this.diaChi = diaChi;
      this.sdt = sdt;
    }
    public abstract String hienthithongtinnv();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
