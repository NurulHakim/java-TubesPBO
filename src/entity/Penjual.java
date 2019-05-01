/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ASUS
 */
public class Penjual {
    String nama_penjual, lokasi, username, password;
    int id_penjual;
    //gambar
    
    public String getNama(){
        return nama_penjual;
    }
    
    public void setNama(String nama){
        this.nama_penjual = nama_penjual;
    }
    
    public String getLokasi(){
        return lokasi;
    }
    
    public void setLokasi(String lokasi){
        this.lokasi = lokasi;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
       this.username = username; 
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getId(){
        return id_penjual;
    }
    
    public void setId(int id_penjual){
        this.id_penjual = id_penjual;
    }
}
