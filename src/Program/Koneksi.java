/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Virda
 */
public class Koneksi {
     Connection con;
      public Connection getData (){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/uhuy","root", "");
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Terhubung Database!");
        }
        
        return con;
    }
    
}
