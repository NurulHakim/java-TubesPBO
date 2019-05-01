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
    char nim;
    String username, password, nama_pembeli, jk, lokasi, prodi;
    int angkatan;
    //gambar
    
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
    
    public double getNim(){
        return nim;
    }
    
    public void setNim(char nim){
        this.nim = nim;
    }
    
    public String getNama(){
        return nama_pembeli;
    }
    
    public void setNama(String nama){
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
    
    public String getProdi(){
        return prodi;
    }
    
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    
    public int getAngkatan(){
        return angkatan;
    }
    
    public void setAngkatan(int angkatan){
        this.angkatan = angkatan;
    }
}
