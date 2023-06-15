/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

/**
 *
 * @author USER
 */
public class Mainkinetic {
    int massa,kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetic(){
        double energiKinetic = 0.5*massa*kecepatan*kecepatan;
         return energiKinetic;
    }
    public static void main(String[] args) {
     Mainkinetic sepeda = new Mainkinetic();
     sepeda.setKecepatan(20);
     sepeda.setMassa(2);
     
     double energiKinetic = sepeda.hitungEnergiKinetic();
     
        System.out.println( sepeda.getKecepatan());
        System.out.println(sepeda.getMassa());
        System.out.println(energiKinetic);
     
    }
}
   
       