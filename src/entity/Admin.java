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
public class Admin {
    String nama_admin, username, password;
    int id_admin;
    
    public String getNama(){
        return nama_admin;
    }
    
    public void setNama(String nama_admin){
        this.nama_admin = nama_admin;
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
        return id_admin;
    }
    
    public void setId(int id_admin){
        this.id_admin = id_admin;
    }
    
    
    
}
