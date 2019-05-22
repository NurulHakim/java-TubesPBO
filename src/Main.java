
import gui.Admin;
import gui.PembeliUtama;
import gui.Penjual;
import gui.login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        /*System.out.println("Bismillah tubesnya sukses dan lancar");
       */

        
    
        Admin a = new Admin();
        a.setVisible(true);
        
        PembeliUtama b = new PembeliUtama();
        b.setVisible(true);
        
        Penjual c = new Penjual();
        c.setVisible(true);
    }
    
}
