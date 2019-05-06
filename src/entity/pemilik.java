/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Rahmat Ginting
 */
public class pemilik {
    String nama_pemilik, username, password;
    int id_pemilik;
    //gambar
    
    public String getNama(){
        return nama_pemilik;
    }
    
    public void setNama(String nama){
        this.nama_pemilik = nama_pemilik;
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
        return id_pemilik;
    }
    
    public void setId(int id_penjual){
        this.id_pemilik = id_pemilik;
    }
}


