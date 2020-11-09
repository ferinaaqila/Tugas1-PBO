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
import java.util.Scanner;
public class MainTugas1 {

  public static void main(String[] args) {
   String mhsNama, mhsNIM, mhsAlamat;
   int uts,uas; 
   char pilih;
   mahasiswa mhs = new mahasiswa();
   Scanner sc= new Scanner(System.in);
   do{
      System.out.println("MASUKAN DATA");sc.nextLine();
      System.out.print("Masukan Nama\t:");mhsNama=sc.nextLine();
      System.out.print("Masukan NIM\t:");mhsNIM=sc.nextLine();
      System.out.print("Masukan Alamat\t:");mhsAlamat=sc.nextLine();
      System.out.print("Masukan Nilai UTS\t:");uts=sc.nextInt();
      System.out.print("Masukan Nilai UAS\t:");uas=sc.nextInt();
      mhs.setNama(mhsNama);
      mhs.setNim(mhsNIM);
      mhs.setAlamat(mhsAlamat);
      mhs.setUts(uts);
      mhs.setUas(uas);
      do{
       System.out.println("MENU");
       System.out.println("1. Lihat detail data");
       System.out.println("2. Edit data");
       System.out.println("Pilih :");
       pilih=sc.next().charAt(0);
       if(pilih=='1'){
         mhs.printDataMhs();
         System.out.println("Back to Menu(y/n)");pilih=sc.next().charAt(0);
       } 
      }while(pilih=='y'||pilih=='Y');
   }while(pilih=='2');
  }
}
