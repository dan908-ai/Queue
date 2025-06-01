package queue;
public class Barang { 
    private String nama;
    private int jumlah;

    public Barang(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public String toString() {
        return nama + " (Jumlah: " + jumlah + ")";
    }
}

