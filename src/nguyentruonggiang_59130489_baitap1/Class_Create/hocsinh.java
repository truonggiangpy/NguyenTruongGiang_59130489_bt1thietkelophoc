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
public class hocsinh extends canhan{
    private String lop;
    private String nangKhieu;

    public hocsinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
          super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
      this.nangKhieu = nangKhieu;
    }
      public String hienthithongtinnv() {
      String thongtinhocsinh = "";
     thongtinhocsinh = "ho ten " + this.hoTen + " do tuoi " + this.tuoi + " dia chi " + this.diaChi + " sdt " + this.sdt + " lop " + this.lop+ ", năng khiếu " + this.nangKhieu;
      return thongtinhocsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

}
