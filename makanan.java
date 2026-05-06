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
        System.out.println("Nama        : " + getNama());
        System.out.println("Kategori    : " + kategori);
        System.out.println("Kedaluwarsa : " + kedaluwarsa);
        System.out.println("----------");
    }


}
