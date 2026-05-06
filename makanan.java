public class makanan extends Produk {
     private String kedaluwarsa;
    private String kategori;

    public makanan(String nama, double harga, int stok, String kedaluwarsa, String kategori) {
        super(nama, harga, stok);
        this.kedaluwarsa = kedaluwarsa;
        this.kategori = kategori;
    }


}
