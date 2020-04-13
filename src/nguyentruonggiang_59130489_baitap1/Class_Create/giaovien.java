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
public class giaovien extends canhan{
        private String monDay;
    private String toBoMon;

    public giaovien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
      super(hoTen, tuoi, diaChi, sdt);
      this.monDay = monDay;
      this.toBoMon = toBoMon;
    }
    
        public String hienthithongtinnv() {
      String thongtingiaovien = "";
      thongtingiaovien = "ho ten " + this.hoTen + " do tuoi " + this.tuoi + " dia chi " + this.diaChi + " sdt " + this.sdt + " mon day " + this.monDay + ", to bo mon: " + this.toBoMon;
      return thongtingiaovien;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
}
