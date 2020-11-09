/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo;

/**
 *
 * @author Ferina
 */

class mahasiswa {
  private String nama,nim,alamat;
  private int UTS,UAS;
  public void setNama(String namavalue){
    this.nama=namavalue;
  }public String getNama(){
    return this.nama;
  }
  public void setNim(String nimvalue){
    this.nim=nimvalue;
  }public String getNim(){
    return this.nim;
  }
  public void setAlamat(String alamatvalue){
    this.alamat=alamatvalue;
  }public String getAlamat(){
    return this.alamat;
  }
  public void setUts(int utsvalue){
    this.UTS=utsvalue;
  }public int getUts(){
    return this.UTS;
  }
  public void setUas(int uasvalue){
    this.UAS=uasvalue;
  }public int getUas(){
    return this.UAS;
  }
  public void printDataMhs(){
    System.out.println("Nama\t\t:"+this.nama);
    System.out.println("NIM\t\t:"+this.nim);
    System.out.println("Alamat\t\t:"+this.alamat);
    System.out.println("Nilai UTS\t\t:"+this.UTS);
    System.out.println("Nilai UAS\t\t:"+this.UAS);
  }
}
