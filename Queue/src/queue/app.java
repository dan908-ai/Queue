/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        cQueue queue = new cQueue();

        while (true) {
            System.out.println("=== Menu Antrian Pembelian Barang ===");
            System.out.println("1. Tambah Barang ke Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. menghapus barang awal");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan nama barang: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlah = Integer.parseInt(input.nextLine());
                    Barang barang = new Barang(nama, jumlah);
                    queue.tambahBarang(barang);
                    break;

                case "2":
                    queue.tampilkanAntrian();
                    break;

                case "3":
                    queue.prosesBarang();
                    break;

                case "4":
                    System.out.println("Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.\n");
            }
        }
    }
}

    
    
