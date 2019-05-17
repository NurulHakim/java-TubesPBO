/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

/**
 *
 * @author Virda
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    Connection con;
    
    public Connection getData (){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/danusan","root", "");
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Terhubung Database!");
        }
        
        return con;
    }
}

