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
public class qlds implements iqlds {
    private ArrayList<canhan> dsCaNhan = new ArrayList<>();

    public qlds(ArrayList<canhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }
    @Override
    public int them(canhan cn) {
      dsCaNhan.add(cn);
      return 1;
    }
    @Override
    public void inDS() {
        for(int i=0;i<dsCaNhan.size();i++)
      System.out.println(dsCaNhan.get(i).hienthithongtinnv());
    }

    @Override
    public int xoa(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
