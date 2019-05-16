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
public class Pembeli {
    int id_pembeli;
    String username, password, nama_pembeli, jk, lokasi;
    
     
    
    
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
    
    public int getIdPembeli(){
        return id_pembeli;
    }
    
    public void setIdPembeli(int id_pembeli){
        this.id_pembeli = id_pembeli;
    }
    
    public String getNamaPembeli(){
        return nama_pembeli;
    }
    
    public void setNamaPembeli(String nama){
        this.nama_pembeli = nama_pembeli;
    }
    
    public String getJk(){
        return jk;
    }
    
    public void setJk(String jk ){
        this.jk = jk;
    }
    
    public String getLokasi(){
        return lokasi;
    }
    
    public void setLokasi(String lokasi){
        this.lokasi = lokasi;
    }
    
    
    
    
}
