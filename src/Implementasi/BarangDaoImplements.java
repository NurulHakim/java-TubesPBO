/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementasi;

import Interface.BarangDao;
import entity.Barang;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class BarangDaoImplements implements BarangDao{
    Connection connection;
    
    public BarangDaoImplements(Connection connection){
        this.connection = connection;
    }

    @Override
    public void save(Barang barang) {
        String SQL = "INSERT INTO barang(";
    }

    @Override
    public void update(Barang barang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Barang barang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Barang> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}