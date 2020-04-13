/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyentruonggiang_59130489_baitap1.Class_Create;

import java.util.ArrayList;

/**
 *
 * @author Giang Tien Ty
 */
public class lophoc {
    private giaovien giaoVienCN = null;
    private ArrayList<canhan> dsHocSinh = null;
    private ArrayList<canhan> dsGVGD = null;

    private iqlds qlDsGVGD = null;
    private iqlds qlDsHS = null;

    public  lophoc() {
        this.dsHocSinh = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDsHS = new qlds(dsHocSinh);
        this.qlDsGVGD = new qlds(dsGVGD);
    }

    public lophoc(giaovien giaovien1, hocsinh hocsinh1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setGiaoVienCN(giaovien giaoVienCN) { this.giaoVienCN = giaoVienCN; } 
    public giaovien getGiaoVienCN() { return giaoVienCN; }
    
    public int themHocSinh(hocsinh hs) {
      if (qlDsHS.them(hs) == 1) {
        return 1;
      }
      return 0;
    }
    public int themGVGD(giaovien gv) {
      if (qlDsGVGD.them(gv) == 1) {
        return 1;
      }
      return 0;
    }
    public int inDSHS() {
        System.out.println("Danh sach hoc sinh:");
        qlDsHS.inDS();
        return 1;
    }
    public int inDSGVGD() {
        System.out.println("Danh sach giao vien giang day:");
        qlDsGVGD.inDS();
        return 1;
    }
}