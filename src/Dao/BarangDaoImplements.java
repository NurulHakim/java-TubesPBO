/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interface.BarangDao;
import entity.Barang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String SQL = "INSERT INTO barang(id_barang,nama_barang,harga,gambar) VALUES(?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setInt(1, barang.getIdBarang());
            statement.setString(2, barang.getNamabarang());
            statement.setDouble(3, barang.getHarga());
            statement.setBytes(4, barang.getGambar());
            statement.executeUpdate();
        } catch(SQLException ex) {
            Logger.getLogger(BarangDaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override     
    public void update(Barang barang) {
        String SQL = " UPDATE barang SET id_barang=?,nama_barang=?,harga=?,gambar=? WHERE id_barang=?";
        try {
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setInt(1, barang.getIdBarang());
            statement.setString(2, barang.getNamabarang());
            statement.setDouble(3, barang.getHarga());
            statement.setBytes(4, barang.getGambar());
            statement.executeUpdate();
        } catch(SQLException ex) {
            Logger.getLogger(BarangDaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void delete(Barang barang) {
        String SQL="DELETE FROM barang WHERE id_barang=?";
        try {
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setInt(1, barang.getIdBarang());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BarangDaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Barang> getAll() {
        String SQL = "SELECT id_barang,nama_barang,harga,gambar FROM barang";
        List <Barang> list = new ArrayList();
        Barang barang = null;
        try {
            PreparedStatement statement = connection.prepareStatement(SQL);
            ResultSet rs = statement.executeQuery();
 
            while (rs.next()){
                barang = new Barang();
                barang.setIdBarang(rs.getInt(1));
                barang.setNamabarang(rs.getString(2));
                barang.setHarga(rs.getDouble(3));
                barang.setGambar(rs.getBytes(4));
                list.add(barang);
                barang=null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangDaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        }
    
}
