public class makanan extends Produk {
     private String kedaluwarsa;
    private String kategori;

    public makanan(String nama, double harga, int stok, String kedaluwarsa, String kategori) {
        super(nama, harga, stok);
        this.kedaluwarsa = kedaluwarsa;
        this.kategori = kategori;
    }
     public String getKedaluwarsa() {
        return kedaluwarsa;
    }

    public String getKategori() {
        return kategori;
    }
        @Override
    public void tampilinfo() {
        System.out.println("[MAKANAN]");
        System.out.println("Nama        : " + getnama());
        System.out.println("Kategori    : " + kategori);
        System.out.println("Kedaluwarsa : " + kedaluwarsa);
        System.out.println("----------");
    }
     public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 10) {
            return hitungTotalHarga(jumlahBeli) * 0.05;
        }
        return 0;
    }
public double hitungDiskon(int jumlahBeli, double persenDiskon) {
        return hitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
    }

    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10;
    }


}
