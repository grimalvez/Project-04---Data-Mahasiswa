package datamahasiswa;

import java.util.*;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;


public class Class {
Scanner input = new Scanner(System.in);
ArrayList<String> listNim = new ArrayList<>();
ArrayList<String> listName = new ArrayList<>();
ArrayList<Date> listTglLahir = new ArrayList<>();
ArrayList<Integer> listGender = new ArrayList<>();

 
void tambahData(){
    System.out.println("");
    System.out.println("--  Tambah Data  --");
    System.out.println("Masukkan NIM :");
    String nim = input.nextLine();
    listNim.add(nim);
    System.out.println("Masukkan Nama :");
    String name = input.nextLine();
    listName.add(name);
    
    System.out.println("Tanggal Lahir(dd-mm-yyyy)");
    System.out.println("Masukkan Tanggal : ");
    int tgl = input.nextInt();
    System.out.println("Bulan");
    int bln = input.nextInt();
    System.out.println("Tahun");
    int thn = input.nextInt();
    Date date = new GregorianCalendar(thn, bln - 1, tgl).getTime();
    listTglLahir.add(date);
    
    System.out.println("Pilih Jenis Kelamin :");
    System.out.println("1. Perempuan");
    System.out.println("2. Laki - Laki");
    int a = 0;
    while(a < 1){
        int gender = input.nextInt();
        if(gender == 1 || gender == 2){
            listGender.add(gender);
            break;
        } else{
            System.out.println("Pilih nomer 1 atau 2 !");
        }
    }
    System.out.println("");
    
}

void hapusData(){
    boolean exist = false;
    System.out.println("");
    System.out.println("------ Hapus Data ------");
    System.out.println("Masukkan NIM Yang Ingin Dihapus: ");
    String hapus = input.nextLine();
    for(int n=0 ; n < listNim.size() ; n++){
        if(listNim.get(n) == hapus){
            exist=true;
            listNim.remove(n);
            listName.remove(n);
            listTglLahir.remove(n);
            listGender.remove(n);
            System.out.println("Data " + hapus + " telah terhapus.");
        }
    }
}

void cariData(){
    System.out.println("");
    System.out.println("------ Cari data ------");
    System.out.println("Cari data berdasarkan : ");
    System.out.println("1. NIM");
    System.out.println("2. Jenis Kelamin");
    int pilih = input.nextInt();
        switch(pilih){
            case 1:
                input.nextLine();
                System.out.print("  Masukkan NIM : ");
                String x = input.nextLine();
                for(String n: listNim){
                    if(listNim.contains(x)){
                        int index = listNim.indexOf(x);
                        String jenisKel = (listGender.get(index) == 0) ? "Perempuan" : "Laki-laki";
                        System.out.println("");
                        System.out.println("NIM : " + listNim.get(index));
                        System.out.println("Nama : " + listName.get(index));
                        System.out.println("Tanggal Lahir : " + listTglLahir.get(index));
                        System.out.println("Gender : " + jenisKel);
                        System.out.println("");
                        break;
                    }
                }
                break;
            case 2:
                input.nextLine();
                System.out.print("  Masukkan Gender(0:Perempuan 1:Laki-laki):");
                int y = input.nextInt();
                for(int n = 0; n < listGender.size(); n++){
                    if(listGender.get(n) == y){
                        String jenisKel = (listGender.get(n) == 0) ? "Perempuan" : "Laki-laki";
                        System.out.println("");
                        System.out.println("Data Berdasarkan Gender");
                        System.out.println("NIM : " + this.listNim.get(n));
                        System.out.println("Nama : " + this.listName.get(n));
                        System.out.println("Tanggal Lahir : " + listTglLahir.get(n));
                        System.out.println("Gender : " + jenisKel);
                        System.out.println("");
                    }
                };
                break;
        }
}

void tampilkanData(){
    System.out.println("");
    System.out.println(" ------ Informasi Data Mahasiswa ------");
    for(int n = 0; n < listNim.size(); n++){
        System.out.println("------------------------------------------");
        System.out.println("                Data " + (n + 1));
        System.out.println("------------------------------------------");
        System.out.println("NIM : " + listNim.get(n));
        System.out.println("Nama : " + listName.get(n));
        System.out.println("Tanggal Lahir : " + listTglLahir.get(n));
        String x;
        if(listGender.get(n) == 1){
            x = "Perempuan";
        } else{ x = "Laki - Laki";}
        System.out.println("Jenis Kelamin : " + x);
    }
    if(listNim.size() < 1){
        System.out.println("##Belum ada data yang terdaftar##");
    }
    System.out.println("");
}

}
