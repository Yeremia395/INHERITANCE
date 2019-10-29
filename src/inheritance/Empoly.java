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
public class Empoly extends Person {
    private String noKaryawan;
    //konstruktor
    public Empoly(String noKaryawan, String nama, int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    //metode
    public void info()
    {
        System.out.println("No. Karyawan : "+this.noKaryawan);
        super.info();
    }
    
}//akhir kelas empoly

