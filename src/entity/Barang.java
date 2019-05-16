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
public class Barang {
    String nama_barang;
    double harga;
    //gambar
    byte[] gambar;
    int id_barang;
    
    public Barang(int id_barang, String nama_barang, double harga, byte[] gambar){
      this.id_barang = id_barang;
      this.nama_barang = nama_barang;
      this.harga = harga;
      this.gambar = gambar;
    }

    
    public byte[] getGambar(){
        return gambar;
    }
    
    public void setGambar(byte[] gambar){
       this.gambar = gambar;
    }
    
    public String getNamabarang(){
        return nama_barang;
    }
    
    public void setNamabarang(String nama_barang){
        this.nama_barang = nama_barang;
    }
    
     public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public int getIdBarang(){
        return id_barang;
    }
    
    public void setIdBarang(int id_barang){
        this.id_barang = id_barang;
    }
    
    
}
