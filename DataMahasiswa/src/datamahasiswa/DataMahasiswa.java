package datamahasiswa;

import java.util.Scanner;
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int l = 0;
        Scanner input = new Scanner(System.in);
        Class cls = new Class();
        while(l < 1){
            System.out.println("------------------------------------------");
            System.out.println("               Data Mahasiswa ");
            System.out.println("------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Tampilkan Data");
            System.out.println("Pilih Menu :");
            int pilihMenu = input.nextInt();
            switch(pilihMenu){
                case 1:
                    cls.tambahData();
                    continue;
                case 2:
                    cls.hapusData();
                    continue;
                case 3:
                    cls.cariData();
                    continue;
                case 4:
                    cls.tampilkanData();
                    continue;
            }
        }
    }
    
}
