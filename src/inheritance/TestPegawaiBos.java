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
public class TestPegawaiBos {
    public static void main(String[] args) {
        Bos A = new Bos();
        Pegawai B = new Pegawai();
        
        //pegawai
        System.out.println("==>pegawai<==");
        B.nama();
        B.gaji();
        
        //bos
        System.out.println("==>Bos<==");
        A.nama();
        A.gajibos(0);
        
        
    }
    
}