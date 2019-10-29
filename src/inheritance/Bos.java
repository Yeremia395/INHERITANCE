/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Yeremia Rizky
 */
public class Bos extends Pegawai {
    int tunjanganbos=700000;
    int gajilembur=150000;
    int total;
    int jumlahLembur=10;
    
    public void nama()
    {
        System.out.println("Nama : Cavin Reza Zam-Zami");
    }
    void gajibos (int gajipokok)
    {
        gajipokok=gajilembur * jumlahLembur;
        total = tunjanganbos+gajilembur+gajipokok;
        System.out.println("Gaji : "+total);
    }
    
}