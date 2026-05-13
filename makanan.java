 class makanan extends Produk {
   private int kadaluarsa;

    public Makanan(String nama, double harga, int stok, int kadaluarsa) {
        super(nama, harga, stok);
        this.kadaluarsa = kadaluarsa;
    }
}
