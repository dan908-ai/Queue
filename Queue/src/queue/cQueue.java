package queue;
import java.util.LinkedList;
import java.util.Queue;
public class cQueue {
    
    private Queue<Barang> antrian;

    public cQueue() {
        antrian = new LinkedList<>();
    }

    public void tambahBarang(Barang barang) {
        antrian.add(barang);
        System.out.println("Barang '" + barang.getNama() + "' berhasil ditambahkan ke antrian.\n");
    }

    public void tampilkanAntrian() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.\n");
        } else {
            System.out.println("Daftar Antrian Pembelian:");
            int i = 1;
            for (Barang barang : antrian) {
                System.out.println(i + ". " + barang);
                i++;
            }
            System.out.println();
        }
    }

    public void prosesBarang() {
        if (antrian.isEmpty()) {
            System.out.println("Tidak ada barang untuk diproses. Antrian kosong.\n");
        } else {
            Barang barang = antrian.poll();
            System.out.println("Memproses barang: " + barang.getNama() + " (Jumlah: " + barang.getJumlah() + ")\n");
        }
    }
}
